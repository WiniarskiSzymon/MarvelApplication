package com.example.marvelviewpagerlivedata.Model


data class Image(
    @Json(name = "extension")
    val extension: String,
    @Json(name = "path")
    val path: String
)