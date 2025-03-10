package com.example.daftarteman

import androidx.annotation.DrawableRes

data class Friend(
    val id: Int,
    val name: String,
    val email: String,
    val address: String,
    @DrawableRes val photoResId: Int // ID gambar dari drawable
)