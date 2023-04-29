package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber1: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById(R.id.edch1)
        editTextNumber2 = findViewById(R.id.edch2)
        textViewResult = findViewById(R.id.result)

    }
    fun onButtonPlusClick(view: View){
        val number1 = editTextNumber1.text.toString().toDouble()
        val number2 = editTextNumber2.text.toString().toDouble()
        var result = number1 + number2
        textViewResult.text = result.toString()
    }

    fun onButtonMinusClick(view: View){
        val number1 = editTextNumber1.text.toString().toDouble()
        val number2 = editTextNumber2.text.toString().toDouble()
        var result = number1 - number2
        textViewResult.text = result.toString()
    }

    fun onButtonMultiplyClick(view: View){
        val number1 = editTextNumber1.text.toString().toDouble()
        val number2 = editTextNumber2.text.toString().toDouble()
        var result = number1 * number2
        textViewResult.text = result.toString()
    }

    fun onButtonDivideClick(view: View){
        val number1 = editTextNumber1.text.toString().toDouble()
        val number2 = editTextNumber2.text.toString().toDouble()
        var result = number1 / number2
        textViewResult.text = result.toString()
    }
}