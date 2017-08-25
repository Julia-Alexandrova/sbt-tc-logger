/*
 * Copyright 2013-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0.
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.
 *
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */

package jetbrains.buildServer.sbtlogger

import org.apache.logging.log4j.core
import org.apache.logging.log4j.core.appender.AbstractAppender
import org.apache.logging.log4j.core.layout.PatternLayout

class TCLoggerAppender(appender: LogAppender, scope: String) extends
  AbstractAppender("tc-logger-"+scope, null, PatternLayout.createDefaultLayout(), true) {

  override def append(event: core.LogEvent): Unit = {
    // TODO this is a dummy, needs appropriate implementation for log4j log appenders
  }
}