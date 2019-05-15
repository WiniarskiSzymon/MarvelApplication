package com.example.marvelviewpagerlivedata.Model


data class Date(
    @Json(name = "date")
    val date: String,
    @Json(name = "type")
    val type: String
)