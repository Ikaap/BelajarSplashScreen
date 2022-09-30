package com.ikapurwanti.CobaRunning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val pindah = findViewById<Button>(R.id.btnKeluar)
        pindah.setOnClickListener{
            val a = Intent(this, MainActivity::class.java)
            startActivity(a)
        }
        val pindah1 = findViewById<ImageView>(R.id.icSetting)
        pindah1.setOnClickListener{
            val a = Intent(this, SettingActivity::class.java)
            startActivity(a)
        }
    }

}