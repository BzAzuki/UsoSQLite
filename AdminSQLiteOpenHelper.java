package com.example.samaro.usosqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Samaro on 26/05/2016.
 */
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //creamos la tabla
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table votantes(dni integer primary key, nombre text, colegio text, nromesa integer)");
    }

    //borrar la tabla y crear la nueva tabla
    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnte, int versionNue) {
        db.execSQL("drop table if exists votantes");
        db.execSQL("create table votantes(dni integer primary key, nombre text, colegio text, nromesa integer)");
    }
}
