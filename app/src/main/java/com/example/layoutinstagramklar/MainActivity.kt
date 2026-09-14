package com.example.layoutinstagramklar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Launcher untuk menerima data dari EditProfileActivity
    private val editProfileLauncher =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->

            if (result.resultCode == RESULT_OK) {

                val data = result.data

                val newName = data?.getStringExtra("name")
                val newBio = data?.getStringExtra("bio")

                if (newName != null) {
                    findViewById<TextView>(R.id.txtName).text = newName
                }

                if (newBio != null) {
                    findViewById<TextView>(R.id.txtBio).text = newBio
                }
            }
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        // =========================
        // BUTTON EDIT PROFILE
        // =========================

        val btnEdit = findViewById<Button>(R.id.btnEdit)

        btnEdit.setOnClickListener {

            val intent =
                Intent(this, EditProfileActivity::class.java)

            // Mengirim nama lama
            intent.putExtra(
                "name",
                findViewById<TextView>(R.id.txtName)
                    .text.toString()
            )

            // Mengirim bio lama
            intent.putExtra(
                "bio",
                findViewById<TextView>(R.id.txtBio)
                    .text.toString()
            )

            // Membuka halaman Edit Profile
            editProfileLauncher.launch(intent)
        }


        // =========================
        // BUTTON SHARE PROFILE
        // =========================

        val shareButton =
            findViewById<Button>(R.id.btnShare)

        shareButton.setOnClickListener {

            Toast.makeText(
                this,
                "Profile berhasil dibagikan",
                Toast.LENGTH_SHORT
            ).show()
        }


        // =========================
        // FOTO PROFIL
        // =========================

        val profileImage =
            findViewById<ImageView>(R.id.profileImage)

        profileImage.setOnClickListener {

            val intent =
                Intent(this, PhotoActivity::class.java)

            // Membuka halaman PhotoActivity
            startActivity(intent)
        }
    }
}