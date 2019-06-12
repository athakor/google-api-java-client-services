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

package com.google.api.services.dataflow.model;

/**
 * Metadata for a Datastore connector used by the job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatastoreIODetails extends com.google.api.client.json.GenericJson {

  /**
   * Namespace used in the connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * ProjectId accessed in the connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Namespace used in the connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * Namespace used in the connection.
   * @param namespace namespace or {@code null} for none
   */
  public DatastoreIODetails setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * ProjectId accessed in the connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * ProjectId accessed in the connection.
   * @param projectId projectId or {@code null} for none
   */
  public DatastoreIODetails setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public DatastoreIODetails set(String fieldName, Object value) {
    return (DatastoreIODetails) super.set(fieldName, value);
  }

  @Override
  public DatastoreIODetails clone() {
    return (DatastoreIODetails) super.clone();
  }

}
