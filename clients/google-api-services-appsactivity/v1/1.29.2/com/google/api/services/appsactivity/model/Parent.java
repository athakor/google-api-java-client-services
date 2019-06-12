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

package com.google.api.services.appsactivity.model;

/**
 * Contains information about a parent object. For example, a folder in Drive is a parent for all
 * files within it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Parent extends com.google.api.client.json.GenericJson {

  /**
   * The parent's ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Whether this is the root folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRoot;

  /**
   * The parent's title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The parent's ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The parent's ID.
   * @param id id or {@code null} for none
   */
  public Parent setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Whether this is the root folder.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRoot() {
    return isRoot;
  }

  /**
   * Whether this is the root folder.
   * @param isRoot isRoot or {@code null} for none
   */
  public Parent setIsRoot(java.lang.Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
  }

  /**
   * The parent's title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The parent's title.
   * @param title title or {@code null} for none
   */
  public Parent setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Parent set(String fieldName, Object value) {
    return (Parent) super.set(fieldName, value);
  }

  @Override
  public Parent clone() {
    return (Parent) super.clone();
  }

}
