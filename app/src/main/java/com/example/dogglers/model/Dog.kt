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
package com.example.dogglers.model

import android.widget.ImageView
import androidx.annotation.DrawableRes

/**
 * A data class to represent the information presented in the dog card
 */

data class Boots(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val leather: String,
    val price: Double,
    val miniSet: IntArray
)
