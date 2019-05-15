package com.example.marvelviewpagerlivedata.ViewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.marvelviewpagerlivedata.Model.Comic
import com.example.marvelviewpagerlivedata.Repository.MarvelRepo

class SpiderManComicsViewModel @Inject constructor (private val marvelRepo : MarvelRepo) :ViewModel(){

    var spiderManComics:  MutableLiveData<List<Comic>>  = MutableLiveData()

    fun getSpiderManComics(){
        marvelRepo.getSpiderManComics()
    }


}