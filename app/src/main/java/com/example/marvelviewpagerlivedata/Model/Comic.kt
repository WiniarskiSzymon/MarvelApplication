package com.example.marvelviewpagerlivedata.Model


@Entity(tableName = "comics")
data class Comic(
    val name : String,
    val price : String,
    val characters : String,
    val thumbnail: String)