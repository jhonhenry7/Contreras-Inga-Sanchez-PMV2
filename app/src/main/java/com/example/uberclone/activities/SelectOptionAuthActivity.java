package com.example.uberclone.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uberclone.R;
import com.example.uberclone.activities.cliente.RegisterActivity;
import com.example.uberclone.activities.conductor.RegisterDriverActivity;
import com.example.uberclone.includes.MyToolbar;

public class SelectOptionAuthActivity extends AppCompatActivity {

    SharedPreferences mPref;

    Button btngoLogin,btngoRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_auth);

        mPref = getApplicationContext().getSharedPreferences("typeUser", MODE_PRIVATE);

        btngoLogin = findViewById(R.id.btnGotoLogin);
        btngoRegis = findViewById(R.id.btnGotoRegister);

        MyToolbar.show(this, "Seleccionar Opción", true);

        btngoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLogin();
            }
        });

        btngoRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegister();
            }
        });
    }

    private void gotoRegister() {
        String typeUser = mPref.getString("user", "");
        if (typeUser.equals("cliente")){
            Intent i = new Intent(SelectOptionAuthActivity.this, RegisterActivity.class);
            startActivity(i);
        }
        else {
            Intent i = new Intent(SelectOptionAuthActivity.this, RegisterDriverActivity.class);
            startActivity(i);
        }
    }

    private void gotoLogin() {
        Intent i = new Intent(SelectOptionAuthActivity.this,LoginActivity.class);
        startActivity(i);
    }
}