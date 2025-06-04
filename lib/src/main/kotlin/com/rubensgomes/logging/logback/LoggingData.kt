package com.rubensgomes.logging.logback

/**
 * A sample Kotlin Data Class type used to demonstrate the of logback logging based on logback.xml
 * configuration files found in the local resources.
 *
 * @author Rubens Gomes
 */
data class LoggingData(
    val name: String,
    val age: Int,
    val address1: String,
    val address2: String,
    val city: String,
    val state: String,
    val country: String,
)
