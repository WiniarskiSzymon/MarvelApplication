package com.example.marvelviewpagerlivedata.Repository

import com.example.marvelviewpagerlivedata.Model.ComicResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface  MarvelService {

    @GET("v1/public/characters/{param}/comics")
    suspend fun getCharacterComics(
        @Path("param") characterId: String,
        @Query("apikey") apikey: String,
        @Query("ts") ts: String,
        @Query("hash") hash: String
    ): ComicResponse
}
