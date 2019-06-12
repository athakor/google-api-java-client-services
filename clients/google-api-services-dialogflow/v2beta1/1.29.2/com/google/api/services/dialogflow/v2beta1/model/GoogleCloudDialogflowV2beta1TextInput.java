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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Represents the natural language text to be processed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1TextInput extends com.google.api.client.json.GenericJson {

  /**
   * Required. The language of this conversational query. See [Language
   * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) for a list of
   * the currently supported language codes. Note that queries in the same session do not
   * necessarily need to specify the same language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Required. The UTF-8 encoded natural language text to be processed. Text length must not exceed
   * 256 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Required. The language of this conversational query. See [Language
   * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) for a list of
   * the currently supported language codes. Note that queries in the same session do not
   * necessarily need to specify the same language.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Required. The language of this conversational query. See [Language
   * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) for a list of
   * the currently supported language codes. Note that queries in the same session do not
   * necessarily need to specify the same language.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1TextInput setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Required. The UTF-8 encoded natural language text to be processed. Text length must not exceed
   * 256 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Required. The UTF-8 encoded natural language text to be processed. Text length must not exceed
   * 256 characters.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1TextInput setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1TextInput set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1TextInput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1TextInput clone() {
    return (GoogleCloudDialogflowV2beta1TextInput) super.clone();
  }

}
