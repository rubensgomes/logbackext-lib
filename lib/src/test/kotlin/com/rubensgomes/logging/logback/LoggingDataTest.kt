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

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@DisplayName("LoggingData")
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
