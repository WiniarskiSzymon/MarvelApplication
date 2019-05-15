package com.example.marvelviewpagerlivedata.Model


data class ComicResponse(
    @Json(name = "data")
    val `data`: Data,
    @Json(name = "attributionHTML")
    val attributionHTML: String,
    @Json(name = "attributionText")
    val attributionText: String,
    @Json(name = "code")
    val code: Int,
    @Json(name = "copyright")
    val copyright: String,
    @Json(name = "etag")
    val etag: String,
    @Json(name = "status")
    val status: String
)