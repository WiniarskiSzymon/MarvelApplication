package com.example.marvelviewpagerlivedata.Repository

import com.example.marvelviewpagerlivedata.Model.ComicResponse
import retrofit2.Retrofit
import javax.inject.Inject

class MarvelApi @Inject constructor(private val retrofit : Retrofit, private val requestHelper  : RequestHelper){

    private val service =  retrofit.create(MarvelService::class.java)

    suspend fun getCaracterComics(characterId: String) : ComicResponse{
        val timestamp = requestHelper.getTimeStamp()
        val hash = requestHelper.getMD5Hash()
        val apiKey = requestHelper.getApiKey()
        return service.getCharacterComics(apiKey,characterId,timestamp,hash)


    }

}