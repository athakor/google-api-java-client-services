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

package com.google.api.services.drive.model;

/**
 * A list of a file's parents.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ParentList extends com.google.api.client.json.GenericJson {

  /**
   * The ETag of the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The list of parents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ParentReference> items;

  /**
   * This is always drive#parentList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A link back to this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The ETag of the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The ETag of the list.
   * @param etag etag or {@code null} for none
   */
  public ParentList setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The list of parents.
   * @return value or {@code null} for none
   */
  public java.util.List<ParentReference> getItems() {
    return items;
  }

  /**
   * The list of parents.
   * @param items items or {@code null} for none
   */
  public ParentList setItems(java.util.List<ParentReference> items) {
    this.items = items;
    return this;
  }

  /**
   * This is always drive#parentList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#parentList.
   * @param kind kind or {@code null} for none
   */
  public ParentList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A link back to this list.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * A link back to this list.
   * @param selfLink selfLink or {@code null} for none
   */
  public ParentList setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public ParentList set(String fieldName, Object value) {
    return (ParentList) super.set(fieldName, value);
  }

  @Override
  public ParentList clone() {
    return (ParentList) super.clone();
  }

}
