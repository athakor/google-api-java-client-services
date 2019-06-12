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

package com.google.api.services.content.model;

/**
 * Model definition for PostalCodeGroup.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PostalCodeGroup extends com.google.api.client.json.GenericJson {

  /**
   * The CLDR territory code of the country the postal code group applies to. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The name of the postal code group, referred to in headers. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A range of postal codes. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PostalCodeRange> postalCodeRanges;

  /**
   * The CLDR territory code of the country the postal code group applies to. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * The CLDR territory code of the country the postal code group applies to. Required.
   * @param country country or {@code null} for none
   */
  public PostalCodeGroup setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * The name of the postal code group, referred to in headers. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the postal code group, referred to in headers. Required.
   * @param name name or {@code null} for none
   */
  public PostalCodeGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A range of postal codes. Required.
   * @return value or {@code null} for none
   */
  public java.util.List<PostalCodeRange> getPostalCodeRanges() {
    return postalCodeRanges;
  }

  /**
   * A range of postal codes. Required.
   * @param postalCodeRanges postalCodeRanges or {@code null} for none
   */
  public PostalCodeGroup setPostalCodeRanges(java.util.List<PostalCodeRange> postalCodeRanges) {
    this.postalCodeRanges = postalCodeRanges;
    return this;
  }

  @Override
  public PostalCodeGroup set(String fieldName, Object value) {
    return (PostalCodeGroup) super.set(fieldName, value);
  }

  @Override
  public PostalCodeGroup clone() {
    return (PostalCodeGroup) super.clone();
  }

}
