package com.example.pc01_alocen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etValor1: EditText = findViewById(R.id.etValor1)
        val etValor2: EditText = findViewById(R.id.etValor2)
        val btnSend: Button = findViewById(R.id.btnSend)

        btnSend.setOnClickListener{
            val valor1 = etValor1.text.toString()
            val valor2 = etValor2.text.toString()

            if (valor1.isNotEmpty() && valor2.isNotEmpty() && valor1.isDigitsOnly() && valor2.isDigitsOnly()){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("valor1",valor1)
                intent.putExtra("valor2",valor2)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Ingrese números válidos", Toast.LENGTH_SHORT).show()
            }

        }
    }

}