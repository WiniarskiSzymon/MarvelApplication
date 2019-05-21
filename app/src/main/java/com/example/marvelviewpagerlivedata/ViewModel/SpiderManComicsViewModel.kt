package com.example.marvelviewpagerlivedata.ViewModel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvelviewpagerlivedata.Model.Comic
import com.example.marvelviewpagerlivedata.Repository.MarvelRepo
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.launch
import javax.inject.Inject

class SpiderManComicsViewModel @Inject constructor (private val marvelRepo : MarvelRepo) : ViewModel(){
    val comicDeferred = CompletableDeferred<LiveData<List<Comic>>>()

    init {
        viewModelScope.launch {
            val comicList = marvelRepo.getSpiderManComics()
            comicDeferred.complete(comicList)
        }
    }
    suspend fun getSpiderManComics() : LiveData<List<Comic>> =  comicDeferred.await()





}