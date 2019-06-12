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

package com.google.api.services.jobs.v2.model;

/**
 * Input only.
 *
 * Create job request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateJobRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Please use processing_options. This flag is ignored if processing_options is set.
   *
   * Optional.
   *
   * If set to `true`, the service does not attempt to resolve a more precise address for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableStreetAddressResolution;

  /**
   * Required.
   *
   * The Job to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Job job;

  /**
   * Optional.
   *
   * Options for job processing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobProcessingOptions processingOptions;

  /**
   * Deprecated. Please use processing_options. This flag is ignored if processing_options is set.
   *
   * Optional.
   *
   * If set to `true`, the service does not attempt to resolve a more precise address for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableStreetAddressResolution() {
    return disableStreetAddressResolution;
  }

  /**
   * Deprecated. Please use processing_options. This flag is ignored if processing_options is set.
   *
   * Optional.
   *
   * If set to `true`, the service does not attempt to resolve a more precise address for the job.
   * @param disableStreetAddressResolution disableStreetAddressResolution or {@code null} for none
   */
  public CreateJobRequest setDisableStreetAddressResolution(java.lang.Boolean disableStreetAddressResolution) {
    this.disableStreetAddressResolution = disableStreetAddressResolution;
    return this;
  }

  /**
   * Required.
   *
   * The Job to be created.
   * @return value or {@code null} for none
   */
  public Job getJob() {
    return job;
  }

  /**
   * Required.
   *
   * The Job to be created.
   * @param job job or {@code null} for none
   */
  public CreateJobRequest setJob(Job job) {
    this.job = job;
    return this;
  }

  /**
   * Optional.
   *
   * Options for job processing.
   * @return value or {@code null} for none
   */
  public JobProcessingOptions getProcessingOptions() {
    return processingOptions;
  }

  /**
   * Optional.
   *
   * Options for job processing.
   * @param processingOptions processingOptions or {@code null} for none
   */
  public CreateJobRequest setProcessingOptions(JobProcessingOptions processingOptions) {
    this.processingOptions = processingOptions;
    return this;
  }

  @Override
  public CreateJobRequest set(String fieldName, Object value) {
    return (CreateJobRequest) super.set(fieldName, value);
  }

  @Override
  public CreateJobRequest clone() {
    return (CreateJobRequest) super.clone();
  }

}
