package com.example.englishvocabulary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnPay(view: View) {
        val btnPay = findViewById<Button>(R.id.btnPay)
        btnPay.setOnClickListener {
            val i = Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(i)
        }
    }
}
