package com.example.a1stactivitylayouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    val options = arrayOf("Male", "Female")
    val options2 = arrayOf("Single", "Married")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,options)

        spinner2.adapter = arrayAdapter
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext,options[p2],Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter1 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,options2)

        spinner.adapter = arrayAdapter1
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext,options2[p2], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }
}