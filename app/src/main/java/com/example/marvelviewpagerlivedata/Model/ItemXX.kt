package com.example.marvelviewpagerlivedata.Model


data class ItemXX(
    @Json(name = "name")
    val name: String,
    @Json(name = "resourceURI")
    val resourceURI: String,
    @Json(name = "role")
    val role: String
)