package com.taghavi.roomkotlinflow

import androidx.lifecycle.LiveData
import androidx.room.*

@Entity
data class FavTVShows(@PrimaryKey val name: String,
                      val rating : Int,
                      val finished : Boolean) {
}

@Dao
interface FavTvShowsDao {

    @Query("SELECT * FROM FavTvShows")
    fun getAllShows(): LiveData<List<FavTVShows>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setAllShows(shows : List<FavTVShows>)

}