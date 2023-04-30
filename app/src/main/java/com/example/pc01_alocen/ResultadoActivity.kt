package com.example.pc01_alocen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val valor1 = intent.getStringExtra("valor1")
        val valor2 = intent.getStringExtra("valor2")

        val tvRSuma: TextView = findViewById(R.id.tvRSuma)
        val tvRResta: TextView = findViewById(R.id.tvRResta)
        val tvRMulti: TextView = findViewById(R.id.tvRMulti)
        val tvRDivi: TextView = findViewById(R.id.tvRDivi)

        val resultadoSuma = valor1.toString().toFloat() + valor2.toString().toFloat()
        val resultadoResta = valor1.toString().toFloat() - valor2.toString().toFloat()
        val resultadoMulti = valor1.toString().toFloat() * valor2.toString().toFloat()
        val resultadoDivi = valor1.toString().toFloat() / valor2.toString().toFloat()

        tvRSuma.text = resultadoSuma.toString()
        tvRResta.text = resultadoResta.toString()
        tvRMulti.text = resultadoMulti.toString()
        if (resultadoDivi.isNaN() || resultadoDivi.isInfinite()) {
            tvRDivi.text = "-"
        }else{
            tvRDivi.text = resultadoDivi.toString()
        }

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}