package com.example.marvelviewpagerlivedata.Model

import com.squareup.moshi.Json


data class Item(
    @Json(name = "name")
    val name: String,
    @Json(name = "resourceURI")
    val resourceURI: String
)