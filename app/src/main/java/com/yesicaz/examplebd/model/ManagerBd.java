package com.yesicaz.examplebd.model;

import android.content.ContentValues;
import android.database.ContentObservable;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
public class ManagerBd {
    // instanciar y declarar mi clase conexion
    // hay dos modos de llamar la base de datos lectura y escritura;
    SQLiteDatabase db;
    BdHelper bdHelper;

    public ManagerBd(Context context) {
        bdHelper=  new BdHelper(context);// llamo a la conexión de la base de datos
    }
    // metodo que abre el metodo en modo escritura
    public void openBdWr(){
        db= bdHelper.getWritableDatabase();
    }
    // metodo que abre mi base de datos en modo lectura
    public void openBdRd(){
        db=bdHelper.getReadableDatabase();
    }
    public long insertDatos(String cod,String nombre){
    openBdWr(); // abro la base de datos en modo escritura
        ContentValues values = new ContentValues();
        values.put("cod",cod);
        values.put("nombre", nombre);
        long result= db.insert("Ciudad",null, values );
        return result;
    }
    public long insertDatos2(String cod,String nombre,String apellido,String edad, String correo,String telefono){
        openBdWr();
        ContentValues values = new ContentValues();
        values.put("cod",cod);
        values.put("nombre", nombre);
        values.put("apellido", apellido);
        values.put("edad", edad);
        values.put("Correo", correo);
        values.put("telefono", telefono);
        long result2 = db.insert("Datos", null,values);
        return result2;
    }
}
