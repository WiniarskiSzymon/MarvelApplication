package com.example.marvelviewpagerlivedata.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.marvelviewpagerlivedata.Model.Comic
import com.example.marvelviewpagerlivedata.toComic
import javax.inject.Inject

class MarvelRepo @Inject constructor(private val marvelApi: MarvelApi, private val marvelDB : MarvelDatabase){

    suspend fun getSpiderManComics()= liveData{
        emitSource(getComicsFromDatabase())
        val comicList = fetchComicsForCharacter("1009610")
        updateDatabase(comicList)
    }

    private suspend fun getComicsFromDatabase() : LiveData<List<Comic>> = marvelDB.comicDao().getAllComics()

    private suspend fun fetchComicsForCharacter(characterID : String) =
        marvelApi.getCaracterComics(characterID).data.results.map { it.toComic() }

    private suspend fun updateDatabase(comicList : List<Comic>){
        marvelDB.comicDao().deleteAllComics()
        marvelDB.comicDao().insertAllComics(comicList)
    }

}