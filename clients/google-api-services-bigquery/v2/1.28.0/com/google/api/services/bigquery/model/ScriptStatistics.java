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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ScriptStatistics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScriptStatistics extends com.google.api.client.json.GenericJson {

  /**
   * [Output-only] Whether this child job was a statement or expression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String evaluationKind;

  /**
   * Stack trace showing the line/column/procedure name of each frame on the stack at the point
   * where the current evaluation happened. The leaf frame is first, the primary script is last.
   * Never empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ScriptStackFrame> stackFrames;

  static {
    // hack to force ProGuard to consider ScriptStackFrame used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ScriptStackFrame.class);
  }

  /**
   * [Output-only] Whether this child job was a statement or expression.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvaluationKind() {
    return evaluationKind;
  }

  /**
   * [Output-only] Whether this child job was a statement or expression.
   * @param evaluationKind evaluationKind or {@code null} for none
   */
  public ScriptStatistics setEvaluationKind(java.lang.String evaluationKind) {
    this.evaluationKind = evaluationKind;
    return this;
  }

  /**
   * Stack trace showing the line/column/procedure name of each frame on the stack at the point
   * where the current evaluation happened. The leaf frame is first, the primary script is last.
   * Never empty.
   * @return value or {@code null} for none
   */
  public java.util.List<ScriptStackFrame> getStackFrames() {
    return stackFrames;
  }

  /**
   * Stack trace showing the line/column/procedure name of each frame on the stack at the point
   * where the current evaluation happened. The leaf frame is first, the primary script is last.
   * Never empty.
   * @param stackFrames stackFrames or {@code null} for none
   */
  public ScriptStatistics setStackFrames(java.util.List<ScriptStackFrame> stackFrames) {
    this.stackFrames = stackFrames;
    return this;
  }

  @Override
  public ScriptStatistics set(String fieldName, Object value) {
    return (ScriptStatistics) super.set(fieldName, value);
  }

  @Override
  public ScriptStatistics clone() {
    return (ScriptStatistics) super.clone();
  }

}
