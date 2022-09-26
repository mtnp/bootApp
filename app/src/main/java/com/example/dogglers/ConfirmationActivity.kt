package com.example.dogglers

import SatisfactionActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity :AppCompatActivity() {

    private var endscreen: TextView?= null
    private var street: String ?= null
    private var city: String ?= null
    private var state: String ?= null
    private var zip: String ?= null
    private lateinit var rateIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        endscreen = findViewById(R.id.endscreen)
        street = intent.getStringExtra("street")
        city = intent.getStringExtra("city")
        state = intent.getStringExtra("state")
        zip = intent.getStringExtra("zip")
        val combine = "Your order will arrive at $street in $city, $state $zip"
        endscreen!!.text = combine

        val rateButton : Button = findViewById(R.id.satisfaction_button)
        rateButton.setOnClickListener{
            rateIntent = Intent(this, SatisfactionActivity::class.java)
            startActivity(rateIntent)
        }

    }
}