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
package com.example.dogglers.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.BootItemActivity
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */

class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    private lateinit var listIntent: Intent

    // gets the monster data
    val data = DataSource.boots

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(val view: View): RecyclerView.ViewHolder(view) {

        // initializes the list of monsters to view
        val bootImage : ImageView = view.findViewById(R.id.image)
        val name : TextView = view.findViewById(R.id.name)
        val leather : TextView = view.findViewById(R.id.leather)
        val price : TextView = view.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {


        // sets the layout type based on user choosing grid, vertical, or horizontal
        val layoutView = when(layout){
            Layout.GRID -> {
                LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            }
            else -> {
                LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
            }
        }
        return DogCardViewHolder(layoutView)
    }

    // returns the number of monsters in the list
    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {

        val resources = context?.resources

        // gets the monster data from the list and sets the data to the monster card
        val bootCard = data[position]
        holder.bootImage.setImageResource(bootCard.imageResourceId)
        holder.bootImage.setOnClickListener{
            val context = holder.view.context
            listIntent = Intent(context, BootItemActivity::class.java)
            listIntent.putExtra("BootName",bootCard.name)

            listIntent.putExtra("MiniSet", bootCard.miniSet)
            context.startActivity(listIntent)
        }
        holder.name.text = bootCard.name
        // Includes monster's flagship introduction and its abilities for context
        holder.leather.text = resources?.getString(R.string.leather, bootCard.leather)
        holder.price.text = resources?.getString(R.string.price, bootCard.price)

    }
}
