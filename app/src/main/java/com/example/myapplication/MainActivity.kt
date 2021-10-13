package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
        texViewCounter.text = count.toString()
    }

    fun newGreeting(view: android.view.View) {
        //Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()
        val greetings: Array<String> = resources.getStringArray(R.array.greetings_array)
        val greeting = greetings[Random.nextInt(0, greetings.size -1)]
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = greeting
    }

    fun increaseCounter(view: android.view.View) {
        count++
        val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
        texViewCounter.text = count.toString()
        Toast.makeText(applicationContext,"Increase",Toast.LENGTH_SHORT).show()
    }
    fun decreaseCounter(view: android.view.View) {
        count--
        val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
        texViewCounter.text = count.toString()
        Toast.makeText(applicationContext,"Decrease",Toast.LENGTH_SHORT).show()
    }
}