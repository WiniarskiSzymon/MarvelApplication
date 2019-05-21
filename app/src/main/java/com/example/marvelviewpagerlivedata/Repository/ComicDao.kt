package com.example.marvelviewpagerlivedata.Repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.marvelviewpagerlivedata.Model.Comic


@Dao
interface ComicDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertComic(comic: Comic)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllComics(comics: List<Comic>)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateComict(comics: Comic):Int

    @Delete
    suspend fun deleteComic(comic: Comic)

    @Query ("select * from comics where comicId = :id")
    suspend fun getCmoic(id: Int?): LiveData<Comic>

    @Query("select * from comics")
    suspend fun getAllComics() : LiveData<List<Comic>>

    @Query("delete from comics")
    suspend fun deleteAllComics()

}