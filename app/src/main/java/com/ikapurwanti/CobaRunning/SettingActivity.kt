package com.ikapurwanti.CobaRunning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val pindah = findViewById<ImageView>(R.id.icBack)
        pindah.setOnClickListener{
            val a = Intent(this, ProfileActivity::class.java)
            startActivity(a)
        }
    }
}