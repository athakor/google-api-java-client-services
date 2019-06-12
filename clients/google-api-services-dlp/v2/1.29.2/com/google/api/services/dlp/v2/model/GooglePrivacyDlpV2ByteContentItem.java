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
 * Container for bytes to inspect or redact.
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
public final class GooglePrivacyDlpV2ByteContentItem extends com.google.api.client.json.GenericJson {

  /**
   * Content data to inspect or redact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * The type of data stored in the bytes string. Default will be TEXT_UTF8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Content data to inspect or redact.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * Content data to inspect or redact.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * Content data to inspect or redact.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public GooglePrivacyDlpV2ByteContentItem setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * Content data to inspect or redact.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GooglePrivacyDlpV2ByteContentItem encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * The type of data stored in the bytes string. Default will be TEXT_UTF8.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of data stored in the bytes string. Default will be TEXT_UTF8.
   * @param type type or {@code null} for none
   */
  public GooglePrivacyDlpV2ByteContentItem setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2ByteContentItem set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2ByteContentItem) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2ByteContentItem clone() {
    return (GooglePrivacyDlpV2ByteContentItem) super.clone();
  }

}
