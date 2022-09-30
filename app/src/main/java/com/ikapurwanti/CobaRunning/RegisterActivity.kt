package com.ikapurwanti.CobaRunning

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val pindah = findViewById<Button>(R.id.btnDaftar)
        pindah.setOnClickListener{
            val a = Intent(this, MainActivity::class.java)
            startActivity(a)
        }

        val pindah1 = findViewById<TextView>(R.id.tvLogin)
        pindah1.setOnClickListener{
            val a = Intent(this, MainActivity::class.java)
            startActivity(a)
        }
    }
}