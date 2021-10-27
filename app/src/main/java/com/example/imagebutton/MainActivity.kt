package com.geeksforgeeks.myfirstkotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.Num1)
        val num2 = findViewById<EditText>(R.id.Num2)
        val imgbtn = findViewById<ImageButton>(R.id.imageBtn)
        imgbtn.setOnClickListener {
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext,
                    "Enter both numbers", Toast.LENGTH_SHORT).show()
            }
            else {
                val num1 = Integer.parseInt(num1.text.toString())
                val num2 = Integer.parseInt(num2.text.toString())
                Toast.makeText(applicationContext,
                    "Sum of the numbers = " + (num1 + num2),
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}
