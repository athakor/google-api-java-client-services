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

package com.google.api.services.dlp.v2.model;

/**
 * Options defining BigQuery table and row identifiers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2BigQueryOptions extends com.google.api.client.json.GenericJson {

  /**
   * References to fields excluded from scanning. This allows you to skip inspection of entire
   * columns which you know have no findings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2FieldId> excludedFields;

  /**
   * References to fields uniquely identifying rows within the table. Nested fields in the format,
   * like `person.birthdate.year`, are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2FieldId> identifyingFields;

  /**
   * Max number of rows to scan. If the table has more rows than this value, the rest of the rows
   * are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and
   * rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rowsLimit;

  /**
   * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded
   * down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
   * Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction
   * with TimespanConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowsLimitPercent;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sampleMethod;

  /**
   * Complete BigQuery table reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryTable tableReference;

  /**
   * References to fields excluded from scanning. This allows you to skip inspection of entire
   * columns which you know have no findings.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2FieldId> getExcludedFields() {
    return excludedFields;
  }

  /**
   * References to fields excluded from scanning. This allows you to skip inspection of entire
   * columns which you know have no findings.
   * @param excludedFields excludedFields or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryOptions setExcludedFields(java.util.List<GooglePrivacyDlpV2FieldId> excludedFields) {
    this.excludedFields = excludedFields;
    return this;
  }

  /**
   * References to fields uniquely identifying rows within the table. Nested fields in the format,
   * like `person.birthdate.year`, are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2FieldId> getIdentifyingFields() {
    return identifyingFields;
  }

  /**
   * References to fields uniquely identifying rows within the table. Nested fields in the format,
   * like `person.birthdate.year`, are allowed.
   * @param identifyingFields identifyingFields or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryOptions setIdentifyingFields(java.util.List<GooglePrivacyDlpV2FieldId> identifyingFields) {
    this.identifyingFields = identifyingFields;
    return this;
  }

  /**
   * Max number of rows to scan. If the table has more rows than this value, the rest of the rows
   * are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and
   * rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRowsLimit() {
    return rowsLimit;
  }

  /**
   * Max number of rows to scan. If the table has more rows than this value, the rest of the rows
   * are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and
   * rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
   * @param rowsLimit rowsLimit or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryOptions setRowsLimit(java.lang.Long rowsLimit) {
    this.rowsLimit = rowsLimit;
    return this;
  }

  /**
   * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded
   * down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
   * Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction
   * with TimespanConfig.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowsLimitPercent() {
    return rowsLimitPercent;
  }

  /**
   * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded
   * down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
   * Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction
   * with TimespanConfig.
   * @param rowsLimitPercent rowsLimitPercent or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryOptions setRowsLimitPercent(java.lang.Integer rowsLimitPercent) {
    this.rowsLimitPercent = rowsLimitPercent;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSampleMethod() {
    return sampleMethod;
  }

  /**
   * @param sampleMethod sampleMethod or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryOptions setSampleMethod(java.lang.String sampleMethod) {
    this.sampleMethod = sampleMethod;
    return this;
  }

  /**
   * Complete BigQuery table reference.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable getTableReference() {
    return tableReference;
  }

  /**
   * Complete BigQuery table reference.
   * @param tableReference tableReference or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryOptions setTableReference(GooglePrivacyDlpV2BigQueryTable tableReference) {
    this.tableReference = tableReference;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2BigQueryOptions set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2BigQueryOptions) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2BigQueryOptions clone() {
    return (GooglePrivacyDlpV2BigQueryOptions) super.clone();
  }

}
