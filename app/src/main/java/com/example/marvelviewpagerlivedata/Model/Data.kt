package com.example.marvelviewpagerlivedata.Model


data class Data(
    @Json(name = "count")
    val count: Int,
    @Json(name = "limit")
    val limit: Int,
    @Json(name = "offset")
    val offset: Int,
    @Json(name = "results")
    val results: List<Result>,
    @Json(name = "total")
    val total: Int
)