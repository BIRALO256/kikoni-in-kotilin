package com.example.kikoninkotilin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val username = intent.getStringExtra("username")
        val textView= findViewById<TextView>(R.id.tvoffer)
        val message = "$username , you will get free wifi here "
        textView.text =message
    }
}