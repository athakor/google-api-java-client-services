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

package com.google.api.services.testing.model;

/**
 * Data about the relative number of devices running a given configuration of the Android platform.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Distribution extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The estimated fraction (0-1) of the total market with this configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double marketShare;

  /**
   * Output only. The time this distribution was measured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String measurementTime;

  /**
   * Output only. The estimated fraction (0-1) of the total market with this configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMarketShare() {
    return marketShare;
  }

  /**
   * Output only. The estimated fraction (0-1) of the total market with this configuration.
   * @param marketShare marketShare or {@code null} for none
   */
  public Distribution setMarketShare(java.lang.Double marketShare) {
    this.marketShare = marketShare;
    return this;
  }

  /**
   * Output only. The time this distribution was measured.
   * @return value or {@code null} for none
   */
  public String getMeasurementTime() {
    return measurementTime;
  }

  /**
   * Output only. The time this distribution was measured.
   * @param measurementTime measurementTime or {@code null} for none
   */
  public Distribution setMeasurementTime(String measurementTime) {
    this.measurementTime = measurementTime;
    return this;
  }

  @Override
  public Distribution set(String fieldName, Object value) {
    return (Distribution) super.set(fieldName, value);
  }

  @Override
  public Distribution clone() {
    return (Distribution) super.clone();
  }

}
