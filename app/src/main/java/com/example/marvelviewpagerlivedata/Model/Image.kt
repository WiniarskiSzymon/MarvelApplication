package com.example.marvelviewpagerlivedata.Model

import com.squareup.moshi.Json


data class Image(
    @Json(name = "extension")
    val extension: String,
    @Json(name = "path")
    val path: String
)