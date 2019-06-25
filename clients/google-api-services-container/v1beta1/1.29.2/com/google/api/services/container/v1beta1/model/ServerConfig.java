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

package com.google.api.services.container.v1beta1.model;

/**
 * Kubernetes Engine service configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServerConfig extends com.google.api.client.json.GenericJson {

  /**
   * Version of Kubernetes the service deploys by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultClusterVersion;

  /**
   * Default image type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultImageType;

  /**
   * List of valid image types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> validImageTypes;

  /**
   * List of valid master versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> validMasterVersions;

  /**
   * List of valid node upgrade target versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> validNodeVersions;

  /**
   * Version of Kubernetes the service deploys by default.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultClusterVersion() {
    return defaultClusterVersion;
  }

  /**
   * Version of Kubernetes the service deploys by default.
   * @param defaultClusterVersion defaultClusterVersion or {@code null} for none
   */
  public ServerConfig setDefaultClusterVersion(java.lang.String defaultClusterVersion) {
    this.defaultClusterVersion = defaultClusterVersion;
    return this;
  }

  /**
   * Default image type.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultImageType() {
    return defaultImageType;
  }

  /**
   * Default image type.
   * @param defaultImageType defaultImageType or {@code null} for none
   */
  public ServerConfig setDefaultImageType(java.lang.String defaultImageType) {
    this.defaultImageType = defaultImageType;
    return this;
  }

  /**
   * List of valid image types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValidImageTypes() {
    return validImageTypes;
  }

  /**
   * List of valid image types.
   * @param validImageTypes validImageTypes or {@code null} for none
   */
  public ServerConfig setValidImageTypes(java.util.List<java.lang.String> validImageTypes) {
    this.validImageTypes = validImageTypes;
    return this;
  }

  /**
   * List of valid master versions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValidMasterVersions() {
    return validMasterVersions;
  }

  /**
   * List of valid master versions.
   * @param validMasterVersions validMasterVersions or {@code null} for none
   */
  public ServerConfig setValidMasterVersions(java.util.List<java.lang.String> validMasterVersions) {
    this.validMasterVersions = validMasterVersions;
    return this;
  }

  /**
   * List of valid node upgrade target versions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValidNodeVersions() {
    return validNodeVersions;
  }

  /**
   * List of valid node upgrade target versions.
   * @param validNodeVersions validNodeVersions or {@code null} for none
   */
  public ServerConfig setValidNodeVersions(java.util.List<java.lang.String> validNodeVersions) {
    this.validNodeVersions = validNodeVersions;
    return this;
  }

  @Override
  public ServerConfig set(String fieldName, Object value) {
    return (ServerConfig) super.set(fieldName, value);
  }

  @Override
  public ServerConfig clone() {
    return (ServerConfig) super.clone();
  }

}
