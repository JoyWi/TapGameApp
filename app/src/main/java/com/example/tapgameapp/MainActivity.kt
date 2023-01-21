package com.example.tapgameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.numberTapsView)
        var counter = 0
        val button = findViewById<Button>(R.id.tapbuttonViews)

        val upgradeButton =  findViewById<Button>(R.id.upGradeBtn)
        button.setOnClickListener {
            //Log.v("TapGame", "Tap")
            counter++
            textView.text = counter.toString()

            if (counter>=100){
                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener {
                    button.text = "Add 2"

                    button.setOnClickListener {
                        counter += 2
                        textView.text = counter.toString()
                    }

                    upgradeButton.visibility = View.INVISIBLE
                }
            }
        }
    }
}