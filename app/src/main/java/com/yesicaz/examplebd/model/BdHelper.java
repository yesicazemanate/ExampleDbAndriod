package com.yesicaz.examplebd.model;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BdHelper  extends SQLiteOpenHelper{

    public BdHelper(@Nullable Context context) {
        super(context, Constantes.NOM_BD, null, Constantes.VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // aqui se esta corriendo la constante para crear la base de datos
        db.execSQL(Constantes.SENTENCIATABLA);
        db.execSQL(Constantes.SENTENCIATABLA2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
