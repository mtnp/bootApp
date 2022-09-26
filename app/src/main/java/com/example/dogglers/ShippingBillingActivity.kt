package com.example.dogglers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShippingBillingActivity : AppCompatActivity(){

    private var street: TextView ?= null
    private var city: TextView ?= null
    private var state: TextView ?= null
    private var zip: TextView ?= null
    private lateinit var shippingIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shipping_billing)

        street = findViewById(R.id.street_address)
        city = findViewById(R.id.city)
        state = findViewById(R.id.state)
        zip = findViewById(R.id.zip)


        val contButton : Button ?= findViewById(R.id.confirm_button)
        contButton?.setOnClickListener{
            shippingIntent = Intent(this, ConfirmationActivity::class.java)
            shippingIntent.putExtra("street", street!!.text.toString())
            shippingIntent.putExtra("city", city!!.text.toString())
            shippingIntent.putExtra("state", state!!.text.toString())
            shippingIntent.putExtra("zip", zip!!.text.toString())

            startActivity(shippingIntent)
        }
    }
}