package com.example.my_2nd_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark= findViewById<Button>(R.id.btnDark)
        val buttonLight= findViewById<Button>(R.id.btnLight)
        val buttonRead= findViewById<Button>(R.id.btnRead)
        val layout= findViewById<LinearLayout>(R.id.linearLayout)

        buttonDark.setOnClickListener {
            //Change Theme to Dark mode
            layout.setBackgroundResource(R.color.black)
        }

        buttonLight.setOnClickListener {
            //Change Theme to Read mode
            layout.setBackgroundResource(R.color.white)
        }

        buttonRead.setOnClickListener {
            //Change Theme to Read mode
            layout.setBackgroundResource(R.color.yellow)
        }


    }
}