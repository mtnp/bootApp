package com.example.dogglers;

import android.app.Activity;
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.const.Layout
import com.example.dogglers.databinding.ActivityBootItemBinding


class BootItemActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBootItemBinding
    private lateinit var cartIntent: Intent
    private var bootImage : ImageView ?= null
    private var bootNameView: TextView ?= null
    private var bootName: String ?= null
    private var miniSet : IntArray ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBootItemBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_boot_item)

//      get list data from intent
        bootImage = findViewById(R.id.image)
        miniSet = intent.getIntArrayExtra("MiniSet")
        bootImage?.setImageResource(miniSet!![0])

        bootNameView = findViewById(R.id.name)
        bootName = intent.getStringExtra("BootName")
        bootNameView!!.text = intent.getStringExtra("BootName")



        var base : ImageView = findViewById(R.id.mini_base)
        base.setImageResource(miniSet!![0])

        var one : ImageView = findViewById(R.id.mini_one)
        one.setImageResource(miniSet!![1])

        var two : ImageView = findViewById(R.id.mini_two)
        two.setImageResource(miniSet!![2])

        var three : ImageView = findViewById(R.id.mini_three)
        three.setImageResource(miniSet!![3])

        var minis = arrayOf(base, one, two, three)

        for(mini in minis){
            mini.setOnClickListener{
                miniClicked(mini)
            }
        }

        val cartButton: Button = findViewById(R.id.cart_btn)
        cartButton.setOnClickListener{
            cartIntent = Intent(this, ViewCartActivity::class.java)
            cartIntent.putExtra("BootName", bootName)
            cartIntent.putExtra("MiniSet", miniSet)
            startActivity(cartIntent)
        }
    }

    fun miniClicked(view : ImageView){
        when(view.id){
            R.id.mini_base -> bootImage?.setImageResource(miniSet!![0])

            R.id.mini_one -> bootImage?.setImageResource(miniSet!![1])

            R.id.mini_two -> bootImage?.setImageResource(miniSet!![2])

            R.id.mini_three -> bootImage?.setImageResource(miniSet!![3])
        }
    }

}
