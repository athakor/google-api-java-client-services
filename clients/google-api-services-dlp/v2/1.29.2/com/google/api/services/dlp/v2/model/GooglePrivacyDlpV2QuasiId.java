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
 * A column with a semantic tag attached.
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
public final class GooglePrivacyDlpV2QuasiId extends com.google.api.client.json.GenericJson {

  /**
   * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary
   * table that contains statistical information on the possible values of this column (below).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customTag;

  /**
   * Identifies the column. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FieldId field;

  /**
   * If no semantic tag is indicated, we infer the statistical model from the distribution of values
   * in the input data
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleProtobufEmpty inferred;

  /**
   * A column can be tagged with a InfoType to use the relevant public dataset as a statistical
   * model of population, if available. We currently support US ZIP codes, region codes, ages and
   * genders. To programmatically obtain the list of supported InfoTypes, use ListInfoTypes with the
   * supported_by=RISK_ANALYSIS filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InfoType infoType;

  /**
   * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary
   * table that contains statistical information on the possible values of this column (below).
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomTag() {
    return customTag;
  }

  /**
   * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary
   * table that contains statistical information on the possible values of this column (below).
   * @param customTag customTag or {@code null} for none
   */
  public GooglePrivacyDlpV2QuasiId setCustomTag(java.lang.String customTag) {
    this.customTag = customTag;
    return this;
  }

  /**
   * Identifies the column. [required]
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FieldId getField() {
    return field;
  }

  /**
   * Identifies the column. [required]
   * @param field field or {@code null} for none
   */
  public GooglePrivacyDlpV2QuasiId setField(GooglePrivacyDlpV2FieldId field) {
    this.field = field;
    return this;
  }

  /**
   * If no semantic tag is indicated, we infer the statistical model from the distribution of values
   * in the input data
   * @return value or {@code null} for none
   */
  public GoogleProtobufEmpty getInferred() {
    return inferred;
  }

  /**
   * If no semantic tag is indicated, we infer the statistical model from the distribution of values
   * in the input data
   * @param inferred inferred or {@code null} for none
   */
  public GooglePrivacyDlpV2QuasiId setInferred(GoogleProtobufEmpty inferred) {
    this.inferred = inferred;
    return this;
  }

  /**
   * A column can be tagged with a InfoType to use the relevant public dataset as a statistical
   * model of population, if available. We currently support US ZIP codes, region codes, ages and
   * genders. To programmatically obtain the list of supported InfoTypes, use ListInfoTypes with the
   * supported_by=RISK_ANALYSIS filter.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoType getInfoType() {
    return infoType;
  }

  /**
   * A column can be tagged with a InfoType to use the relevant public dataset as a statistical
   * model of population, if available. We currently support US ZIP codes, region codes, ages and
   * genders. To programmatically obtain the list of supported InfoTypes, use ListInfoTypes with the
   * supported_by=RISK_ANALYSIS filter.
   * @param infoType infoType or {@code null} for none
   */
  public GooglePrivacyDlpV2QuasiId setInfoType(GooglePrivacyDlpV2InfoType infoType) {
    this.infoType = infoType;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2QuasiId set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2QuasiId) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2QuasiId clone() {
    return (GooglePrivacyDlpV2QuasiId) super.clone();
  }

}
