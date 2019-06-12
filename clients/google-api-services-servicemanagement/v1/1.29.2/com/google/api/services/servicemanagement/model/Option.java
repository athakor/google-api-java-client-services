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

package com.google.api.services.servicemanagement.model;

/**
 * A protocol buffer option, which can be attached to a message, field, enumeration, etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Option extends com.google.api.client.json.GenericJson {

  /**
   * The option's name. For protobuf built-in options (options defined in descriptor.proto), this is
   * the short name. For example, `"map_entry"`. For custom options, it should be the fully-
   * qualified name. For example, `"google.api.http"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The option's value packed in an Any message. If the value is a primitive, the corresponding
   * wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an enum,
   * it should be stored as an int32 value using the google.protobuf.Int32Value type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> value;

  /**
   * The option's name. For protobuf built-in options (options defined in descriptor.proto), this is
   * the short name. For example, `"map_entry"`. For custom options, it should be the fully-
   * qualified name. For example, `"google.api.http"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The option's name. For protobuf built-in options (options defined in descriptor.proto), this is
   * the short name. For example, `"map_entry"`. For custom options, it should be the fully-
   * qualified name. For example, `"google.api.http"`.
   * @param name name or {@code null} for none
   */
  public Option setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The option's value packed in an Any message. If the value is a primitive, the corresponding
   * wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an enum,
   * it should be stored as an int32 value using the google.protobuf.Int32Value type.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getValue() {
    return value;
  }

  /**
   * The option's value packed in an Any message. If the value is a primitive, the corresponding
   * wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an enum,
   * it should be stored as an int32 value using the google.protobuf.Int32Value type.
   * @param value value or {@code null} for none
   */
  public Option setValue(java.util.Map<String, java.lang.Object> value) {
    this.value = value;
    return this;
  }

  @Override
  public Option set(String fieldName, Object value) {
    return (Option) super.set(fieldName, value);
  }

  @Override
  public Option clone() {
    return (Option) super.clone();
  }

}
