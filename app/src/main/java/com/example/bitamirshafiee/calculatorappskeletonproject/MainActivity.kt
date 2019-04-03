package com.example.bitamirshafiee.calculatorappskeletonproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operationFunctions(view: View) {
        var editText: EditText = editTxt

        when (view.id) {
            R.id.btn1 -> {
                number += "1"
                editText.setText(number)
            }
            R.id.CBtn -> {
                number = ""
                editText.setText("")
            }
            R.id.btn2 -> {
                number += "2"
                editText.setText(number)
            }
            R.id.btn3 -> {
                number += "3"
                editText.setText(number)
            }
            R.id.btn4 -> {
                number += "4"
                editText.setText(number)
            }
            R.id.btn5 -> {
                number += "5"
                editText.setText(number)
            }
            R.id.btn6 -> {
                number += "6"
                editText.setText(number)
            }
            R.id.btn7 -> {
                number += "7"
                editText.setText(number)
            }
            R.id.btn8 -> {
                number += "8"
                editText.setText(number)
            }
            R.id.btn9 -> {
                number += "9"
                editText.setText(number)
            }
            R.id.btn0 -> {
                number += "0"
                editText.setText(number)
            }
        }
    }
}

