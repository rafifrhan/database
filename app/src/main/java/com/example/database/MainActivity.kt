package com.example.database

import android.content.ContentValues
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helper = db_helper(applicationContext)
        var db = helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM pengguna", null)

        if(rs.moveToNext())
            Toast.makeText(applicationContext, "data no 1: "+rs.getString(1), Toast.LENGTH_LONG).show()
        val btn = findViewById<Button>(R.id.button1)
        val edtext1 = findViewById<EditText>(R.id.editText1)
        val edtext2 = findViewById<EditText>(R.id.editText2)
        btn.setOnClickListener{
            var cv = ContentValues()
            cv.put("nama_pengguna",edtext1.text.toString())
            cv.put("password",edtext2.text.toString())
            db.insert("pengguna",null, cv)
            Toast.makeText(applicationContext, "berhasil menambahkan data", Toast.LENGTH_LONG).show()
        }

    }
}