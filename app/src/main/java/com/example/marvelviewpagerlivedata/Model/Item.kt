package com.example.marvelviewpagerlivedata.Model


data class Item(
    @Json(name = "name")
    val name: String,
    @Json(name = "resourceURI")
    val resourceURI: String
)