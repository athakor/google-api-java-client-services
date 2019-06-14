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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ListRoutinesResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListRoutinesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to request the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Routines in the requested dataset. Only the following fields are populated: etag, project_id,
   * dataset_id, routine_id, routine_type, creation_time, last_modified_time, language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Routine> routines;

  /**
   * A token to request the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to request the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListRoutinesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Routines in the requested dataset. Only the following fields are populated: etag, project_id,
   * dataset_id, routine_id, routine_type, creation_time, last_modified_time, language.
   * @return value or {@code null} for none
   */
  public java.util.List<Routine> getRoutines() {
    return routines;
  }

  /**
   * Routines in the requested dataset. Only the following fields are populated: etag, project_id,
   * dataset_id, routine_id, routine_type, creation_time, last_modified_time, language.
   * @param routines routines or {@code null} for none
   */
  public ListRoutinesResponse setRoutines(java.util.List<Routine> routines) {
    this.routines = routines;
    return this;
  }

  @Override
  public ListRoutinesResponse set(String fieldName, Object value) {
    return (ListRoutinesResponse) super.set(fieldName, value);
  }

  @Override
  public ListRoutinesResponse clone() {
    return (ListRoutinesResponse) super.clone();
  }

}
