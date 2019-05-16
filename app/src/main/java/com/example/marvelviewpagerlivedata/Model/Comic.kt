package com.example.marvelviewpagerlivedata.Model

import androidx.room.Entity


//@Entity(tableName = "comics")
data class Comic(
    val name : String,
    val price : String,
    val characters : String,
    val thumbnail: String)