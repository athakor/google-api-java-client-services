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

package com.google.api.services.run.v1alpha1.model;

/**
 * volumeDevice describes a mapping of a raw block device within a container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VolumeDevice extends com.google.api.client.json.GenericJson {

  /**
   * devicePath is the path inside of the container that the device will be mapped to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String devicePath;

  /**
   * name must match the name of a persistentVolumeClaim in the pod
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * devicePath is the path inside of the container that the device will be mapped to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDevicePath() {
    return devicePath;
  }

  /**
   * devicePath is the path inside of the container that the device will be mapped to.
   * @param devicePath devicePath or {@code null} for none
   */
  public VolumeDevice setDevicePath(java.lang.String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

  /**
   * name must match the name of a persistentVolumeClaim in the pod
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * name must match the name of a persistentVolumeClaim in the pod
   * @param name name or {@code null} for none
   */
  public VolumeDevice setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public VolumeDevice set(String fieldName, Object value) {
    return (VolumeDevice) super.set(fieldName, value);
  }

  @Override
  public VolumeDevice clone() {
    return (VolumeDevice) super.clone();
  }

}
