package com.example.marvelviewpagerlivedata

import com.example.marvelviewpagerlivedata.Model.Comic
import com.example.marvelviewpagerlivedata.Model.Result

fun Result.toComic() = Comic(
    this.id,
    this.title,
    this.prices[0].price.toString(),
    this.characters.items.toString(),
    this.thumbnail.path
)

