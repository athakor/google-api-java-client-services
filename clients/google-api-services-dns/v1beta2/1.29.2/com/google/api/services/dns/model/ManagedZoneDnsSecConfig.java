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

package com.google.api.services.dns.model;

/**
 * Model definition for ManagedZoneDnsSecConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedZoneDnsSecConfig extends com.google.api.client.json.GenericJson {

  /**
   * Specifies parameters that will be used for generating initial DnsKeys for this ManagedZone.
   * Output only while state is not OFF.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DnsKeySpec> defaultKeySpecs;

  static {
    // hack to force ProGuard to consider DnsKeySpec used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DnsKeySpec.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZoneDnsSecConfig".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Specifies the mechanism used to provide authenticated denial-of-existence responses. Output
   * only while state is not OFF.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nonExistence;

  /**
   * Specifies whether DNSSEC is enabled, and what mode it is in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Specifies parameters that will be used for generating initial DnsKeys for this ManagedZone.
   * Output only while state is not OFF.
   * @return value or {@code null} for none
   */
  public java.util.List<DnsKeySpec> getDefaultKeySpecs() {
    return defaultKeySpecs;
  }

  /**
   * Specifies parameters that will be used for generating initial DnsKeys for this ManagedZone.
   * Output only while state is not OFF.
   * @param defaultKeySpecs defaultKeySpecs or {@code null} for none
   */
  public ManagedZoneDnsSecConfig setDefaultKeySpecs(java.util.List<DnsKeySpec> defaultKeySpecs) {
    this.defaultKeySpecs = defaultKeySpecs;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZoneDnsSecConfig".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZoneDnsSecConfig".
   * @param kind kind or {@code null} for none
   */
  public ManagedZoneDnsSecConfig setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Specifies the mechanism used to provide authenticated denial-of-existence responses. Output
   * only while state is not OFF.
   * @return value or {@code null} for none
   */
  public java.lang.String getNonExistence() {
    return nonExistence;
  }

  /**
   * Specifies the mechanism used to provide authenticated denial-of-existence responses. Output
   * only while state is not OFF.
   * @param nonExistence nonExistence or {@code null} for none
   */
  public ManagedZoneDnsSecConfig setNonExistence(java.lang.String nonExistence) {
    this.nonExistence = nonExistence;
    return this;
  }

  /**
   * Specifies whether DNSSEC is enabled, and what mode it is in.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Specifies whether DNSSEC is enabled, and what mode it is in.
   * @param state state or {@code null} for none
   */
  public ManagedZoneDnsSecConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public ManagedZoneDnsSecConfig set(String fieldName, Object value) {
    return (ManagedZoneDnsSecConfig) super.set(fieldName, value);
  }

  @Override
  public ManagedZoneDnsSecConfig clone() {
    return (ManagedZoneDnsSecConfig) super.clone();
  }

}
