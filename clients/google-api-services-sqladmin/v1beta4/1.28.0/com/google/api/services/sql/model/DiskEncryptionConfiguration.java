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

package com.google.api.services.sql.model;

/**
 * Disk encryption configuration for an instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskEncryptionConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * This is always sql#diskEncryptionConfiguration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Resource name of KMS key for disk encryption
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * This is always sql#diskEncryptionConfiguration.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#diskEncryptionConfiguration.
   * @param kind kind or {@code null} for none
   */
  public DiskEncryptionConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Resource name of KMS key for disk encryption
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * Resource name of KMS key for disk encryption
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public DiskEncryptionConfiguration setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  @Override
  public DiskEncryptionConfiguration set(String fieldName, Object value) {
    return (DiskEncryptionConfiguration) super.set(fieldName, value);
  }

  @Override
  public DiskEncryptionConfiguration clone() {
    return (DiskEncryptionConfiguration) super.clone();
  }

}
