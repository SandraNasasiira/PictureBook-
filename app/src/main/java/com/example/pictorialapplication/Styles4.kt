package com.example.pictorialapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Styles4 : AppCompatActivity() {
    lateinit var btNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_styles4)
        btNext4=findViewById(R.id.bntNext)
        btNext4.setOnClickListener{
            var intent= Intent(baseContext,styles5::class.java)
            startActivity(intent)
    }
}
}