package com.example.marvelviewpagerlivedata.Repository

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.marvelviewpagerlivedata.Model.Comic

@Database(entities= arrayOf(Comic::class),version = 1)
abstract class MarvelDatabase: RoomDatabase() {
    abstract fun comicDao(): ComicDao

}