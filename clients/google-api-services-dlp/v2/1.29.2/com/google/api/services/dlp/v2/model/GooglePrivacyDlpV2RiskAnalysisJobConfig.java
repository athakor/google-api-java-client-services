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
 * Configuration for a risk analysis job. See https://cloud.google.com/dlp/docs/concepts-risk-
 * analysis to learn more.
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
public final class GooglePrivacyDlpV2RiskAnalysisJobConfig extends com.google.api.client.json.GenericJson {

  /**
   * Actions to execute at the completion of the job. Are executed in the order provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2Action> actions;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2Action used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2Action.class);
  }

  /**
   * Privacy metric to compute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2PrivacyMetric privacyMetric;

  /**
   * Input dataset to compute metrics over.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryTable sourceTable;

  /**
   * Actions to execute at the completion of the job. Are executed in the order provided.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2Action> getActions() {
    return actions;
  }

  /**
   * Actions to execute at the completion of the job. Are executed in the order provided.
   * @param actions actions or {@code null} for none
   */
  public GooglePrivacyDlpV2RiskAnalysisJobConfig setActions(java.util.List<GooglePrivacyDlpV2Action> actions) {
    this.actions = actions;
    return this;
  }

  /**
   * Privacy metric to compute.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2PrivacyMetric getPrivacyMetric() {
    return privacyMetric;
  }

  /**
   * Privacy metric to compute.
   * @param privacyMetric privacyMetric or {@code null} for none
   */
  public GooglePrivacyDlpV2RiskAnalysisJobConfig setPrivacyMetric(GooglePrivacyDlpV2PrivacyMetric privacyMetric) {
    this.privacyMetric = privacyMetric;
    return this;
  }

  /**
   * Input dataset to compute metrics over.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable getSourceTable() {
    return sourceTable;
  }

  /**
   * Input dataset to compute metrics over.
   * @param sourceTable sourceTable or {@code null} for none
   */
  public GooglePrivacyDlpV2RiskAnalysisJobConfig setSourceTable(GooglePrivacyDlpV2BigQueryTable sourceTable) {
    this.sourceTable = sourceTable;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2RiskAnalysisJobConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2RiskAnalysisJobConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2RiskAnalysisJobConfig clone() {
    return (GooglePrivacyDlpV2RiskAnalysisJobConfig) super.clone();
  }

}
