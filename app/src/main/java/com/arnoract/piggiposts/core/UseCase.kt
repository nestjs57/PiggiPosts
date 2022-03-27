package com.arnoract.piggiposts.core

import timber.log.Timber

abstract class UseCase<in P, R> {

    suspend operator fun invoke(parameters: P): Result<R> {
        return try {
            Result.Success(execute(parameters))
        } catch (e: Exception) {
            Timber.e(e)
            Result.Failure(e)
        }
    }

    /**
     * Override this to set the code to be executed.
     */
    @Throws(RuntimeException::class)
    protected abstract suspend fun execute(parameters: P): R
}
