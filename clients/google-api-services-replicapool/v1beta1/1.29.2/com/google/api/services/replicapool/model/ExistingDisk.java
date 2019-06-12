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

package com.google.api.services.replicapool.model;

/**
 * A pre-existing persistent disk that will be attached to every Replica in the Pool in READ_ONLY
 * mode.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Replica Pool API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExistingDisk extends com.google.api.client.json.GenericJson {

  /**
   * How the disk will be attached to the Replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskAttachment attachment;

  /**
   * The name of the Persistent Disk resource. The Persistent Disk resource must be in the same zone
   * as the Pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * How the disk will be attached to the Replica.
   * @return value or {@code null} for none
   */
  public DiskAttachment getAttachment() {
    return attachment;
  }

  /**
   * How the disk will be attached to the Replica.
   * @param attachment attachment or {@code null} for none
   */
  public ExistingDisk setAttachment(DiskAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * The name of the Persistent Disk resource. The Persistent Disk resource must be in the same zone
   * as the Pool.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * The name of the Persistent Disk resource. The Persistent Disk resource must be in the same zone
   * as the Pool.
   * @param source source or {@code null} for none
   */
  public ExistingDisk setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  @Override
  public ExistingDisk set(String fieldName, Object value) {
    return (ExistingDisk) super.set(fieldName, value);
  }

  @Override
  public ExistingDisk clone() {
    return (ExistingDisk) super.clone();
  }

}
