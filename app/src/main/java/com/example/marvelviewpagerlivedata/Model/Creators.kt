package com.example.marvelviewpagerlivedata.Model


data class Creators(
    @Json(name = "available")
    val available: Int,
    @Json(name = "collectionURI")
    val collectionURI: String,
    @Json(name = "items")
    val items: List<ItemXX>,
    @Json(name = "returned")
    val returned: Int
)