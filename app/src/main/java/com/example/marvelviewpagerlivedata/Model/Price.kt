package com.example.marvelviewpagerlivedata.Model


data class Price(
    @Json(name = "price")
    val price: Double,
    @Json(name = "type")
    val type: String
)