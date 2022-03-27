package com.arnoract.piggiposts.test

import com.arnoract.piggiposts.test.rule.CoroutinesTestRule
import org.junit.Before
import org.junit.Rule

abstract class BaseUseCaseTest {
	@get:Rule
	var coroutinesTestRule = CoroutinesTestRule()

	@Before
	fun setUp() {
		setUpTest()
	}

	protected abstract fun setUpTest()
}
