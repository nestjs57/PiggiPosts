package com.arnoract.piggiposts.core.db

import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@TypeConverters(DateConverter::class, LongListConverter::class)
abstract class RoomDatabaseStorage : RoomDatabase() {

}