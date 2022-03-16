package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<Button>(R.id.but)
        a.setOnClickListener {
            val value = findViewById<EditText>(R.id.te)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(value.text.toString()))
            startActivity(intent)
        }
    }
}