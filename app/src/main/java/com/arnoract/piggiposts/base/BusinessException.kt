package com.arnoract.piggiposts.base

open class BusinessException : RuntimeException {
    constructor() : super()
    constructor(cause: String) : super(cause)
}