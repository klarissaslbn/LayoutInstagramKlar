package com.example.layoutinstagramklar

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PhotoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_photo)

        val btnKembali = findViewById<Button>(R.id.btnKembali)

        btnKembali.setOnClickListener {
            finish()
        }
    }
}