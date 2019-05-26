package com.example.marvelviewpagerlivedata.DI

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.marvelviewpagerlivedata.Repository.MarvelDatabase
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
class AppModule() {


    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    fun provideRetrofit(logger : OkHttpClient) = Retrofit.Builder()
        .baseUrl("https://gateway.marvel.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .client(logger)
        .build()





    @Singleton
    @Provides
    fun provideMarvelDatabase(context: Context) : MarvelDatabase=
        Room.databaseBuilder(context, MarvelDatabase::class.java, "marvel_db").build()


    @Singleton
    @Provides
    fun providesUntappedDatabase( context: Context): MarvelDatabase =
        Room.databaseBuilder(context, MarvelDatabase::class.java, "marvel_db").build()



}