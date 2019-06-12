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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Metadata about the request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RequestMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The IP address of the caller. For caller from internet, this will be public IPv4 or IPv6
   * address. For caller from a Compute Engine VM with external IP address, this will be the VM's
   * external IP address. For caller from a Compute Engine VM without external IP address, if the VM
   * is in the same organization (or project) as the accessed resource, `caller_ip` will be the VM's
   * internal IPv4 address, otherwise the `caller_ip` will be redacted to "gce-internal-ip". See
   * https://cloud.google.com/compute/docs/vpc/ for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callerIp;

  /**
   * The network of the caller. Set only if the network host project is part of the same GCP
   * organization (or project) as the accessed resource. See
   * https://cloud.google.com/compute/docs/vpc/ for more information. This is a scheme-less URI full
   * resource name. For example:
   *
   *     "//compute.googleapis.com/projects/PROJECT_ID/global/networks/NETWORK_ID"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callerNetwork;

  /**
   * The user agent of the caller. This information is not authenticated and should be treated
   * accordingly. For example:
   *
   * +   `google-api-python-client/1.4.0`:     The request was made by the Google API client for
   * Python. +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:     The request
   * was made by the Google Cloud SDK CLI (gcloud). +   `AppEngine-Google;
   * (+http://code.google.com/appengine; appid: s~my-project`:     The request was made from the
   * `my-project` App Engine app. NOLINT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callerSuppliedUserAgent;

  /**
   * The destination of a network activity, such as accepting a TCP connection. In a multi hop
   * network activity, the destination represents the receiver of the last hop. Only two fields are
   * used in this message, Peer.port and Peer.ip. These fields are optionally populated by those
   * services utilizing the IAM condition feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Peer destinationAttributes;

  /**
   * Request attributes used in IAM condition evaluation. This field contains request attributes
   * like request time and access levels associated with the request.
   *
   * To get the whole view of the attributes used in IAM condition evaluation, the user must also
   * look into `AuditLog.authentication_info.resource_attributes`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Request requestAttributes;

  /**
   * The IP address of the caller. For caller from internet, this will be public IPv4 or IPv6
   * address. For caller from a Compute Engine VM with external IP address, this will be the VM's
   * external IP address. For caller from a Compute Engine VM without external IP address, if the VM
   * is in the same organization (or project) as the accessed resource, `caller_ip` will be the VM's
   * internal IPv4 address, otherwise the `caller_ip` will be redacted to "gce-internal-ip". See
   * https://cloud.google.com/compute/docs/vpc/ for more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getCallerIp() {
    return callerIp;
  }

  /**
   * The IP address of the caller. For caller from internet, this will be public IPv4 or IPv6
   * address. For caller from a Compute Engine VM with external IP address, this will be the VM's
   * external IP address. For caller from a Compute Engine VM without external IP address, if the VM
   * is in the same organization (or project) as the accessed resource, `caller_ip` will be the VM's
   * internal IPv4 address, otherwise the `caller_ip` will be redacted to "gce-internal-ip". See
   * https://cloud.google.com/compute/docs/vpc/ for more information.
   * @param callerIp callerIp or {@code null} for none
   */
  public RequestMetadata setCallerIp(java.lang.String callerIp) {
    this.callerIp = callerIp;
    return this;
  }

  /**
   * The network of the caller. Set only if the network host project is part of the same GCP
   * organization (or project) as the accessed resource. See
   * https://cloud.google.com/compute/docs/vpc/ for more information. This is a scheme-less URI full
   * resource name. For example:
   *
   *     "//compute.googleapis.com/projects/PROJECT_ID/global/networks/NETWORK_ID"
   * @return value or {@code null} for none
   */
  public java.lang.String getCallerNetwork() {
    return callerNetwork;
  }

  /**
   * The network of the caller. Set only if the network host project is part of the same GCP
   * organization (or project) as the accessed resource. See
   * https://cloud.google.com/compute/docs/vpc/ for more information. This is a scheme-less URI full
   * resource name. For example:
   *
   *     "//compute.googleapis.com/projects/PROJECT_ID/global/networks/NETWORK_ID"
   * @param callerNetwork callerNetwork or {@code null} for none
   */
  public RequestMetadata setCallerNetwork(java.lang.String callerNetwork) {
    this.callerNetwork = callerNetwork;
    return this;
  }

  /**
   * The user agent of the caller. This information is not authenticated and should be treated
   * accordingly. For example:
   *
   * +   `google-api-python-client/1.4.0`:     The request was made by the Google API client for
   * Python. +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:     The request
   * was made by the Google Cloud SDK CLI (gcloud). +   `AppEngine-Google;
   * (+http://code.google.com/appengine; appid: s~my-project`:     The request was made from the
   * `my-project` App Engine app. NOLINT
   * @return value or {@code null} for none
   */
  public java.lang.String getCallerSuppliedUserAgent() {
    return callerSuppliedUserAgent;
  }

  /**
   * The user agent of the caller. This information is not authenticated and should be treated
   * accordingly. For example:
   *
   * +   `google-api-python-client/1.4.0`:     The request was made by the Google API client for
   * Python. +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:     The request
   * was made by the Google Cloud SDK CLI (gcloud). +   `AppEngine-Google;
   * (+http://code.google.com/appengine; appid: s~my-project`:     The request was made from the
   * `my-project` App Engine app. NOLINT
   * @param callerSuppliedUserAgent callerSuppliedUserAgent or {@code null} for none
   */
  public RequestMetadata setCallerSuppliedUserAgent(java.lang.String callerSuppliedUserAgent) {
    this.callerSuppliedUserAgent = callerSuppliedUserAgent;
    return this;
  }

  /**
   * The destination of a network activity, such as accepting a TCP connection. In a multi hop
   * network activity, the destination represents the receiver of the last hop. Only two fields are
   * used in this message, Peer.port and Peer.ip. These fields are optionally populated by those
   * services utilizing the IAM condition feature.
   * @return value or {@code null} for none
   */
  public Peer getDestinationAttributes() {
    return destinationAttributes;
  }

  /**
   * The destination of a network activity, such as accepting a TCP connection. In a multi hop
   * network activity, the destination represents the receiver of the last hop. Only two fields are
   * used in this message, Peer.port and Peer.ip. These fields are optionally populated by those
   * services utilizing the IAM condition feature.
   * @param destinationAttributes destinationAttributes or {@code null} for none
   */
  public RequestMetadata setDestinationAttributes(Peer destinationAttributes) {
    this.destinationAttributes = destinationAttributes;
    return this;
  }

  /**
   * Request attributes used in IAM condition evaluation. This field contains request attributes
   * like request time and access levels associated with the request.
   *
   * To get the whole view of the attributes used in IAM condition evaluation, the user must also
   * look into `AuditLog.authentication_info.resource_attributes`.
   * @return value or {@code null} for none
   */
  public Request getRequestAttributes() {
    return requestAttributes;
  }

  /**
   * Request attributes used in IAM condition evaluation. This field contains request attributes
   * like request time and access levels associated with the request.
   *
   * To get the whole view of the attributes used in IAM condition evaluation, the user must also
   * look into `AuditLog.authentication_info.resource_attributes`.
   * @param requestAttributes requestAttributes or {@code null} for none
   */
  public RequestMetadata setRequestAttributes(Request requestAttributes) {
    this.requestAttributes = requestAttributes;
    return this;
  }

  @Override
  public RequestMetadata set(String fieldName, Object value) {
    return (RequestMetadata) super.set(fieldName, value);
  }

  @Override
  public RequestMetadata clone() {
    return (RequestMetadata) super.clone();
  }

}
