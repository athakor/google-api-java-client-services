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

package com.google.api.services.cloudshell.v1alpha1.model;

/**
 * Request message for AuthorizeEnvironment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Shell API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthorizeEnvironmentRequest extends com.google.api.client.json.GenericJson {

  /**
   * The OAuth access token that should be sent to the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessToken;

  /**
   * The time when the credentials expire. If not set, defaults to one hour from when the server
   * received the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The OAuth ID token that should be sent to the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * The OAuth access token that should be sent to the environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessToken() {
    return accessToken;
  }

  /**
   * The OAuth access token that should be sent to the environment.
   * @param accessToken accessToken or {@code null} for none
   */
  public AuthorizeEnvironmentRequest setAccessToken(java.lang.String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * The time when the credentials expire. If not set, defaults to one hour from when the server
   * received the request.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * The time when the credentials expire. If not set, defaults to one hour from when the server
   * received the request.
   * @param expireTime expireTime or {@code null} for none
   */
  public AuthorizeEnvironmentRequest setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * The OAuth ID token that should be sent to the environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * The OAuth ID token that should be sent to the environment.
   * @param idToken idToken or {@code null} for none
   */
  public AuthorizeEnvironmentRequest setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  @Override
  public AuthorizeEnvironmentRequest set(String fieldName, Object value) {
    return (AuthorizeEnvironmentRequest) super.set(fieldName, value);
  }

  @Override
  public AuthorizeEnvironmentRequest clone() {
    return (AuthorizeEnvironmentRequest) super.clone();
  }

}
