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

package com.google.api.services.cloudasset.v1beta1.model;

/**
 * Temporal asset. In addition to the asset, the temporal asset includes the status of the asset and
 * valid from and to time of it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TemporalAsset extends com.google.api.client.json.GenericJson {

  /**
   * Asset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Asset asset;

  /**
   * If the asset is deleted or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleted;

  /**
   * The time window when the asset data and state was observed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeWindow window;

  /**
   * Asset.
   * @return value or {@code null} for none
   */
  public Asset getAsset() {
    return asset;
  }

  /**
   * Asset.
   * @param asset asset or {@code null} for none
   */
  public TemporalAsset setAsset(Asset asset) {
    this.asset = asset;
    return this;
  }

  /**
   * If the asset is deleted or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleted() {
    return deleted;
  }

  /**
   * If the asset is deleted or not.
   * @param deleted deleted or {@code null} for none
   */
  public TemporalAsset setDeleted(java.lang.Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * The time window when the asset data and state was observed.
   * @return value or {@code null} for none
   */
  public TimeWindow getWindow() {
    return window;
  }

  /**
   * The time window when the asset data and state was observed.
   * @param window window or {@code null} for none
   */
  public TemporalAsset setWindow(TimeWindow window) {
    this.window = window;
    return this;
  }

  @Override
  public TemporalAsset set(String fieldName, Object value) {
    return (TemporalAsset) super.set(fieldName, value);
  }

  @Override
  public TemporalAsset clone() {
    return (TemporalAsset) super.clone();
  }

}
