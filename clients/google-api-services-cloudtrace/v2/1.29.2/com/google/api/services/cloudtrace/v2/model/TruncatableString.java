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

package com.google.api.services.cloudtrace.v2.model;

/**
 * Represents a string that might be shortened to a specified length.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Trace API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TruncatableString extends com.google.api.client.json.GenericJson {

  /**
   * The number of bytes removed from the original string. If this value is 0, then the string was
   * not shortened.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer truncatedByteCount;

  /**
   * The shortened string. For example, if the original string is 500 bytes long and the limit of
   * the string is 128 bytes, then `value` contains the first 128 bytes of the 500-byte string.
   *
   * Truncation always happens on a UTF8 character boundary. If there are multi-byte characters in
   * the string, then the length of the shortened string might be less than the size limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The number of bytes removed from the original string. If this value is 0, then the string was
   * not shortened.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTruncatedByteCount() {
    return truncatedByteCount;
  }

  /**
   * The number of bytes removed from the original string. If this value is 0, then the string was
   * not shortened.
   * @param truncatedByteCount truncatedByteCount or {@code null} for none
   */
  public TruncatableString setTruncatedByteCount(java.lang.Integer truncatedByteCount) {
    this.truncatedByteCount = truncatedByteCount;
    return this;
  }

  /**
   * The shortened string. For example, if the original string is 500 bytes long and the limit of
   * the string is 128 bytes, then `value` contains the first 128 bytes of the 500-byte string.
   *
   * Truncation always happens on a UTF8 character boundary. If there are multi-byte characters in
   * the string, then the length of the shortened string might be less than the size limit.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The shortened string. For example, if the original string is 500 bytes long and the limit of
   * the string is 128 bytes, then `value` contains the first 128 bytes of the 500-byte string.
   *
   * Truncation always happens on a UTF8 character boundary. If there are multi-byte characters in
   * the string, then the length of the shortened string might be less than the size limit.
   * @param value value or {@code null} for none
   */
  public TruncatableString setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public TruncatableString set(String fieldName, Object value) {
    return (TruncatableString) super.set(fieldName, value);
  }

  @Override
  public TruncatableString clone() {
    return (TruncatableString) super.clone();
  }

}
