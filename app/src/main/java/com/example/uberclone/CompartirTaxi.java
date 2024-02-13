package com.example.uberclone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.uberclone.databinding.ActivityCompartirTaxiBinding;

public class CompartirTaxi extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityCompartirTaxiBinding binding;
    private Button btnCancelCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartir_taxi); // Asegúrate de que este sea el nombre correcto de tu layout XML

        // Configuración de los elementos de UI y las acciones
        Button btnCancelCompartir = findViewById(R.id.btnCancelCompartir);
        btnCancelCompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes realizar las acciones cuando se hace clic en el botón de cancelar
            }
        });

        // Aquí puedes configurar cualquier otra acción o elemento de UI que necesites
    }


    @Override
    public boolean onSupportNavigateUp() {
        // Elimina o comenta este método si no estás utilizando Navigation
        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_compartir_taxi);
        //return NavigationUI.navigateUp(navController, appBarConfiguration)
        //        || super.onSupportNavigateUp();

        return super.onSupportNavigateUp(); // Retorna la superclase para evitar cierres inesperados
    }

}
