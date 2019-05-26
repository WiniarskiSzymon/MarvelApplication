package com.example.marvelviewpagerlivedata

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.marvelviewpagerlivedata.Model.ComicResponse
import com.example.marvelviewpagerlivedata.Repository.MarvelApi
import com.example.marvelviewpagerlivedata.Repository.MarvelDatabase
import com.example.marvelviewpagerlivedata.Repository.MarvelRepo
import com.nhaarman.mockitokotlin2.mock
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations
import androidx.lifecycle.Observer
import com.example.marvelviewpagerlivedata.Model.Comic
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import org.xml.sax.DTDHandler

@RunWith(MockitoJUnitRunner::class)
class RepoTest{


    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()
    val testDespatcher = TestCoroutineDispatcher()
    val testScope = TestCoroutineScope(testDespatcher)

    private var marvelApi =mock<MarvelApi>()
    private var marvelDatabase = mock<MarvelDatabase>()

    private val comicObserver = mock<Observer<List<Comic>>>()
    private var  comicList = mutableListOf<Comic>()
    private var testLiveData = MutableLiveData<List<Comic>>()


    @InjectMocks
    private lateinit var marvelRepo : MarvelRepo

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        Dispatchers.setMain(testDespatcher)
        comicList.addAll(DataHelper.comicResponse.data.results.map { it.toComic() })
        testLiveData.postValue(comicList)
        whenever(marvelDatabase.comicDao().getAllComics()).thenReturn(testLiveData)
    }

    @Test
    fun `Test for getting Comics from Repo `() =testScope.runBlockingTest{
        whenever(marvelApi.getCaracterComics("1")).thenReturn(DataHelper.comicResponse)
        marvelRepo.getSpiderManComics().observeForever(comicObserver)
        verify(comicObserver).onChanged(comicList)


    }


    @After
    fun tearDown(){
        Dispatchers.resetMain()
        testScope.cleanupTestCoroutines()


    }
}