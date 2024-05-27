package com.yesicaz.examplebd.controller;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.yesicaz.examplebd.R;
import com.yesicaz.examplebd.model.BdHelper;
import com.yesicaz.examplebd.model.ManagerBd;

public class MainActivity extends AppCompatActivity {
// instanciar y declarar mi clase conexion
    // hay dos modos de llamar la base de datos lectura y escritura;
ManagerBd managerBd;
SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hago llamado a la conexion
        managerBd = new ManagerBd(MainActivity.this);

    }

}