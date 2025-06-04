package com.rubensgomes.logging.logback

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.test.Test
import kotlin.test.assertTrue

class LoggingDataTest {
    @Test
    fun `ensure LoggingData is logged`() {
        val loggingData =
            LoggingData(
                "Rubens Gomes",
                58,
                "1050 W Ash Ln",
                "Unit # 415",
                "Euless",
                "TX",
                "USA",
            )
        log.trace("{}", loggingData)
        // just make sure we got this far
        assertTrue(true)
    }

    internal companion object {
        private val log: Logger = LoggerFactory.getLogger(LoggingDataTest::class.java)
    }
}
