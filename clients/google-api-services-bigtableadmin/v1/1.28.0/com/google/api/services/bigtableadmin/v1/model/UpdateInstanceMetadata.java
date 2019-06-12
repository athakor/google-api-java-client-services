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

package com.google.api.services.bigtableadmin.v1.model;

/**
 * The metadata for the Operation returned by UpdateInstance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateInstanceMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time at which the operation failed or was completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String finishTime;

  /**
   * The request that prompted the initiation of this UpdateInstance operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PartialUpdateInstanceRequest originalRequest;

  /**
   * The time at which the original request was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String requestTime;

  /**
   * The time at which the operation failed or was completed successfully.
   * @return value or {@code null} for none
   */
  public String getFinishTime() {
    return finishTime;
  }

  /**
   * The time at which the operation failed or was completed successfully.
   * @param finishTime finishTime or {@code null} for none
   */
  public UpdateInstanceMetadata setFinishTime(String finishTime) {
    this.finishTime = finishTime;
    return this;
  }

  /**
   * The request that prompted the initiation of this UpdateInstance operation.
   * @return value or {@code null} for none
   */
  public PartialUpdateInstanceRequest getOriginalRequest() {
    return originalRequest;
  }

  /**
   * The request that prompted the initiation of this UpdateInstance operation.
   * @param originalRequest originalRequest or {@code null} for none
   */
  public UpdateInstanceMetadata setOriginalRequest(PartialUpdateInstanceRequest originalRequest) {
    this.originalRequest = originalRequest;
    return this;
  }

  /**
   * The time at which the original request was received.
   * @return value or {@code null} for none
   */
  public String getRequestTime() {
    return requestTime;
  }

  /**
   * The time at which the original request was received.
   * @param requestTime requestTime or {@code null} for none
   */
  public UpdateInstanceMetadata setRequestTime(String requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  @Override
  public UpdateInstanceMetadata set(String fieldName, Object value) {
    return (UpdateInstanceMetadata) super.set(fieldName, value);
  }

  @Override
  public UpdateInstanceMetadata clone() {
    return (UpdateInstanceMetadata) super.clone();
  }

}
