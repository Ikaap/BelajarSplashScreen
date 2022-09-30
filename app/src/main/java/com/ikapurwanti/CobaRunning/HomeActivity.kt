package com.ikapurwanti.CobaRunning

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val pindah = findViewById<ImageView>(R.id.ivprofile)
        pindah.setOnClickListener(){
            val a = Intent(this,ProfileActivity::class.java)
            startActivity(a)
        }
    }
}
