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

package com.google.api.services.docs.v1.model;

/**
 * A suggested change to a TableRowStyle.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuggestedTableRowStyle extends com.google.api.client.json.GenericJson {

  /**
   * A TableRowStyle that only includes the changes made in this suggestion. This can be used along
   * with the table_row_style_suggestion_state to see which fields have changed and their new
   * values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableRowStyle tableRowStyle;

  /**
   * A mask that indicates which of the fields on the base TableRowStyle have been changed in this
   * suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableRowStyleSuggestionState tableRowStyleSuggestionState;

  /**
   * A TableRowStyle that only includes the changes made in this suggestion. This can be used along
   * with the table_row_style_suggestion_state to see which fields have changed and their new
   * values.
   * @return value or {@code null} for none
   */
  public TableRowStyle getTableRowStyle() {
    return tableRowStyle;
  }

  /**
   * A TableRowStyle that only includes the changes made in this suggestion. This can be used along
   * with the table_row_style_suggestion_state to see which fields have changed and their new
   * values.
   * @param tableRowStyle tableRowStyle or {@code null} for none
   */
  public SuggestedTableRowStyle setTableRowStyle(TableRowStyle tableRowStyle) {
    this.tableRowStyle = tableRowStyle;
    return this;
  }

  /**
   * A mask that indicates which of the fields on the base TableRowStyle have been changed in this
   * suggestion.
   * @return value or {@code null} for none
   */
  public TableRowStyleSuggestionState getTableRowStyleSuggestionState() {
    return tableRowStyleSuggestionState;
  }

  /**
   * A mask that indicates which of the fields on the base TableRowStyle have been changed in this
   * suggestion.
   * @param tableRowStyleSuggestionState tableRowStyleSuggestionState or {@code null} for none
   */
  public SuggestedTableRowStyle setTableRowStyleSuggestionState(TableRowStyleSuggestionState tableRowStyleSuggestionState) {
    this.tableRowStyleSuggestionState = tableRowStyleSuggestionState;
    return this;
  }

  @Override
  public SuggestedTableRowStyle set(String fieldName, Object value) {
    return (SuggestedTableRowStyle) super.set(fieldName, value);
  }

  @Override
  public SuggestedTableRowStyle clone() {
    return (SuggestedTableRowStyle) super.clone();
  }

}
