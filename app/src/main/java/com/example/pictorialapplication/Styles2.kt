package com.example.pictorialapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Styles2 : AppCompatActivity() {
    lateinit var btnAnother:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_styles2)
        btnAnother=findViewById(R.id.bntNext)
        btnAnother.setOnClickListener{
            var intent= Intent(baseContext,Style3::class.java)
            startActivity(intent)
    }
}
}