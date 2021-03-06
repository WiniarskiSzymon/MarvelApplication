package com.example.marvelviewpagerlivedata.Model

import com.squareup.moshi.Json


data class ItemX(
    @Json(name = "name")
    val name: String,
    @Json(name = "resourceURI")
    val resourceURI: String,
    @Json(name = "type")
    val type: String
)