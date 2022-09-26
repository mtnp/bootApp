package com.example.dogglers

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewCartActivity : AppCompatActivity(){
    private var bootImage : ImageView?= null
    private var bootNameView: TextView?= null
    private var bootName: String ?= null
    private var miniSet : IntArray ?= null
    private lateinit var shippingIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_cart)

        bootImage = findViewById(R.id.image)
        bootNameView = findViewById(R.id.name)
        bootName = intent.getStringExtra("BootName")
        miniSet = intent.getIntArrayExtra("MiniSet")

        bootNameView!!.text = bootName
        bootImage!!.setImageResource(miniSet!![0])

        val checkoutButton : Button = findViewById(R.id.checkout_button)
        checkoutButton.setOnClickListener{
            shippingIntent = Intent(this, ShippingBillingActivity::class.java)
            startActivity(shippingIntent)
        }
    }
}