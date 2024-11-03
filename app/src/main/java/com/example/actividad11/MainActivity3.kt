package com.example.actividad11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val editTextNom = findViewById<EditText>(R.id.editTextText)
        val editTextCognom = findViewById<EditText>(R.id.editTextText2)
        val editNumberEdat = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTextUsuari = findViewById<EditText>(R.id.editTextText4)
        val passwordAuthentication = findViewById<EditText>(R.id.editTextTextPassword)
        val editPhoneTelefon = findViewById<EditText>(R.id.editTextPhone)
        val editEmailCorreu = findViewById<EditText>(R.id.editTextTextEmailAddress)

        val button = findViewById<Button>(R.id.button)

        val genere = findViewById<RadioGroup>(R.id.radioGroup)

        val button2 = findViewById<Button>(R.id.button6)
        val button3 = findViewById<Button>(R.id.button7)



        button.setOnClickListener {

            if (editTextNom.text.isNotBlank() && editTextCognom.text.isNotBlank() && editNumberEdat.text.isNotBlank() && editTextUsuari.text.isNotBlank() && passwordAuthentication.text.isNotBlank() && genere.checkedRadioButtonId != -1 && editPhoneTelefon.text.isNotBlank() && editEmailCorreu.text.isNotBlank()) {

                Toast.makeText(this, "Registro Completo", Toast.LENGTH_SHORT).show()


            } else {

                Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show()
            }

        }


        button2.setOnClickListener {
            val intent= Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }


        button3.setOnClickListener {
            val intent= Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }



    }
}