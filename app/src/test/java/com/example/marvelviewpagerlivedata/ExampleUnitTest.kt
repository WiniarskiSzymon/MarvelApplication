package com.example.marvelviewpagerlivedata

import android.arch.lifecycle.Observer
import android.location.Location
import com.example.marvelviewpagerlivedata.Model.Comic
import com.example.marvelviewpagerlivedata.ViewModel.CharacterComicsViewModel
import com.example.marvelviewpagerlivedata.ViewModel.SpiderManComicsViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class ViewModelsTest{

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

//    @Rule
//    var mockitoRule = MockitoJUnit.rule()



    private var marvelRepo = mock<MarvelRepo>()



    @InjectMocks
    private lateinit var characterComicsViewModelMock : SpiderManComicsViewModel

    private val comicsObserver = mock<Observer<List<Comic>>>()
    @get:Rule
    val schedulers = RxImmediateSchedulerRule()

    @Before
    fun setup(){
        MockitoAnnotations.initMocks(this)
    }


    @Test
    fun `Checking passing beer info from api to activity`(){
        whenever(marvelRepo.getSpiderManComics()).thenReturn()
        characterComicsViewModelMock.getSpiderManComics()
        characterComicsViewModelMock.beerInfoData.observeForever(beerInfoObserver)
        verify(comicsObserver).onChanged(beerInfoResponse.response.beer.medias.items.map { it.photo })
    }
