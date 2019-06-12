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

package com.google.api.services.androidenterprise.model;

/**
 * The user resources for the group license.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GroupLicenseUsersListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#groupLicenseUsersListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A user of an enterprise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<User> user;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#groupLicenseUsersListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#groupLicenseUsersListResponse".
   * @param kind kind or {@code null} for none
   */
  public GroupLicenseUsersListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A user of an enterprise.
   * @return value or {@code null} for none
   */
  public java.util.List<User> getUser() {
    return user;
  }

  /**
   * A user of an enterprise.
   * @param user user or {@code null} for none
   */
  public GroupLicenseUsersListResponse setUser(java.util.List<User> user) {
    this.user = user;
    return this;
  }

  @Override
  public GroupLicenseUsersListResponse set(String fieldName, Object value) {
    return (GroupLicenseUsersListResponse) super.set(fieldName, value);
  }

  @Override
  public GroupLicenseUsersListResponse clone() {
    return (GroupLicenseUsersListResponse) super.clone();
  }

}
