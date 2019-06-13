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

package com.google.api.services.videointelligence.v1p1beta1.model;

/**
 * Config for TEXT_DETECTION.
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
public final class GoogleCloudVideointelligenceV1p1beta1TextDetectionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Language hint can be specified if the language to be detected is known a priori. It can
   * increase the accuracy of the detection. Language hint must be language code in BCP-47 format.
   *
   * Automatic language detection is performed if no hint is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> languageHints;

  /**
   * Model to use for text detection. Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Language hint can be specified if the language to be detected is known a priori. It can
   * increase the accuracy of the detection. Language hint must be language code in BCP-47 format.
   *
   * Automatic language detection is performed if no hint is provided.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLanguageHints() {
    return languageHints;
  }

  /**
   * Language hint can be specified if the language to be detected is known a priori. It can
   * increase the accuracy of the detection. Language hint must be language code in BCP-47 format.
   *
   * Automatic language detection is performed if no hint is provided.
   * @param languageHints languageHints or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1TextDetectionConfig setLanguageHints(java.util.List<java.lang.String> languageHints) {
    this.languageHints = languageHints;
    return this;
  }

  /**
   * Model to use for text detection. Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Model to use for text detection. Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * @param model model or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1TextDetectionConfig setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1TextDetectionConfig set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1TextDetectionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1TextDetectionConfig clone() {
    return (GoogleCloudVideointelligenceV1p1beta1TextDetectionConfig) super.clone();
  }

}
