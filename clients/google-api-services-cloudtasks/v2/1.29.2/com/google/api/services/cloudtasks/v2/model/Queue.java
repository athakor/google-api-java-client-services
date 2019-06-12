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

package com.google.api.services.cloudtasks.v2.model;

/**
 * A queue is a container of related tasks. Queues are configured to manage how those tasks are
 * dispatched. Configurable properties include rate limits, retry options, queue types, and others.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Queue extends com.google.api.client.json.GenericJson {

  /**
   * Overrides for task-level app_engine_routing. These settings apply only to App Engine tasks in
   * this queue.
   *
   * If set, `app_engine_routing_override` is used for all App Engine tasks in the queue, no matter
   * what the setting is for the task-level app_engine_routing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppEngineRouting appEngineRoutingOverride;

  /**
   * Caller-specified and required in CreateQueue, after which it becomes output only.
   *
   * The queue name.
   *
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons (:), or
   * periods (.).    For more information, see    [Identifying    projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the queue's location.    The list of available locations can be obtained by
   * calling    ListLocations.    For more information, see
   * https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers
   * ([0-9]), or   hyphens (-). The maximum length is 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The last time this queue was purged.
   *
   * All tasks that were created before this time were purged.
   *
   * A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-
   * and-queues#purging_all_tasks_from_a_queue).
   *
   * Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue
   * has never been purged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String purgeTime;

  /**
   * Rate limits for task dispatches.
   *
   * rate_limits and retry_config are related because they both control task attempts. However they
   * control task attempts in different ways:
   *
   * * rate_limits controls the total rate of   dispatches from a queue (i.e. all traffic dispatched
   * from the   queue, regardless of whether the dispatch is from a first   attempt or a retry). *
   * retry_config controls what happens to   particular a task after its first attempt fails. That
   * is,   retry_config controls task retries (the   second attempt, third attempt, etc).
   *
   * The queue's actual dispatch rate is the result of:
   *
   * * Number of tasks in the queue * User-specified throttling: rate_limits,   retry_config, and
   * the   queue's state. * System throttling due to `429` (Too Many Requests) or `503` (Service
   * Unavailable) responses from the worker, high error rates, or to smooth   sudden large traffic
   * spikes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RateLimits rateLimits;

  /**
   * Settings that determine the retry behavior.
   *
   * * For tasks created using Cloud Tasks: the queue-level retry settings   apply to all tasks in
   * the queue that were created using Cloud Tasks.   Retry settings cannot be set on individual
   * tasks. * For tasks created using the App Engine SDK: the queue-level retry   settings apply to
   * all tasks in the queue which do not have retry settings   explicitly set on the task and were
   * created by the App Engine SDK. See   [App Engine
   * documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-
   * tasks).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RetryConfig retryConfig;

  /**
   * Output only. The state of the queue.
   *
   * `state` can only be changed by called PauseQueue, ResumeQueue, or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue
   * cannot be used to change `state`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Overrides for task-level app_engine_routing. These settings apply only to App Engine tasks in
   * this queue.
   *
   * If set, `app_engine_routing_override` is used for all App Engine tasks in the queue, no matter
   * what the setting is for the task-level app_engine_routing.
   * @return value or {@code null} for none
   */
  public AppEngineRouting getAppEngineRoutingOverride() {
    return appEngineRoutingOverride;
  }

  /**
   * Overrides for task-level app_engine_routing. These settings apply only to App Engine tasks in
   * this queue.
   *
   * If set, `app_engine_routing_override` is used for all App Engine tasks in the queue, no matter
   * what the setting is for the task-level app_engine_routing.
   * @param appEngineRoutingOverride appEngineRoutingOverride or {@code null} for none
   */
  public Queue setAppEngineRoutingOverride(AppEngineRouting appEngineRoutingOverride) {
    this.appEngineRoutingOverride = appEngineRoutingOverride;
    return this;
  }

  /**
   * Caller-specified and required in CreateQueue, after which it becomes output only.
   *
   * The queue name.
   *
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons (:), or
   * periods (.).    For more information, see    [Identifying    projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the queue's location.    The list of available locations can be obtained by
   * calling    ListLocations.    For more information, see
   * https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers
   * ([0-9]), or   hyphens (-). The maximum length is 100 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Caller-specified and required in CreateQueue, after which it becomes output only.
   *
   * The queue name.
   *
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons (:), or
   * periods (.).    For more information, see    [Identifying    projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the queue's location.    The list of available locations can be obtained by
   * calling    ListLocations.    For more information, see
   * https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers
   * ([0-9]), or   hyphens (-). The maximum length is 100 characters.
   * @param name name or {@code null} for none
   */
  public Queue setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The last time this queue was purged.
   *
   * All tasks that were created before this time were purged.
   *
   * A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-
   * and-queues#purging_all_tasks_from_a_queue).
   *
   * Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue
   * has never been purged.
   * @return value or {@code null} for none
   */
  public String getPurgeTime() {
    return purgeTime;
  }

  /**
   * Output only. The last time this queue was purged.
   *
   * All tasks that were created before this time were purged.
   *
   * A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-
   * and-queues#purging_all_tasks_from_a_queue).
   *
   * Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue
   * has never been purged.
   * @param purgeTime purgeTime or {@code null} for none
   */
  public Queue setPurgeTime(String purgeTime) {
    this.purgeTime = purgeTime;
    return this;
  }

  /**
   * Rate limits for task dispatches.
   *
   * rate_limits and retry_config are related because they both control task attempts. However they
   * control task attempts in different ways:
   *
   * * rate_limits controls the total rate of   dispatches from a queue (i.e. all traffic dispatched
   * from the   queue, regardless of whether the dispatch is from a first   attempt or a retry). *
   * retry_config controls what happens to   particular a task after its first attempt fails. That
   * is,   retry_config controls task retries (the   second attempt, third attempt, etc).
   *
   * The queue's actual dispatch rate is the result of:
   *
   * * Number of tasks in the queue * User-specified throttling: rate_limits,   retry_config, and
   * the   queue's state. * System throttling due to `429` (Too Many Requests) or `503` (Service
   * Unavailable) responses from the worker, high error rates, or to smooth   sudden large traffic
   * spikes.
   * @return value or {@code null} for none
   */
  public RateLimits getRateLimits() {
    return rateLimits;
  }

  /**
   * Rate limits for task dispatches.
   *
   * rate_limits and retry_config are related because they both control task attempts. However they
   * control task attempts in different ways:
   *
   * * rate_limits controls the total rate of   dispatches from a queue (i.e. all traffic dispatched
   * from the   queue, regardless of whether the dispatch is from a first   attempt or a retry). *
   * retry_config controls what happens to   particular a task after its first attempt fails. That
   * is,   retry_config controls task retries (the   second attempt, third attempt, etc).
   *
   * The queue's actual dispatch rate is the result of:
   *
   * * Number of tasks in the queue * User-specified throttling: rate_limits,   retry_config, and
   * the   queue's state. * System throttling due to `429` (Too Many Requests) or `503` (Service
   * Unavailable) responses from the worker, high error rates, or to smooth   sudden large traffic
   * spikes.
   * @param rateLimits rateLimits or {@code null} for none
   */
  public Queue setRateLimits(RateLimits rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  /**
   * Settings that determine the retry behavior.
   *
   * * For tasks created using Cloud Tasks: the queue-level retry settings   apply to all tasks in
   * the queue that were created using Cloud Tasks.   Retry settings cannot be set on individual
   * tasks. * For tasks created using the App Engine SDK: the queue-level retry   settings apply to
   * all tasks in the queue which do not have retry settings   explicitly set on the task and were
   * created by the App Engine SDK. See   [App Engine
   * documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-
   * tasks).
   * @return value or {@code null} for none
   */
  public RetryConfig getRetryConfig() {
    return retryConfig;
  }

  /**
   * Settings that determine the retry behavior.
   *
   * * For tasks created using Cloud Tasks: the queue-level retry settings   apply to all tasks in
   * the queue that were created using Cloud Tasks.   Retry settings cannot be set on individual
   * tasks. * For tasks created using the App Engine SDK: the queue-level retry   settings apply to
   * all tasks in the queue which do not have retry settings   explicitly set on the task and were
   * created by the App Engine SDK. See   [App Engine
   * documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-
   * tasks).
   * @param retryConfig retryConfig or {@code null} for none
   */
  public Queue setRetryConfig(RetryConfig retryConfig) {
    this.retryConfig = retryConfig;
    return this;
  }

  /**
   * Output only. The state of the queue.
   *
   * `state` can only be changed by called PauseQueue, ResumeQueue, or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue
   * cannot be used to change `state`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the queue.
   *
   * `state` can only be changed by called PauseQueue, ResumeQueue, or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue
   * cannot be used to change `state`.
   * @param state state or {@code null} for none
   */
  public Queue setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Queue set(String fieldName, Object value) {
    return (Queue) super.set(fieldName, value);
  }

  @Override
  public Queue clone() {
    return (Queue) super.clone();
  }

}
