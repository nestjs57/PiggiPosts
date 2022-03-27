package com.arnoract.piggiposts.test.utils

object TestResourceUtil {
	fun readTestResource(fileName: String): String {
		return javaClass.classLoader?.getResourceAsStream(fileName)
			?.bufferedReader()
			?.readText() ?: ""
	}
}
