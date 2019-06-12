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

package com.google.api.services.cloudsearch.v1.model;

/**
 * The collection of fields that make up a displayed line
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResultDisplayLine extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResultDisplayField> fields;

  static {
    // hack to force ProGuard to consider ResultDisplayField used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ResultDisplayField.class);
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ResultDisplayField> getFields() {
    return fields;
  }

  /**
   * @param fields fields or {@code null} for none
   */
  public ResultDisplayLine setFields(java.util.List<ResultDisplayField> fields) {
    this.fields = fields;
    return this;
  }

  @Override
  public ResultDisplayLine set(String fieldName, Object value) {
    return (ResultDisplayLine) super.set(fieldName, value);
  }

  @Override
  public ResultDisplayLine clone() {
    return (ResultDisplayLine) super.clone();
  }

}
