package com.rubensgomes.logging.logback

import kotlin.test.Test
import kotlin.test.assertTrue

class LoggingClassTest {
    @Test
    fun `ensure logSomething works`() {
        val logInstance = LoggingClass()
        logInstance.logSomething("Hello World!")
        // just make sure we got this far
        assertTrue(true)
    }
}
