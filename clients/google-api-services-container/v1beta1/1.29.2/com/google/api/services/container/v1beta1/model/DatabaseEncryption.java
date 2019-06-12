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
 * Configuration of etcd encryption.
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
public final class DatabaseEncryption extends com.google.api.client.json.GenericJson {

  /**
   * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-
   * project/locations/global/keyRings/my-ring/cryptoKeys/my-key
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyName;

  /**
   * Denotes the state of etcd encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-
   * project/locations/global/keyRings/my-ring/cryptoKeys/my-key
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyName() {
    return keyName;
  }

  /**
   * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-
   * project/locations/global/keyRings/my-ring/cryptoKeys/my-key
   * @param keyName keyName or {@code null} for none
   */
  public DatabaseEncryption setKeyName(java.lang.String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Denotes the state of etcd encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Denotes the state of etcd encryption.
   * @param state state or {@code null} for none
   */
  public DatabaseEncryption setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public DatabaseEncryption set(String fieldName, Object value) {
    return (DatabaseEncryption) super.set(fieldName, value);
  }

  @Override
  public DatabaseEncryption clone() {
    return (DatabaseEncryption) super.clone();
  }

}
