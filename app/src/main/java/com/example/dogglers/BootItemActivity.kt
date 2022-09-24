package com.example.dogglers;

import android.app.Activity;
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.const.Layout
import com.example.dogglers.databinding.ActivityBootItemBinding


class BootItemActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBootItemBinding
    private lateinit var listIntent: Intent
    private var bootImage :ImageView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBootItemBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_boot_item)

//         hard typed mini images
//         TODO: get list data from intent, don't hard code
        bootImage = findViewById(R.id.image)
        var base : ImageView = findViewById(R.id.mini_base)
        var one : ImageView = findViewById(R.id.mini_one)
        var two : ImageView = findViewById(R.id.mini_two)
        var three : ImageView = findViewById(R.id.mini_three)
        var minis = arrayOf(base, one, two, three)


        for(mini in minis){
            mini.setOnClickListener{
                miniClicked(mini)
            }
        }
    }

    fun miniClicked(view : ImageView){
        when(view.id){
            R.id.mini_base -> bootImage?.setImageResource(R.drawable.chisos_no1)

            R.id.mini_one -> bootImage?.setImageResource(R.drawable.chisos_no11)

            R.id.mini_two -> bootImage?.setImageResource(R.drawable.chisos_no12)

            R.id.mini_three -> bootImage?.setImageResource(R.drawable.chisos_no13)
        }
    }

}
