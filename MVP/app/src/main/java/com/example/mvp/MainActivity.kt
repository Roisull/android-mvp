package com.example.mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMainPersegiPanjang:Button = findViewById(R.id.btn_mainHtgPrsgPanjang)
        val btnMainPersegi:Button = findViewById(R.id.btn_mainHtgPrsg)

        btnMainPersegiPanjang.setOnClickListener {
            val intentPersegiPanjang = Intent(this, PersegiPanjangActivity::class.java)
            startActivity(intentPersegiPanjang)
        }

        btnMainPersegi.setOnClickListener {
            val intentPersegi = Intent(this, PersegiActivity::class.java)
            startActivity(intentPersegi)
        }
    }
}