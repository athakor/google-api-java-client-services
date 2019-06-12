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

package com.google.api.services.slides.v1.model;

/**
 * Updates the properties of a Page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdatePagePropertiesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `pageProperties` is implied and should not be
   * specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the page background solid fill color, set `fields` to
   * `"pageBackgroundFill.solidFill.color"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The object ID of the page the update is applied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The page properties to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PageProperties pageProperties;

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `pageProperties` is implied and should not be
   * specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the page background solid fill color, set `fields` to
   * `"pageBackgroundFill.solidFill.color"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `pageProperties` is implied and should not be
   * specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the page background solid fill color, set `fields` to
   * `"pageBackgroundFill.solidFill.color"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * @param fields fields or {@code null} for none
   */
  public UpdatePagePropertiesRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * The object ID of the page the update is applied to.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The object ID of the page the update is applied to.
   * @param objectId objectId or {@code null} for none
   */
  public UpdatePagePropertiesRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The page properties to update.
   * @return value or {@code null} for none
   */
  public PageProperties getPageProperties() {
    return pageProperties;
  }

  /**
   * The page properties to update.
   * @param pageProperties pageProperties or {@code null} for none
   */
  public UpdatePagePropertiesRequest setPageProperties(PageProperties pageProperties) {
    this.pageProperties = pageProperties;
    return this;
  }

  @Override
  public UpdatePagePropertiesRequest set(String fieldName, Object value) {
    return (UpdatePagePropertiesRequest) super.set(fieldName, value);
  }

  @Override
  public UpdatePagePropertiesRequest clone() {
    return (UpdatePagePropertiesRequest) super.clone();
  }

}
