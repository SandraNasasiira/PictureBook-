package com.example.pictorialapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Style3 : AppCompatActivity() {
    lateinit var btnnxt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style3)
        btnnxt =findViewById(R.id.bntNext)
        btnnxt.setOnClickListener{
            var intent= Intent(baseContext,Styles4::class.java)
            startActivity(intent)
    }
}
}