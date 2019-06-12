/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudtrace.v2.model;

/**
 * A call stack appearing in a trace.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Trace API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StackTrace extends com.google.api.client.json.GenericJson {

  /**
   * Stack frames in this stack trace. A maximum of 128 frames are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StackFrames stackFrames;

  /**
   * The hash ID is used to conserve network bandwidth for duplicate stack traces within a single
   * trace.
   *
   * Often multiple spans will have identical stack traces. The first occurrence of a stack trace
   * should contain both the `stackFrame` content and a value in `stackTraceHashId`.
   *
   * Subsequent spans within the same request can refer to that stack trace by only setting
   * `stackTraceHashId`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long stackTraceHashId;

  /**
   * Stack frames in this stack trace. A maximum of 128 frames are allowed.
   * @return value or {@code null} for none
   */
  public StackFrames getStackFrames() {
    return stackFrames;
  }

  /**
   * Stack frames in this stack trace. A maximum of 128 frames are allowed.
   * @param stackFrames stackFrames or {@code null} for none
   */
  public StackTrace setStackFrames(StackFrames stackFrames) {
    this.stackFrames = stackFrames;
    return this;
  }

  /**
   * The hash ID is used to conserve network bandwidth for duplicate stack traces within a single
   * trace.
   *
   * Often multiple spans will have identical stack traces. The first occurrence of a stack trace
   * should contain both the `stackFrame` content and a value in `stackTraceHashId`.
   *
   * Subsequent spans within the same request can refer to that stack trace by only setting
   * `stackTraceHashId`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStackTraceHashId() {
    return stackTraceHashId;
  }

  /**
   * The hash ID is used to conserve network bandwidth for duplicate stack traces within a single
   * trace.
   *
   * Often multiple spans will have identical stack traces. The first occurrence of a stack trace
   * should contain both the `stackFrame` content and a value in `stackTraceHashId`.
   *
   * Subsequent spans within the same request can refer to that stack trace by only setting
   * `stackTraceHashId`.
   * @param stackTraceHashId stackTraceHashId or {@code null} for none
   */
  public StackTrace setStackTraceHashId(java.lang.Long stackTraceHashId) {
    this.stackTraceHashId = stackTraceHashId;
    return this;
  }

  @Override
  public StackTrace set(String fieldName, Object value) {
    return (StackTrace) super.set(fieldName, value);
  }

  @Override
  public StackTrace clone() {
    return (StackTrace) super.clone();
  }

}
