package com.example.helloworld2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        print("Success")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            textView.text = "Button clicked!"
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            textView.setTextColor(getColor(android.R.color.holo_red_dark))
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            textView.setBackgroundColor(getColor(android.R.color.holo_blue_light))
        }


    }
}
