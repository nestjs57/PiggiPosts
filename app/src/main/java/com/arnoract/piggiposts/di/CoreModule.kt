package com.arnoract.piggiposts.di

import com.arnoract.piggiposts.common.time.DefaultTimeProvider
import com.arnoract.piggiposts.common.time.TimeProvider
import com.arnoract.piggiposts.core.CoroutinesDispatcherProvider
import com.arnoract.piggiposts.core.MyGsonBuilder
import com.arnoract.piggiposts.core.OkHttpBuilder
import com.arnoract.piggiposts.core.RetrofitBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val coreModule = module {
    single { MyGsonBuilder().build() }
    single { OkHttpBuilder(androidApplication()).build() }
    single { RetrofitBuilder(get(), get()).build() }
    single { CoroutinesDispatcherProvider() }
    single<TimeProvider> { DefaultTimeProvider() }
}