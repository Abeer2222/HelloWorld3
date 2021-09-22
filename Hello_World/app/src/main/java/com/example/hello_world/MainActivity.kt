package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var myText: TextView
    lateinit var myButton: Button
    lateinit var myEdit: EditText
    lateinit var userInput: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.textView)
        myButton = findViewById(R.id.startbutton)
        myEdit = findViewById(R.id.editText)

        myButton.setOnClickListener(View.OnClickListener {
                userInput = myEdit.text.toString()
            myText.text = convertString(userInput)
        })

    }

    fun convertString(input:String):String{
        var output =""
        for (i in input.indices){
            if(i%2==0)
                output += input.substring(i, i + 1).uppercase()
            else
                output += input.substring(i, i + 1).lowercase()

        }
        return output
    }
    /*fun changeText() {
        myText.text = "New text"
    }*/
    /*SUM Fun
    public fun Sum(num1: Int, num2: Int) {
        val s=num1 + num2
        Log.d("MainActivity","$num1 + $num2 = $s")
    }
    */
}