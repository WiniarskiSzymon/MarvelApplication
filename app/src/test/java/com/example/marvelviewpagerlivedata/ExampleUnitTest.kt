package com.example.marvelviewpagerlivedata

import android.location.Location
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.marvelviewpagerlivedata.Model.Comic
import com.example.marvelviewpagerlivedata.Repository.MarvelRepo
import com.example.marvelviewpagerlivedata.ViewModel.SpiderManComicsViewModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class ViewModelsTest {

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

//    @Rule
//    var mockitoRule = MockitoJUnit.rule()


    private var marvelRepo = mock<MarvelRepo>()


    @InjectMocks
    private lateinit var characterComicsViewModelMock: SpiderManComicsViewModel

    private val comicsObserver = mock<Observer<List<Comic>>>()
   // @get:Rule
//    val schedulers = RxImmediateSchedulerRule()

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }


//    @Test
//    fun `Checking passing beer info from api to activity`() {
//        whenever(marvelRepo.getSpiderManComics()).thenReturn()
//        characterComicsViewModelMock.getSpiderManComics()
//        characterComicsViewModelMock.comicDeferred.complete(beerInfoObserver)
//        verify(comicsObserver).onChanged(beerInfoResponse.response.beer.medias.items.map { it.photo })
//    }
}
