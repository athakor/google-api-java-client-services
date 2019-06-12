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
 * A list of files.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FileList extends com.google.api.client.json.GenericJson {

  /**
   * The ETag of the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Whether the search process was incomplete. If true, then some search results may be missing,
   * since all documents were not searched. This may occur when searching multiple drives with the
   * "allDrives" corpora, but all corpora could not be searched. When this happens, it is suggested
   * that clients narrow their query by choosing a different corpus such as "default" or "drive".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean incompleteSearch;

  /**
   * The list of files. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<File> items;

  static {
    // hack to force ProGuard to consider File used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(File.class);
  }

  /**
   * This is always drive#fileList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A link to the next page of files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextLink;

  /**
   * The page token for the next page of files. This will be absent if the end of the files list has
   * been reached. If the token is rejected for any reason, it should be discarded, and pagination
   * should be restarted from the first page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

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
  public FileList setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Whether the search process was incomplete. If true, then some search results may be missing,
   * since all documents were not searched. This may occur when searching multiple drives with the
   * "allDrives" corpora, but all corpora could not be searched. When this happens, it is suggested
   * that clients narrow their query by choosing a different corpus such as "default" or "drive".
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncompleteSearch() {
    return incompleteSearch;
  }

  /**
   * Whether the search process was incomplete. If true, then some search results may be missing,
   * since all documents were not searched. This may occur when searching multiple drives with the
   * "allDrives" corpora, but all corpora could not be searched. When this happens, it is suggested
   * that clients narrow their query by choosing a different corpus such as "default" or "drive".
   * @param incompleteSearch incompleteSearch or {@code null} for none
   */
  public FileList setIncompleteSearch(java.lang.Boolean incompleteSearch) {
    this.incompleteSearch = incompleteSearch;
    return this;
  }

  /**
   * The list of files. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * @return value or {@code null} for none
   */
  public java.util.List<File> getItems() {
    return items;
  }

  /**
   * The list of files. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * @param items items or {@code null} for none
   */
  public FileList setItems(java.util.List<File> items) {
    this.items = items;
    return this;
  }

  /**
   * This is always drive#fileList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#fileList.
   * @param kind kind or {@code null} for none
   */
  public FileList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A link to the next page of files.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextLink() {
    return nextLink;
  }

  /**
   * A link to the next page of files.
   * @param nextLink nextLink or {@code null} for none
   */
  public FileList setNextLink(java.lang.String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * The page token for the next page of files. This will be absent if the end of the files list has
   * been reached. If the token is rejected for any reason, it should be discarded, and pagination
   * should be restarted from the first page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The page token for the next page of files. This will be absent if the end of the files list has
   * been reached. If the token is rejected for any reason, it should be discarded, and pagination
   * should be restarted from the first page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public FileList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
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
  public FileList setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public FileList set(String fieldName, Object value) {
    return (FileList) super.set(fieldName, value);
  }

  @Override
  public FileList clone() {
    return (FileList) super.clone();
  }

}
