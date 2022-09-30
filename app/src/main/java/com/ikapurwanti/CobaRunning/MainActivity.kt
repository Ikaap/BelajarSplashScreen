package com.ikapurwanti.CobaRunning

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pindah = findViewById<Button>(R.id.btnLogin)
        pindah.setOnClickListener {
            val a = Intent(this,HomeActivity::class.java)
            startActivity(a)
        }

        val pindah1 = findViewById<TextView>(R.id.tvDaftar)
        pindah1.setOnClickListener {
            val a = Intent(this, RegisterActivity::class.java)
            startActivity(a)
        }

    }
}