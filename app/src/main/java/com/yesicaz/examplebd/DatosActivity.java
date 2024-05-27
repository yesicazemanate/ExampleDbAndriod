package com.yesicaz.examplebd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.yesicaz.examplebd.model.ManagerBd;

public class DatosActivity extends AppCompatActivity {
    ManagerBd managerBd;
Button botonDatos;
EditText codigoDato, nombreDato, apellidoDato,edadDato, correoDato, telefonoDato;
String codigo, nombre, apellido, edad, correo, telefono;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        codigoDato = findViewById(R.id.codigoDato);
    nombreDato = findViewById(R.id.nombreDato);
    apellidoDato = findViewById(R.id.apellidoDato);
    edadDato = findViewById(R.id.edadDato);
    correoDato = findViewById(R.id.correoDato);
    telefonoDato = findViewById(R.id.telefonoDato);
    botonDatos = findViewById(R.id.btInsertDato);
    managerBd = new ManagerBd(DatosActivity.this);
    botonDatos.setOnClickListener(v -> {
        codigo= codigoDato.getText().toString();
        nombre= nombreDato.getText().toString();
        apellido= apellidoDato.getText().toString();
        edad= edadDato.getText().toString();
       // int edadnew = Integer.parseInt(edad)
        correo= correoDato.getText().toString();
        telefono= telefonoDato.getText().toString();
        long result2= managerBd.insertDatos2(codigo, nombre,apellido, edad,correo,telefono);

        if(result2 <0){
            Toast.makeText(DatosActivity.this, "Datos no insertados", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(DatosActivity.this, "datos insertados", Toast.LENGTH_SHORT).show();
        }
    });

    }
}