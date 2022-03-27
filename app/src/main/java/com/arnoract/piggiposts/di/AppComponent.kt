package com.arnoract.piggiposts.di

import com.arnoract.piggiposts.core.sharedPreferencesModule
import org.koin.core.context.loadKoinModules

object AppComponent {
    fun init() = loadKoinModules(
        listOf(
            coreModule,
            apiModule,
            databaseModule,
            apiModule,
            sharedPreferencesModule
        )
    )
}