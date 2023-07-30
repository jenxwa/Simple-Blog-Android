package com.example.itstudentspool2.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BlogData(
    val title: String = "",
    val jobDescription: String = "",
    val descriptionShort: String = "",
    val description: String = "",
    val imageResId: Int? = null
) : Parcelable
