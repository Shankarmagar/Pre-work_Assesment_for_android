package com.example.pre_workkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val s = findViewById<TextView>(R.id.textView)
            val p = findViewById<EditText>(R.id.editTextTextPersonName).text
            val q = "Hello!! " + p + " .Welcome to my app. "
            s.setText(q)
        }
    }
}