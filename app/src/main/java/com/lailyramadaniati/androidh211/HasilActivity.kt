package com.lailyramadaniati.androidh211

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val noHandphone = intent.getStringExtra("noHandphone")
        val jarak = intent.getIntExtra("jarak", 0)
        val tanggalLahir = intent.getStringExtra("tanggalLahir")

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val noHandphoneTextView = findViewById<TextView>(R.id.handphoneTextView)
        val jarakTextView = findViewById<TextView>(R.id.JarakTextView)
        val tanggalLahirTextView = findViewById<TextView>(R.id.TanggalLahirTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        noHandphoneTextView.setText(noHandphone)
        jarakTextView.setText(jarak.toString())
        tanggalLahirTextView.setText(tanggalLahir)
    }
}