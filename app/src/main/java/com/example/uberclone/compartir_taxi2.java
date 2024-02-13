package com.example.uberclone;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.uberclone.databinding.ActivityCompartirTaxi2Binding;
import com.google.android.material.snackbar.Snackbar;

public class compartir_taxi2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityCompartirTaxi2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_compartir_taxi2);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}