package com.example.layoutinstagramklar

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val editButton = findViewById<Button>(R.id.btnEdit)
        val shareButton = findViewById<Button>(R.id.btnShare)

        editButton.setOnClickListener {
            Toast.makeText(
                this,
                "Edit Profile dipilih",
                Toast.LENGTH_SHORT
            ).show()
        }

        shareButton.setOnClickListener {
            Toast.makeText(
                this,
                "Profile berhasil dibagikan",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}