package com.example.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class db_helper(context: Context) : SQLiteOpenHelper(context,"admin", null, 1 ) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE pengguna(id_pengguna INTEGER PRIMARY KEY AUTOINCREMENT, nama_pengguna varchar, password varchar)")
        db?.execSQL("INSERT INTO pengguna(nama_pengguna, password) VALUES ('Pengguna 1', 'pwd1')")
        db?.execSQL("INSERT INTO pengguna(nama_pengguna, password) VALUES ('Pengguna 2', 'pwd2')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}