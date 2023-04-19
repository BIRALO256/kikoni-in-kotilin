package com.example.kikoninkotilin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetings = findViewById<TextView>(R.id.hellomessage)
        val inputfield =findViewById<EditText>(R.id.name)
        val submit =findViewById<Button>(R.id.submit)
        val next =findViewById<Button>(R.id.next)
        var entername =""

        submit.setOnClickListener {
                 entername = inputfield.text.toString()
                if(entername ==""){
                    next.visibility= INVISIBLE
                    greetings.text=""
                    Toast.makeText(applicationContext,"please,enter your name!",Toast.LENGTH_SHORT).show()
                }else {
                    val message = " welcome $entername"
                    greetings.text = message
                    inputfield.text.clear()
                    next.visibility= VISIBLE
                }
        }
        next.setOnClickListener {
           val nextline = Intent(this,secondActivity::class.java)
            nextline.putExtra("", entername );
           startActivity(nextline)

        }
    }

}