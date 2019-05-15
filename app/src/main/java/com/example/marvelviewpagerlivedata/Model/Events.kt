package com.example.marvelviewpagerlivedata.Model


data class Events(
    @Json(name = "available")
    val available: Int,
    @Json(name = "collectionURI")
    val collectionURI: String,
    @Json(name = "items")
    val items: List<Any>,
    @Json(name = "returned")
    val returned: Int
)