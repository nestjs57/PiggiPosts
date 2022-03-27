package com.arnoract.piggiposts.test.utils

import com.arnoract.piggiposts.core.Result
import com.arnoract.piggiposts.core.SynchronizeUseCase
import com.arnoract.piggiposts.core.UseCase
import io.mockk.coEvery

@Suppress("NOTHING_TO_INLINE")
inline fun <reified P : Any, R : Any?> UseCase<P, R>.mockReturnResult(crossinline answer: (P?) -> Result<R>) {
    coEvery { this@mockReturnResult(any()) } coAnswers {
        val param: P? = firstArg()
        answer(param)
    }
}

@Suppress("NOTHING_TO_INLINE")
inline fun <reified P : Any, R : Any?> SynchronizeUseCase<P, R>.mockReturnResult(crossinline answer: (P?) -> Result<R>) {
    coEvery { this@mockReturnResult(any()) } coAnswers {
        val param: P? = firstArg()
        answer(param)
    }
}
