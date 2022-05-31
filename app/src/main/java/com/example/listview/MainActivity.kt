package com.example.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter : ArrayAdapter<*>
        val personas = mutableListOf("Carlos","Jose","Laura","Diego","Jimena","Maria","Pedro")
        val lvDatos = findViewById<ListView>(R.id.lv_Datos)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,personas)
        lvDatos.adapter = arrayAdapter

        lvDatos.setOnItemClickListener(){parent,view,position,id ->

            Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show()
        }

    }
}