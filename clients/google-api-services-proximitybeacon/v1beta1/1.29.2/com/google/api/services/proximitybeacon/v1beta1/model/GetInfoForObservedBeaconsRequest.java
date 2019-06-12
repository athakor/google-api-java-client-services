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

package com.google.api.services.proximitybeacon.v1beta1.model;

/**
 * Request for beacon and attachment information about beacons that a mobile client has encountered
 * "in the wild".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Proximity Beacon API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetInfoForObservedBeaconsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Specifies what kind of attachments to include in the response. When given, the response will
   * include only attachments of the given types. When empty, no attachments will be returned. Must
   * be in the format namespace/type. Accepts `*` to specify all types in all namespaces owned by
   * the client. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> namespacedTypes;

  /**
   * The beacons that the client has encountered. At least one must be given.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Observation> observations;

  /**
   * Specifies what kind of attachments to include in the response. When given, the response will
   * include only attachments of the given types. When empty, no attachments will be returned. Must
   * be in the format namespace/type. Accepts `*` to specify all types in all namespaces owned by
   * the client. Optional.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNamespacedTypes() {
    return namespacedTypes;
  }

  /**
   * Specifies what kind of attachments to include in the response. When given, the response will
   * include only attachments of the given types. When empty, no attachments will be returned. Must
   * be in the format namespace/type. Accepts `*` to specify all types in all namespaces owned by
   * the client. Optional.
   * @param namespacedTypes namespacedTypes or {@code null} for none
   */
  public GetInfoForObservedBeaconsRequest setNamespacedTypes(java.util.List<java.lang.String> namespacedTypes) {
    this.namespacedTypes = namespacedTypes;
    return this;
  }

  /**
   * The beacons that the client has encountered. At least one must be given.
   * @return value or {@code null} for none
   */
  public java.util.List<Observation> getObservations() {
    return observations;
  }

  /**
   * The beacons that the client has encountered. At least one must be given.
   * @param observations observations or {@code null} for none
   */
  public GetInfoForObservedBeaconsRequest setObservations(java.util.List<Observation> observations) {
    this.observations = observations;
    return this;
  }

  @Override
  public GetInfoForObservedBeaconsRequest set(String fieldName, Object value) {
    return (GetInfoForObservedBeaconsRequest) super.set(fieldName, value);
  }

  @Override
  public GetInfoForObservedBeaconsRequest clone() {
    return (GetInfoForObservedBeaconsRequest) super.clone();
  }

}
