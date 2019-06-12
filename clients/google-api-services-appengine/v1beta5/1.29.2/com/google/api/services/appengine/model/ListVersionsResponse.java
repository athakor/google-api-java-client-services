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

package com.google.api.services.appengine.model;

/**
 * Response message for Versions.ListVersions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListVersionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Continuation token for fetching the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The versions belonging to the requested service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Version> versions;

  /**
   * Continuation token for fetching the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token for fetching the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListVersionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The versions belonging to the requested service.
   * @return value or {@code null} for none
   */
  public java.util.List<Version> getVersions() {
    return versions;
  }

  /**
   * The versions belonging to the requested service.
   * @param versions versions or {@code null} for none
   */
  public ListVersionsResponse setVersions(java.util.List<Version> versions) {
    this.versions = versions;
    return this;
  }

  @Override
  public ListVersionsResponse set(String fieldName, Object value) {
    return (ListVersionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListVersionsResponse clone() {
    return (ListVersionsResponse) super.clone();
  }

}
