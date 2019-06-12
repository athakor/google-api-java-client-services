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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * An object representing a latitude/longitude pair. This is expressed as a pair of doubles
 * representing degrees latitude and degrees longitude. Unless specified otherwise, this must
 * conform to the WGS84 standard. Values must be within normalized ranges.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LatLng extends com.google.api.client.json.GenericJson {

  /**
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latitude;

  /**
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double longitude;

  /**
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * @param latitude latitude or {@code null} for none
   */
  public LatLng setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * @return value or {@code null} for none
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * @param longitude longitude or {@code null} for none
   */
  public LatLng setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
    return this;
  }

  @Override
  public LatLng set(String fieldName, Object value) {
    return (LatLng) super.set(fieldName, value);
  }

  @Override
  public LatLng clone() {
    return (LatLng) super.clone();
  }

}
