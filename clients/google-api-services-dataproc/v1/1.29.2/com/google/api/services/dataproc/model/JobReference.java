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

package com.google.api.services.dataproc.model;

/**
 * Encapsulates the full scoping used to reference a job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobReference extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The job ID, which must be unique within the project.The ID must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100
   * characters.If not specified by the caller, the job ID will be provided by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * Required. The ID of the Google Cloud Platform project that the job belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Optional. The job ID, which must be unique within the project.The ID must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100
   * characters.If not specified by the caller, the job ID will be provided by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * Optional. The job ID, which must be unique within the project.The ID must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100
   * characters.If not specified by the caller, the job ID will be provided by the server.
   * @param jobId jobId or {@code null} for none
   */
  public JobReference setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Required. The ID of the Google Cloud Platform project that the job belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. The ID of the Google Cloud Platform project that the job belongs to.
   * @param projectId projectId or {@code null} for none
   */
  public JobReference setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public JobReference set(String fieldName, Object value) {
    return (JobReference) super.set(fieldName, value);
  }

  @Override
  public JobReference clone() {
    return (JobReference) super.clone();
  }

}
