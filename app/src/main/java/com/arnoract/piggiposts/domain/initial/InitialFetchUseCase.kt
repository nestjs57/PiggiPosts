package com.arnoract.piggiposts.domain.initial

import com.arnoract.piggiposts.core.UseCase

class InitialFetchUseCase : UseCase<Unit, Unit>() {
    override suspend fun execute(parameters: Unit) {
    }
}