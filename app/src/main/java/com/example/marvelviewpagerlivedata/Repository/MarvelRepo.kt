package com.example.marvelviewpagerlivedata.Repository

import com.example.marvelviewpagerlivedata.Model.Comic
import com.example.marvelviewpagerlivedata.toComic
import javax.inject.Inject

class MarvelRepo @Inject constructor(private val marvelApi: MarvelApi){


    suspend fun getSpiderManComics(){

        fetchComicsForCharacter("1009610")
    }


    private suspend fun fetchComicsForCharacter(characterID : String) : List<Comic>{

        return marvelApi.getCaracterComics(characterID).data.results.map { it.toComic() }
    }
}