package com.rubensgomes.logging.logback

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * A sample Kotlin Class type used to demonstrate the of logback logging based on logback.xml
 * configuration files found in the local resources.
 *
 * @author Rubens Gomes
 */
class LoggingClass {
    fun logSomething(message: String) {
        log.info("Something: $message")
    }

    internal companion object {
        private val log: Logger = LoggerFactory.getLogger(LoggingClass::class.java)
    }
}
