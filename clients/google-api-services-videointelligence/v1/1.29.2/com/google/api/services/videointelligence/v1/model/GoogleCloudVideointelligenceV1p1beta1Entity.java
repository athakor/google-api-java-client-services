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

package com.google.api.services.videointelligence.v1.model;

/**
 * Detected entity from video analysis.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p1beta1Entity extends com.google.api.client.json.GenericJson {

  /**
   * Textual description, e.g. `Fixed-gear bicycle`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityId;

  /**
   * Language code for `description` in BCP-47 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Textual description, e.g. `Fixed-gear bicycle`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Textual description, e.g. `Fixed-gear bicycle`.
   * @param description description or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1Entity setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityId() {
    return entityId;
  }

  /**
   * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * @param entityId entityId or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1Entity setEntityId(java.lang.String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Language code for `description` in BCP-47 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Language code for `description` in BCP-47 format.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1Entity setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1Entity set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1Entity) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1Entity clone() {
    return (GoogleCloudVideointelligenceV1p1beta1Entity) super.clone();
  }

}
