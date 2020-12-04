package com.taghavi.roomkotlinflow

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FavTVShows(@PrimaryKey val name: String,
                      val rating : Int,
                      val finished : Boolean) {
}