package com.example.belajarintent

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivityWithData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_with_data)

        //get data from main activity
        val textView: TextView = findViewById(R.id.textSecondActivityWithData)
        if (intent.hasExtra("name_package")){
            textView.text = intent.getStringExtra("name_package")
        }else{
            Toast.makeText(applicationContext,"Tidak Ada Data", Toast.LENGTH_SHORT).show()
        }
    }
}