package com.example.belajarintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //button explisit without data
        val btn_explisit: Button = findViewById(R.id.btn_explisit)
        btn_explisit.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        //button explisit with data
        val btn_explisit_withdata:Button = findViewById(R.id.btn_explisit_withdata)
        btn_explisit_withdata.setOnClickListener {
            val intent = Intent(this,SecondActivityWithData::class.java)
            intent.putExtra("name_package2","Second Activity Lagi")
            startActivity(intent)
        }

        //button implisit to open browser with url
        val btn_implisit:Button = findViewById(R.id.btn_implisit)
        btn_implisit.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://wongmantap.com"))
            if (intent.resolveActivity(packageManager) != null){
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"Tidak Ada Aplikasi yang Support", Toast.LENGTH_SHORT).show()
            }
        }
    }
}