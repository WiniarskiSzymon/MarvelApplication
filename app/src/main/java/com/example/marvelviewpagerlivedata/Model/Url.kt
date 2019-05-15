package com.example.marvelviewpagerlivedata.Model


data class Url(
    @Json(name = "type")
    val type: String,
    @Json(name = "url")
    val url: String
)