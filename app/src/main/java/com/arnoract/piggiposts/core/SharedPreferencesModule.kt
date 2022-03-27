package com.arnoract.piggiposts.core

import org.koin.android.ext.koin.androidApplication
import org.koin.core.qualifier.named
import org.koin.dsl.module

val sharedPreferencesModule = module {
    single(named(KoinConst.SharedPreference.DEFAULT)) {
        SharedPreferencesBuilder(androidApplication()).buildDefault()
    }
}
