package com.example.marvelviewpagerlivedata.Model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "comics")
data class Comic(
    @PrimaryKey val comicId : Int,
    val name : String,
    val price : String,
    val characters : String,
    val thumbnail: String)