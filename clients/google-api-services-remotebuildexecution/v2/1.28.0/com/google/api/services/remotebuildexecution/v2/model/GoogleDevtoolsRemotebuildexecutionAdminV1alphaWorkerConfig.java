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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * Defines the configuration to be used for a creating workers in the worker pool.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig extends com.google.api.client.json.GenericJson {

  /**
   * The accelerator card attached to each VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig accelerator;

  /**
   * Required. Size of the disk attached to the worker, in GB. See
   * https://cloud.google.com/compute/docs/disks/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * Required. Disk Type to use for the worker. See [Storage
   * options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-
   * standard` and `pd-ssd` are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskType;

  /**
   * Labels associated with the workers. Label keys and values can be no longer than 63 characters,
   * can only contain lowercase letters, numeric characters, underscores and dashes. International
   * letters are permitted. Label keys must start with a letter. Label values are optional. There
   * can not be more than 64 labels per resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Machine type of the worker, such as `n1-standard-2`. See
   * https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note
   * that `f1-micro` and `g1-small` are not yet supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The maximum number of actions a worker can execute concurrently.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxConcurrentActions;

  /**
   * Minimum CPU platform to use when creating the worker. See [CPU
   * Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minCpuPlatform;

  /**
   * Determines the type of network access granted to workers. Possible values:
   *
   * - "public": Workers can connect to the public internet. - "private": Workers can only connect
   * to Google APIs and services. - "restricted-private": Workers can only connect to Google APIs
   * that are   reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkAccess;

  /**
   * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and
   * therefore won't be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/)
   * for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reserved;

  /**
   * The accelerator card attached to each VM.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig getAccelerator() {
    return accelerator;
  }

  /**
   * The accelerator card attached to each VM.
   * @param accelerator accelerator or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setAccelerator(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig accelerator) {
    this.accelerator = accelerator;
    return this;
  }

  /**
   * Required. Size of the disk attached to the worker, in GB. See
   * https://cloud.google.com/compute/docs/disks/
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Required. Size of the disk attached to the worker, in GB. See
   * https://cloud.google.com/compute/docs/disks/
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Required. Disk Type to use for the worker. See [Storage
   * options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-
   * standard` and `pd-ssd` are supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskType() {
    return diskType;
  }

  /**
   * Required. Disk Type to use for the worker. See [Storage
   * options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-
   * standard` and `pd-ssd` are supported.
   * @param diskType diskType or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setDiskType(java.lang.String diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * Labels associated with the workers. Label keys and values can be no longer than 63 characters,
   * can only contain lowercase letters, numeric characters, underscores and dashes. International
   * letters are permitted. Label keys must start with a letter. Label values are optional. There
   * can not be more than 64 labels per resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels associated with the workers. Label keys and values can be no longer than 63 characters,
   * can only contain lowercase letters, numeric characters, underscores and dashes. International
   * letters are permitted. Label keys must start with a letter. Label values are optional. There
   * can not be more than 64 labels per resource.
   * @param labels labels or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Machine type of the worker, such as `n1-standard-2`. See
   * https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note
   * that `f1-micro` and `g1-small` are not yet supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Required. Machine type of the worker, such as `n1-standard-2`. See
   * https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note
   * that `f1-micro` and `g1-small` are not yet supported.
   * @param machineType machineType or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * The maximum number of actions a worker can execute concurrently.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxConcurrentActions() {
    return maxConcurrentActions;
  }

  /**
   * The maximum number of actions a worker can execute concurrently.
   * @param maxConcurrentActions maxConcurrentActions or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setMaxConcurrentActions(java.lang.Long maxConcurrentActions) {
    this.maxConcurrentActions = maxConcurrentActions;
    return this;
  }

  /**
   * Minimum CPU platform to use when creating the worker. See [CPU
   * Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
   * @return value or {@code null} for none
   */
  public java.lang.String getMinCpuPlatform() {
    return minCpuPlatform;
  }

  /**
   * Minimum CPU platform to use when creating the worker. See [CPU
   * Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
   * @param minCpuPlatform minCpuPlatform or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setMinCpuPlatform(java.lang.String minCpuPlatform) {
    this.minCpuPlatform = minCpuPlatform;
    return this;
  }

  /**
   * Determines the type of network access granted to workers. Possible values:
   *
   * - "public": Workers can connect to the public internet. - "private": Workers can only connect
   * to Google APIs and services. - "restricted-private": Workers can only connect to Google APIs
   * that are   reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkAccess() {
    return networkAccess;
  }

  /**
   * Determines the type of network access granted to workers. Possible values:
   *
   * - "public": Workers can connect to the public internet. - "private": Workers can only connect
   * to Google APIs and services. - "restricted-private": Workers can only connect to Google APIs
   * that are   reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
   * @param networkAccess networkAccess or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setNetworkAccess(java.lang.String networkAccess) {
    this.networkAccess = networkAccess;
    return this;
  }

  /**
   * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and
   * therefore won't be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/)
   * for more details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReserved() {
    return reserved;
  }

  /**
   * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and
   * therefore won't be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/)
   * for more details.
   * @param reserved reserved or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig setReserved(java.lang.Boolean reserved) {
    this.reserved = reserved;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig) super.clone();
  }

}
