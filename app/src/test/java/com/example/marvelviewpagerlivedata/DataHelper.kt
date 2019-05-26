package com.example.marvelviewpagerlivedata

import com.example.marvelviewpagerlivedata.Model.ComicResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.JsonAdapter



class DataHelper(){


    companion object {
        private val moshi = Moshi.Builder().build()
        var jsonAdapter = moshi.adapter(ComicResponse::class.java)


        val comicResponseJSON =  ClassLoader.getSystemClassLoader().getResource("comicResponse.json").readText()


        val  comicResponse = jsonAdapter.fromJson(comicResponseJSON) as ComicResponse

    }
}