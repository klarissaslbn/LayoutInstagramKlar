package com.example.layoutinstagramklar

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_edit_profile)

        val edtName = findViewById<EditText>(R.id.edtName)
        val edtBio = findViewById<EditText>(R.id.edtBio)
        val btnSave = findViewById<Button>(R.id.btnSave)

        // Menampilkan data lama
        edtName.setText(intent.getStringExtra("name"))
        edtBio.setText(intent.getStringExtra("bio"))

        btnSave.setOnClickListener {

            val newName = edtName.text.toString()
            val newBio = edtBio.text.toString()

            val resultIntent = Intent()

            resultIntent.putExtra("name", newName)
            resultIntent.putExtra("bio", newBio)

            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }
    }
}