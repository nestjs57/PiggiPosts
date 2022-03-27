package com.arnoract.piggiposts.domain

import com.arnoract.piggiposts.domain.initial.InitialFetchUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { InitialFetchUseCase() }
}