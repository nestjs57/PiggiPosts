package com.arnoract.piggiposts.core

open class BaseException : RuntimeException {
    constructor() : super()
    constructor(cause: String) : super(cause)
}
