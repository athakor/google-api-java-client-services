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

package com.google.api.services.iam.v1.model;

/**
 * The response containing permissions which can be tested on a resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryTestablePermissionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * To retrieve the next page of results, set `QueryTestableRolesRequest.page_token` to this value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The Permissions testable on the requested resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Permission> permissions;

  static {
    // hack to force ProGuard to consider Permission used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Permission.class);
  }

  /**
   * To retrieve the next page of results, set `QueryTestableRolesRequest.page_token` to this value.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * To retrieve the next page of results, set `QueryTestableRolesRequest.page_token` to this value.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public QueryTestablePermissionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The Permissions testable on the requested resource.
   * @return value or {@code null} for none
   */
  public java.util.List<Permission> getPermissions() {
    return permissions;
  }

  /**
   * The Permissions testable on the requested resource.
   * @param permissions permissions or {@code null} for none
   */
  public QueryTestablePermissionsResponse setPermissions(java.util.List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  @Override
  public QueryTestablePermissionsResponse set(String fieldName, Object value) {
    return (QueryTestablePermissionsResponse) super.set(fieldName, value);
  }

  @Override
  public QueryTestablePermissionsResponse clone() {
    return (QueryTestablePermissionsResponse) super.clone();
  }

}
