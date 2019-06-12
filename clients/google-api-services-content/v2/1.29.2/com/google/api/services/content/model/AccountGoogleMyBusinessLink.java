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

package com.google.api.services.content.model;

/**
 * Model definition for AccountGoogleMyBusinessLink.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountGoogleMyBusinessLink extends com.google.api.client.json.GenericJson {

  /**
   * The GMB email address of which a specific account within a GMB account. A sample account within
   * a GMB account could be a business account with set of locations, managed under the GMB account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gmbEmail;

  /**
   * Status of the link between this Merchant Center account and the GMB account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The GMB email address of which a specific account within a GMB account. A sample account within
   * a GMB account could be a business account with set of locations, managed under the GMB account.
   * @return value or {@code null} for none
   */
  public java.lang.String getGmbEmail() {
    return gmbEmail;
  }

  /**
   * The GMB email address of which a specific account within a GMB account. A sample account within
   * a GMB account could be a business account with set of locations, managed under the GMB account.
   * @param gmbEmail gmbEmail or {@code null} for none
   */
  public AccountGoogleMyBusinessLink setGmbEmail(java.lang.String gmbEmail) {
    this.gmbEmail = gmbEmail;
    return this;
  }

  /**
   * Status of the link between this Merchant Center account and the GMB account.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the link between this Merchant Center account and the GMB account.
   * @param status status or {@code null} for none
   */
  public AccountGoogleMyBusinessLink setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public AccountGoogleMyBusinessLink set(String fieldName, Object value) {
    return (AccountGoogleMyBusinessLink) super.set(fieldName, value);
  }

  @Override
  public AccountGoogleMyBusinessLink clone() {
    return (AccountGoogleMyBusinessLink) super.clone();
  }

}
