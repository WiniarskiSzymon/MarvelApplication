package com.example.marvelviewpagerlivedata.Model

import com.squareup.moshi.Json


data class TextObject(
    @Json(name = "language")
    val language: String,
    @Json(name = "text")
    val text: String,
    @Json(name = "type")
    val type: String
)