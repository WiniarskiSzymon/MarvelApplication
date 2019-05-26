package com.example.marvelviewpagerlivedata.Model

import com.squareup.moshi.Json


data class Price(
    @Json(name = "price")
    val price: Double,
    @Json(name = "type")
    val type: String
)