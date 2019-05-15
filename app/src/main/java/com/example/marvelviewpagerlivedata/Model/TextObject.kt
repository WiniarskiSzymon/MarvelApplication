package com.example.marvelviewpagerlivedata.Model


data class TextObject(
    @Json(name = "language")
    val language: String,
    @Json(name = "text")
    val text: String,
    @Json(name = "type")
    val type: String
)