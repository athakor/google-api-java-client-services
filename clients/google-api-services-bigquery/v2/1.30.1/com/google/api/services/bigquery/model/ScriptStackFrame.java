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
 * Model definition for ScriptStackFrame.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScriptStackFrame extends com.google.api.client.json.GenericJson {

  /**
   * [Output-only] One-based end column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer endColumn;

  /**
   * [Output-only] One-based end line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer endLine;

  /**
   * [Output-only] Name of the active procedure, empty if in a top-level script.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String procedureId;

  /**
   * [Output-only] One-based start column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startColumn;

  /**
   * [Output-only] One-based start line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startLine;

  /**
   * [Output-only] Text of the current statement/expression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * [Output-only] One-based end column.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEndColumn() {
    return endColumn;
  }

  /**
   * [Output-only] One-based end column.
   * @param endColumn endColumn or {@code null} for none
   */
  public ScriptStackFrame setEndColumn(java.lang.Integer endColumn) {
    this.endColumn = endColumn;
    return this;
  }

  /**
   * [Output-only] One-based end line.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEndLine() {
    return endLine;
  }

  /**
   * [Output-only] One-based end line.
   * @param endLine endLine or {@code null} for none
   */
  public ScriptStackFrame setEndLine(java.lang.Integer endLine) {
    this.endLine = endLine;
    return this;
  }

  /**
   * [Output-only] Name of the active procedure, empty if in a top-level script.
   * @return value or {@code null} for none
   */
  public java.lang.String getProcedureId() {
    return procedureId;
  }

  /**
   * [Output-only] Name of the active procedure, empty if in a top-level script.
   * @param procedureId procedureId or {@code null} for none
   */
  public ScriptStackFrame setProcedureId(java.lang.String procedureId) {
    this.procedureId = procedureId;
    return this;
  }

  /**
   * [Output-only] One-based start column.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartColumn() {
    return startColumn;
  }

  /**
   * [Output-only] One-based start column.
   * @param startColumn startColumn or {@code null} for none
   */
  public ScriptStackFrame setStartColumn(java.lang.Integer startColumn) {
    this.startColumn = startColumn;
    return this;
  }

  /**
   * [Output-only] One-based start line.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartLine() {
    return startLine;
  }

  /**
   * [Output-only] One-based start line.
   * @param startLine startLine or {@code null} for none
   */
  public ScriptStackFrame setStartLine(java.lang.Integer startLine) {
    this.startLine = startLine;
    return this;
  }

  /**
   * [Output-only] Text of the current statement/expression.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * [Output-only] Text of the current statement/expression.
   * @param text text or {@code null} for none
   */
  public ScriptStackFrame setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public ScriptStackFrame set(String fieldName, Object value) {
    return (ScriptStackFrame) super.set(fieldName, value);
  }

  @Override
  public ScriptStackFrame clone() {
    return (ScriptStackFrame) super.clone();
  }

}
