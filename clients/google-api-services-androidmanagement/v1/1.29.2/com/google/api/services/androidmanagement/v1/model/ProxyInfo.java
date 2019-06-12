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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Configuration info for an HTTP proxy. For a direct proxy, set the host, port, and excluded_hosts
 * fields. For a PAC script proxy, set the pac_uri field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProxyInfo extends com.google.api.client.json.GenericJson {

  /**
   * For a direct proxy, the hosts for which the proxy is bypassed. The host names may contain
   * wildcards such as *.example.com.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludedHosts;

  /**
   * The host of the direct proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * The URI of the PAC script used to configure the proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pacUri;

  /**
   * The port of the direct proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * For a direct proxy, the hosts for which the proxy is bypassed. The host names may contain
   * wildcards such as *.example.com.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludedHosts() {
    return excludedHosts;
  }

  /**
   * For a direct proxy, the hosts for which the proxy is bypassed. The host names may contain
   * wildcards such as *.example.com.
   * @param excludedHosts excludedHosts or {@code null} for none
   */
  public ProxyInfo setExcludedHosts(java.util.List<java.lang.String> excludedHosts) {
    this.excludedHosts = excludedHosts;
    return this;
  }

  /**
   * The host of the direct proxy.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * The host of the direct proxy.
   * @param host host or {@code null} for none
   */
  public ProxyInfo setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * The URI of the PAC script used to configure the proxy.
   * @return value or {@code null} for none
   */
  public java.lang.String getPacUri() {
    return pacUri;
  }

  /**
   * The URI of the PAC script used to configure the proxy.
   * @param pacUri pacUri or {@code null} for none
   */
  public ProxyInfo setPacUri(java.lang.String pacUri) {
    this.pacUri = pacUri;
    return this;
  }

  /**
   * The port of the direct proxy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The port of the direct proxy.
   * @param port port or {@code null} for none
   */
  public ProxyInfo setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  @Override
  public ProxyInfo set(String fieldName, Object value) {
    return (ProxyInfo) super.set(fieldName, value);
  }

  @Override
  public ProxyInfo clone() {
    return (ProxyInfo) super.clone();
  }

}
