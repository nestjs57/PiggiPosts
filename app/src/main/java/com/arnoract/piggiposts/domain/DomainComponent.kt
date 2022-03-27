package com.arnoract.piggiposts.domain

import com.arnoract.piggiposts.pref.prefModule
import org.koin.core.context.loadKoinModules

object DomainComponent {
    fun init() = loadKoinModules(listOf(useCaseModule, repositoryModule, prefModule))
}