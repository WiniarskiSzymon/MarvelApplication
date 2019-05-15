package com.example.marvelviewpagerlivedata.Model


data class Stories(
    @Json(name = "available")
    val available: Int,
    @Json(name = "collectionURI")
    val collectionURI: String,
    @Json(name = "items")
    val items: List<ItemX>,
    @Json(name = "returned")
    val returned: Int
)