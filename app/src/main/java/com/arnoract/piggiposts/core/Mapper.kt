package com.arnoract.piggiposts.core

interface Mapper<in From, out To> {
    fun map(from: From): To
}