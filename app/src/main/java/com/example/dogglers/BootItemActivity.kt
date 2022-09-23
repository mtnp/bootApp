package com.example.dogglers;

import android.app.Activity;
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.const.Layout
import com.example.dogglers.databinding.ActivityBootItemBinding


class BootItemActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBootItemBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBootItemBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_boot_item)
    }
}
