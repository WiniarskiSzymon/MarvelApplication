package com.example.marvelviewpagerlivedata.Model

import com.squareup.moshi.Json


data class ItemXX(
    @Json(name = "name")
    val name: String,
    @Json(name = "resourceURI")
    val resourceURI: String,
    @Json(name = "role")
    val role: String
)