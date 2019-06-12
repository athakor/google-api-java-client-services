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
 * App Engine Routing.
 *
 * Defines routing characteristics specific to App Engine - service, version, and instance.
 *
 * For more information about services, versions, and instances see [An Overview of App
 * Engine](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine), [Microservices
 * Architecture on Google App Engine](https://cloud.google.com/appengine/docs/python/microservices-
 * on-app-engine), [App Engine Standard request
 * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed), and
 * [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-
 * requests-are-routed).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngineRouting extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The host that the task is sent to.
   *
   * The host is constructed from the domain name of the app associated with the queue's project ID
   * (for example .appspot.com), and the service, version, and instance. Tasks which were created
   * using the App Engine SDK might have a custom domain name.
   *
   * For more information, see [How Requests are
   * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * App instance.
   *
   * By default, the task is sent to an instance which is available when the task is attempted.
   *
   * Requests can only be sent to a specific instance if [manual scaling is used in App Engine
   * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-
   * engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support
   * instances. For more information, see [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and
   * [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-
   * requests-are-routed).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * App service.
   *
   * By default, the task is sent to the service which is the default service when the task is
   * attempted.
   *
   * For some queues or tasks which were created using the App Engine Task Queue API, host is not
   * parsable into service, version, and instance. For example, some tasks which were created using
   * the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
   * host is not parsable, then service, version, and instance are the empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * App version.
   *
   * By default, the task is sent to the version which is the default version when the task is
   * attempted.
   *
   * For some queues or tasks which were created using the App Engine Task Queue API, host is not
   * parsable into service, version, and instance. For example, some tasks which were created using
   * the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
   * host is not parsable, then service, version, and instance are the empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Output only. The host that the task is sent to.
   *
   * The host is constructed from the domain name of the app associated with the queue's project ID
   * (for example .appspot.com), and the service, version, and instance. Tasks which were created
   * using the App Engine SDK might have a custom domain name.
   *
   * For more information, see [How Requests are
   * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Output only. The host that the task is sent to.
   *
   * The host is constructed from the domain name of the app associated with the queue's project ID
   * (for example .appspot.com), and the service, version, and instance. Tasks which were created
   * using the App Engine SDK might have a custom domain name.
   *
   * For more information, see [How Requests are
   * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
   * @param host host or {@code null} for none
   */
  public AppEngineRouting setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * App instance.
   *
   * By default, the task is sent to an instance which is available when the task is attempted.
   *
   * Requests can only be sent to a specific instance if [manual scaling is used in App Engine
   * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-
   * engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support
   * instances. For more information, see [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and
   * [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-
   * requests-are-routed).
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * App instance.
   *
   * By default, the task is sent to an instance which is available when the task is attempted.
   *
   * Requests can only be sent to a specific instance if [manual scaling is used in App Engine
   * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-
   * engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support
   * instances. For more information, see [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and
   * [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-
   * requests-are-routed).
   * @param instance instance or {@code null} for none
   */
  public AppEngineRouting setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * App service.
   *
   * By default, the task is sent to the service which is the default service when the task is
   * attempted.
   *
   * For some queues or tasks which were created using the App Engine Task Queue API, host is not
   * parsable into service, version, and instance. For example, some tasks which were created using
   * the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
   * host is not parsable, then service, version, and instance are the empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * App service.
   *
   * By default, the task is sent to the service which is the default service when the task is
   * attempted.
   *
   * For some queues or tasks which were created using the App Engine Task Queue API, host is not
   * parsable into service, version, and instance. For example, some tasks which were created using
   * the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
   * host is not parsable, then service, version, and instance are the empty string.
   * @param service service or {@code null} for none
   */
  public AppEngineRouting setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * App version.
   *
   * By default, the task is sent to the version which is the default version when the task is
   * attempted.
   *
   * For some queues or tasks which were created using the App Engine Task Queue API, host is not
   * parsable into service, version, and instance. For example, some tasks which were created using
   * the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
   * host is not parsable, then service, version, and instance are the empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * App version.
   *
   * By default, the task is sent to the version which is the default version when the task is
   * attempted.
   *
   * For some queues or tasks which were created using the App Engine Task Queue API, host is not
   * parsable into service, version, and instance. For example, some tasks which were created using
   * the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
   * host is not parsable, then service, version, and instance are the empty string.
   * @param version version or {@code null} for none
   */
  public AppEngineRouting setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public AppEngineRouting set(String fieldName, Object value) {
    return (AppEngineRouting) super.set(fieldName, value);
  }

  @Override
  public AppEngineRouting clone() {
    return (AppEngineRouting) super.clone();
  }

}
