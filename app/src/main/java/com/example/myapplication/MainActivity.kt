package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun newGreeting(view: android.view.View) {
        Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()
        val greetings: Array<String> = resources.getStringArray(R.array.greetings_array)
        val greeting = greetings[Random.nextInt(0, greetings.size -1)]
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = greeting
    }
}