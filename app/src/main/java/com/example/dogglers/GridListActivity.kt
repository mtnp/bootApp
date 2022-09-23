/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.const.Layout
import com.example.dogglers.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridListBinding
    private lateinit var listIntent: Intent

//    private var bootButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

//      Launch the HorizontalListActivity on horizontalBtn click
//        bootButton = findViewById(R.id.boot_button)
//        bootButton!!.setOnClickListener { launchHorizontal() }
//        binding.boot_button.setOnClickListener { launchVertical() }


        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )

        // TODO : make changes to adapter so boot button is recognized
//        binding.bootBtn.setOnClickListener{
//            view -> handleButtonClick(view)
//            launchBootItem()
//        }

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun launchHorizontal() {
        listIntent = Intent(this, HorizontalListActivity::class.java)
        startActivity(listIntent)
    }

    fun launchBootItem(){
        listIntent = Intent(this, BootItemActivity::class.java)
        startActivity(listIntent)
    }

    fun handleButtonClick(view: View) {
        with (view as Button) {
            Log.d("TAG", "BUTTON PRESSED")
        }
    }
}
