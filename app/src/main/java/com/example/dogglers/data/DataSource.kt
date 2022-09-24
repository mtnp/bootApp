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
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Boots

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val boots: List<Boots> = listOf(
        Boots(
            R.drawable.yeehaw_python,
            "Yeehaw Cowboy: Python Round Toe",
            "Python",
            350.00
        ),
        Boots(
            R.drawable.rujo_davis,
            "Rujo: Davis",
            "Calfskin",
            210.00
        ),
        Boots(
            R.drawable.ariat_flyhigh,
            "Ariat: Fly High",
            "Full Grain",
            194.95
        ),
        Boots(
            R.drawable.chisos_no1,
            "Chisos: No. 1",
            "Cowhide",
            545.00
        ),
        Boots(
            R.drawable.luchesse_cliff,
            "Luchesse: Cliff",
            "Full Quill Ostrich",
            795.00
        ),
        Boots(
            R.drawable.tecovas_dillon,
            "Tecovas: Dillon",
            "Caiman Belly",
            545.00
        )

    )
}
