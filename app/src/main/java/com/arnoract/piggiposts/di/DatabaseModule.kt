package com.arnoract.piggiposts.di

import com.arnoract.piggiposts.core.db.DatabaseBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    single { DatabaseBuilder(androidApplication()).buildRoomDatabaseStorage() }
}