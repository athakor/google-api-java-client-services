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

package com.google.api.services.cloudscheduler.v1.model;

/**
 * Settings that determine the retry behavior.
 *
 * By default, if a job does not complete successfully (meaning that an acknowledgement is not
 * received from the handler, then it will be retried with exponential backoff according to the
 * settings in RetryConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Scheduler API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RetryConfig extends com.google.api.client.json.GenericJson {

  /**
   * The maximum amount of time to wait before retrying a job after it fails.
   *
   * The default value of this field is 1 hour.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxBackoffDuration;

  /**
   * The time between retries will double `max_doublings` times.
   *
   * A job's retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then
   * increases linearly, and finally retries retries at intervals of max_backoff_duration up to
   * retry_count times.
   *
   * For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings`
   * is 3, then the a job will first be retried in 10s. The retry interval will double three times,
   * and then increase linearly by 2^3 * 10s.  Finally, the job will retry at intervals of
   * max_backoff_duration until the job has been attempted retry_count times. Thus, the requests
   * will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, ....
   *
   * The default value of this field is 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxDoublings;

  /**
   * The time limit for retrying a failed job, measured from time when an execution was first
   * attempted. If specified with retry_count, the job will be retried until both limits are
   * reached.
   *
   * The default value for max_retry_duration is zero, which means retry duration is unlimited.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxRetryDuration;

  /**
   * The minimum amount of time to wait before retrying a job after it fails.
   *
   * The default value of this field is 5 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String minBackoffDuration;

  /**
   * The number of attempts that the system will make to run a job using the exponential backoff
   * procedure described by max_doublings.
   *
   * The default value of retry_count is zero.
   *
   * If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud
   * Scheduler system will wait for the next scheduled execution time.
   *
   * If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts,
   * using exponential backoff, retry_count times, or until the next scheduled execution time,
   * whichever comes first.
   *
   * Values greater than 5 and negative values are not allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer retryCount;

  /**
   * The maximum amount of time to wait before retrying a job after it fails.
   *
   * The default value of this field is 1 hour.
   * @return value or {@code null} for none
   */
  public String getMaxBackoffDuration() {
    return maxBackoffDuration;
  }

  /**
   * The maximum amount of time to wait before retrying a job after it fails.
   *
   * The default value of this field is 1 hour.
   * @param maxBackoffDuration maxBackoffDuration or {@code null} for none
   */
  public RetryConfig setMaxBackoffDuration(String maxBackoffDuration) {
    this.maxBackoffDuration = maxBackoffDuration;
    return this;
  }

  /**
   * The time between retries will double `max_doublings` times.
   *
   * A job's retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then
   * increases linearly, and finally retries retries at intervals of max_backoff_duration up to
   * retry_count times.
   *
   * For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings`
   * is 3, then the a job will first be retried in 10s. The retry interval will double three times,
   * and then increase linearly by 2^3 * 10s.  Finally, the job will retry at intervals of
   * max_backoff_duration until the job has been attempted retry_count times. Thus, the requests
   * will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, ....
   *
   * The default value of this field is 5.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxDoublings() {
    return maxDoublings;
  }

  /**
   * The time between retries will double `max_doublings` times.
   *
   * A job's retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then
   * increases linearly, and finally retries retries at intervals of max_backoff_duration up to
   * retry_count times.
   *
   * For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings`
   * is 3, then the a job will first be retried in 10s. The retry interval will double three times,
   * and then increase linearly by 2^3 * 10s.  Finally, the job will retry at intervals of
   * max_backoff_duration until the job has been attempted retry_count times. Thus, the requests
   * will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, ....
   *
   * The default value of this field is 5.
   * @param maxDoublings maxDoublings or {@code null} for none
   */
  public RetryConfig setMaxDoublings(java.lang.Integer maxDoublings) {
    this.maxDoublings = maxDoublings;
    return this;
  }

  /**
   * The time limit for retrying a failed job, measured from time when an execution was first
   * attempted. If specified with retry_count, the job will be retried until both limits are
   * reached.
   *
   * The default value for max_retry_duration is zero, which means retry duration is unlimited.
   * @return value or {@code null} for none
   */
  public String getMaxRetryDuration() {
    return maxRetryDuration;
  }

  /**
   * The time limit for retrying a failed job, measured from time when an execution was first
   * attempted. If specified with retry_count, the job will be retried until both limits are
   * reached.
   *
   * The default value for max_retry_duration is zero, which means retry duration is unlimited.
   * @param maxRetryDuration maxRetryDuration or {@code null} for none
   */
  public RetryConfig setMaxRetryDuration(String maxRetryDuration) {
    this.maxRetryDuration = maxRetryDuration;
    return this;
  }

  /**
   * The minimum amount of time to wait before retrying a job after it fails.
   *
   * The default value of this field is 5 seconds.
   * @return value or {@code null} for none
   */
  public String getMinBackoffDuration() {
    return minBackoffDuration;
  }

  /**
   * The minimum amount of time to wait before retrying a job after it fails.
   *
   * The default value of this field is 5 seconds.
   * @param minBackoffDuration minBackoffDuration or {@code null} for none
   */
  public RetryConfig setMinBackoffDuration(String minBackoffDuration) {
    this.minBackoffDuration = minBackoffDuration;
    return this;
  }

  /**
   * The number of attempts that the system will make to run a job using the exponential backoff
   * procedure described by max_doublings.
   *
   * The default value of retry_count is zero.
   *
   * If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud
   * Scheduler system will wait for the next scheduled execution time.
   *
   * If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts,
   * using exponential backoff, retry_count times, or until the next scheduled execution time,
   * whichever comes first.
   *
   * Values greater than 5 and negative values are not allowed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRetryCount() {
    return retryCount;
  }

  /**
   * The number of attempts that the system will make to run a job using the exponential backoff
   * procedure described by max_doublings.
   *
   * The default value of retry_count is zero.
   *
   * If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud
   * Scheduler system will wait for the next scheduled execution time.
   *
   * If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts,
   * using exponential backoff, retry_count times, or until the next scheduled execution time,
   * whichever comes first.
   *
   * Values greater than 5 and negative values are not allowed.
   * @param retryCount retryCount or {@code null} for none
   */
  public RetryConfig setRetryCount(java.lang.Integer retryCount) {
    this.retryCount = retryCount;
    return this;
  }

  @Override
  public RetryConfig set(String fieldName, Object value) {
    return (RetryConfig) super.set(fieldName, value);
  }

  @Override
  public RetryConfig clone() {
    return (RetryConfig) super.clone();
  }

}
