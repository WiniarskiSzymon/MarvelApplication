package com.example.marvelviewpagerlivedata.Model

import com.squareup.moshi.Json


data class Characters(
    @Json(name = "available")
    val available: Int,
    @Json(name = "collectionURI")
    val collectionURI: String,
    @Json(name = "items")
    val items: List<Item>,
    @Json(name = "returned")
    val returned: Int
)