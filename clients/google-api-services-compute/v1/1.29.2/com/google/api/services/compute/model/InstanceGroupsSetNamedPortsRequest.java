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

package com.google.api.services.compute.model;

/**
 * Model definition for InstanceGroupsSetNamedPortsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupsSetNamedPortsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The fingerprint of the named ports information for this instance group. Use this optional
   * property to prevent conflicts when multiple users change the named ports settings concurrently.
   * Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in
   * your request to ensure that you do not overwrite changes that were applied from another
   * concurrent request. A request with an incorrect fingerprint will fail with error 412
   * conditionNotMet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * The list of named ports to set for this instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NamedPort> namedPorts;

  /**
   * The fingerprint of the named ports information for this instance group. Use this optional
   * property to prevent conflicts when multiple users change the named ports settings concurrently.
   * Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in
   * your request to ensure that you do not overwrite changes that were applied from another
   * concurrent request. A request with an incorrect fingerprint will fail with error 412
   * conditionNotMet.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * The fingerprint of the named ports information for this instance group. Use this optional
   * property to prevent conflicts when multiple users change the named ports settings concurrently.
   * Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in
   * your request to ensure that you do not overwrite changes that were applied from another
   * concurrent request. A request with an incorrect fingerprint will fail with error 412
   * conditionNotMet.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * The fingerprint of the named ports information for this instance group. Use this optional
   * property to prevent conflicts when multiple users change the named ports settings concurrently.
   * Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in
   * your request to ensure that you do not overwrite changes that were applied from another
   * concurrent request. A request with an incorrect fingerprint will fail with error 412
   * conditionNotMet.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public InstanceGroupsSetNamedPortsRequest setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * The fingerprint of the named ports information for this instance group. Use this optional
   * property to prevent conflicts when multiple users change the named ports settings concurrently.
   * Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in
   * your request to ensure that you do not overwrite changes that were applied from another
   * concurrent request. A request with an incorrect fingerprint will fail with error 412
   * conditionNotMet.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public InstanceGroupsSetNamedPortsRequest encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * The list of named ports to set for this instance group.
   * @return value or {@code null} for none
   */
  public java.util.List<NamedPort> getNamedPorts() {
    return namedPorts;
  }

  /**
   * The list of named ports to set for this instance group.
   * @param namedPorts namedPorts or {@code null} for none
   */
  public InstanceGroupsSetNamedPortsRequest setNamedPorts(java.util.List<NamedPort> namedPorts) {
    this.namedPorts = namedPorts;
    return this;
  }

  @Override
  public InstanceGroupsSetNamedPortsRequest set(String fieldName, Object value) {
    return (InstanceGroupsSetNamedPortsRequest) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupsSetNamedPortsRequest clone() {
    return (InstanceGroupsSetNamedPortsRequest) super.clone();
  }

}
