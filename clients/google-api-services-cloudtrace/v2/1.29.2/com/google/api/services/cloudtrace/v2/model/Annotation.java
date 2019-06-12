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
 * Text annotation with a set of attributes.
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
public final class Annotation extends com.google.api.client.json.GenericJson {

  /**
   * A set of attributes on the annotation. You can have up to 4 attributes per Annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Attributes attributes;

  /**
   * A user-supplied message describing the event. The maximum length for the description is 256
   * bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TruncatableString description;

  /**
   * A set of attributes on the annotation. You can have up to 4 attributes per Annotation.
   * @return value or {@code null} for none
   */
  public Attributes getAttributes() {
    return attributes;
  }

  /**
   * A set of attributes on the annotation. You can have up to 4 attributes per Annotation.
   * @param attributes attributes or {@code null} for none
   */
  public Annotation setAttributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * A user-supplied message describing the event. The maximum length for the description is 256
   * bytes.
   * @return value or {@code null} for none
   */
  public TruncatableString getDescription() {
    return description;
  }

  /**
   * A user-supplied message describing the event. The maximum length for the description is 256
   * bytes.
   * @param description description or {@code null} for none
   */
  public Annotation setDescription(TruncatableString description) {
    this.description = description;
    return this;
  }

  @Override
  public Annotation set(String fieldName, Object value) {
    return (Annotation) super.set(fieldName, value);
  }

  @Override
  public Annotation clone() {
    return (Annotation) super.clone();
  }

}
