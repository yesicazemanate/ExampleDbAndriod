package com.yesicaz.examplebd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.yesicaz.examplebd.controller.MainActivity;
import com.yesicaz.examplebd.model.ManagerBd;

public class CuidadActivity extends AppCompatActivity {
Button botonCuidad;
ManagerBd managerBd;
EditText codigoCiudad, nombreCuidad;
String codigo, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuidad);
        botonCuidad= findViewById(R.id.btInsertCuidad);
        codigoCiudad= findViewById(R.id.codigoCiudad);
        nombreCuidad= findViewById(R.id.nombreCiudad);
        managerBd = new ManagerBd(CuidadActivity.this);

        botonCuidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                codigo= codigoCiudad.getText().toString();
                nombre = nombreCuidad.getText().toString();
                long result= managerBd.insertDatos(codigo, nombre);

                if(result <0){
                    Toast.makeText(CuidadActivity.this, "Datos no insertados", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(CuidadActivity.this, "datos insertados", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}