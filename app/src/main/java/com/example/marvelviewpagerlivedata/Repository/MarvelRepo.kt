package com.example.marvelviewpagerlivedata.Repository

import androidx.lifecycle.LiveData
import com.example.marvelviewpagerlivedata.Model.Comic
import com.example.marvelviewpagerlivedata.toComic
import javax.inject.Inject

class MarvelRepo @Inject constructor(private val marvelApi: MarvelApi, private val marvelDB : MarvelDatabase){


    suspend fun getSpiderManComics():LiveData<List<Comic>>{

        val comicList = fetchComicsForCharacter("1009610")
        updateDatabase(comicList)
        return getComicsFromDatabase()

    }


    private suspend fun fetchComicsForCharacter(characterID : String) : List<Comic>{

        return marvelApi.getCaracterComics(characterID).data.results.map { it.toComic() }
    }
    private suspend fun updateDatabase(comicList : List<Comic>){
        marvelDB.comicDao().deleteAllComics()
        marvelDB.comicDao().insertAllComics(comicList)
    }

    private suspend fun getComicsFromDatabase() : LiveData<List<Comic>> = marvelDB.comicDao().getAllComics()
}