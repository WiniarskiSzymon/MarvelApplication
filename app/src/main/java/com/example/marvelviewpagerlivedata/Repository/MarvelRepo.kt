package com.example.marvelviewpagerlivedata.Repository

class MarvelRepo @Inject constructor(private val marvelApi: MarvelApi, private val marvelDB : MarveDB){


    fun getSpiderManComics(){

        fetchComicsForCharacter("1009610")
    }


    private fun fetchComicsForCharacter(characterID : String){





        return
    }
}