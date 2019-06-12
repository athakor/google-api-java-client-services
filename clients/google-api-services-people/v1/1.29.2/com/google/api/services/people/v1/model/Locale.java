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

package com.google.api.services.people.v1.model;

/**
 * A person's locale preference.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Locale extends com.google.api.client.json.GenericJson {

  /**
   * Metadata about the locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag representing the
   * locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Metadata about the locale.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the locale.
   * @param metadata metadata or {@code null} for none
   */
  public Locale setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag representing the
   * locale.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag representing the
   * locale.
   * @param value value or {@code null} for none
   */
  public Locale setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public Locale set(String fieldName, Object value) {
    return (Locale) super.set(fieldName, value);
  }

  @Override
  public Locale clone() {
    return (Locale) super.clone();
  }

}
