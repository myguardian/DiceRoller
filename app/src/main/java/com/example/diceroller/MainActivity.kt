
/*
Vlad Voytenko
ID: 45654645645
2020 - 09 - 15
This program ...
*/


package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.android.diceroller.R

class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG = "DiceRoller"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }


    private fun rollDice() {
        Log.d(TAG, "rollDice() called")
        Toast.makeText(this, getString(R.string.die_rolled), Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()
        Log.d(TAG, "randomInt = $randomInt")
        val resultText: TextView = findViewById(R.id.result_text)
       resultText.text = randomInt.toString()
    }


}