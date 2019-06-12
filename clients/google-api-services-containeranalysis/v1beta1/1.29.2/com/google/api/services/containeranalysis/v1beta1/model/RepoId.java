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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * A unique identifier for a Cloud Repo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepoId extends com.google.api.client.json.GenericJson {

  /**
   * A combination of a project ID and a repo name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProjectRepoId projectRepoId;

  /**
   * A server-assigned, globally unique identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * A combination of a project ID and a repo name.
   * @return value or {@code null} for none
   */
  public ProjectRepoId getProjectRepoId() {
    return projectRepoId;
  }

  /**
   * A combination of a project ID and a repo name.
   * @param projectRepoId projectRepoId or {@code null} for none
   */
  public RepoId setProjectRepoId(ProjectRepoId projectRepoId) {
    this.projectRepoId = projectRepoId;
    return this;
  }

  /**
   * A server-assigned, globally unique identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * A server-assigned, globally unique identifier.
   * @param uid uid or {@code null} for none
   */
  public RepoId setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public RepoId set(String fieldName, Object value) {
    return (RepoId) super.set(fieldName, value);
  }

  @Override
  public RepoId clone() {
    return (RepoId) super.clone();
  }

}
