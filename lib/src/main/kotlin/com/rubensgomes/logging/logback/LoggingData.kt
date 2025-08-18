/*
 * Copyright 2025 Rubens Gomes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
