package com.example.pictorialapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class styles5 : AppCompatActivity() {
    lateinit var btlstbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_styles5)
        btlstbtn=findViewById(R.id.bntNext)
        btlstbtn.setOnClickListener{
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

    }
}
}