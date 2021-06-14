package com.example.pictorialapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.bntNext)
        button.setOnClickListener{
            var intent=Intent(baseContext,Styles2::class.java)
            startActivity(intent)
        }
    }
}