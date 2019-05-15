package com.example.marvelviewpagerlivedata.Model


data class Series(
    @Json(name = "name")
    val name: String,
    @Json(name = "resourceURI")
    val resourceURI: String
)