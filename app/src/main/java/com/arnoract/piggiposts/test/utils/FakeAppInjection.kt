package com.arnoract.piggiposts.test.utils

import com.arnoract.piggiposts.core.CoroutinesDispatcherProvider
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.test.TestCoroutineDispatcher

fun provideFakeCoroutinesDispatcherProvider(
    main: CoroutineDispatcher? = null,
    computation: CoroutineDispatcher? = null,
    io: CoroutineDispatcher? = null,
): CoroutinesDispatcherProvider {
    val sharedTestCoroutineDispatcher = TestCoroutineDispatcher()
    return CoroutinesDispatcherProvider(
        main ?: sharedTestCoroutineDispatcher,
        computation ?: sharedTestCoroutineDispatcher,
        io ?: sharedTestCoroutineDispatcher
    )
}

fun provideFakeCoroutinesDispatcherProvider(
    dispatcher: TestCoroutineDispatcher,
): CoroutinesDispatcherProvider {
    return CoroutinesDispatcherProvider(dispatcher, dispatcher, dispatcher)
}
