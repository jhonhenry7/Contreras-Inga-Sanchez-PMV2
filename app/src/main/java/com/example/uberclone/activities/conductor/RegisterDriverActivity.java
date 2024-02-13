package com.example.uberclone.activities.conductor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.uberclone.R;
import com.example.uberclone.activities.cliente.RegisterActivity;
import com.example.uberclone.includes.MyToolbar;
import com.example.uberclone.models.Cliente;
import com.example.uberclone.models.Conductor;
import com.example.uberclone.providers.AuthProvider;
import com.example.uberclone.providers.ClientProvider;
import com.example.uberclone.providers.DriverProvider;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterDriverActivity extends AppCompatActivity {

    AuthProvider mAuthProvider;
    DriverProvider mDriverProvider;
    //VIEWS
    Button mButtonRegister;
    TextInputEditText mtxtinputnombre, mtxtinputemail, mtxtinputpassw, mtxtinputMarca, mtxtinputplaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_driver);

        mAuthProvider = new AuthProvider();
        mDriverProvider = new DriverProvider();

        MyToolbar.show(this, "Registro de Conductor", true);

        mtxtinputnombre = findViewById(R.id.txtinputuser2);
        mtxtinputemail = findViewById(R.id.txtinputemail2);
        mtxtinputpassw = findViewById(R.id.txtinputpass2);
        mtxtinputMarca = findViewById(R.id.txtinputmarca);
        mtxtinputplaca = findViewById(R.id.txtinputplaca);

        mButtonRegister = findViewById(R.id.btnRegisterUser2);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickRegister();
            }
        });
    }

    private void clickRegister() {
        final String name = mtxtinputnombre.getText().toString();
        final String email = mtxtinputemail.getText().toString();
        final String vehicleBrand = mtxtinputMarca.getText().toString();
        final String vehiclePlate = mtxtinputplaca.getText().toString();
        final String password = mtxtinputpassw.getText().toString();

        if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty() && !vehicleBrand.isEmpty() && !vehiclePlate.isEmpty()){
            if (password.length() >= 6){
                register(name, email, password, vehicleBrand, vehiclePlate);
            }
            else {
                Toast.makeText(this, "La contraseña debe tener al menos 6 caracteres", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this, "Ingrese todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    void register(final String name, final String email, String password, String vehicleBrand, String vehiclePlate) {
        mAuthProvider.register(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    String id = FirebaseAuth.getInstance().getCurrentUser().getUid();
                    Conductor conductor = new Conductor(id, name, email, vehicleBrand, vehiclePlate);
                    create(conductor);
                }
                else {
                    Toast.makeText(RegisterDriverActivity.this, "No se pudo registrar el usuario", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    void create(Conductor conductor){
        mDriverProvider.create(conductor).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    //Toast.makeText(RegisterDriverActivity.this, "Registro Exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterDriverActivity.this, MapDriverActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }else {
                    Toast.makeText(RegisterDriverActivity.this, "No se pudo crear al cliente", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}