package com.arnoract.piggiposts.common.time

import java.util.*

interface TimeProvider {
    fun now(): Long
    fun getCurrentTimeZone(): TimeZone
}
