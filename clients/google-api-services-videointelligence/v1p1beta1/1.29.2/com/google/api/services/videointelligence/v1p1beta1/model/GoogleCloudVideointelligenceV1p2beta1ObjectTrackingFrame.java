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

package com.google.api.services.videointelligence.v1p1beta1.model;

/**
 * Video frame level annotations for object detection and tracking. This field stores per frame
 * location, time offset, and confidence.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame extends com.google.api.client.json.GenericJson {

  /**
   * The normalized bounding box location of this object track for the frame.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox normalizedBoundingBox;

  /**
   * The timestamp of the frame in microseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeOffset;

  /**
   * The normalized bounding box location of this object track for the frame.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox getNormalizedBoundingBox() {
    return normalizedBoundingBox;
  }

  /**
   * The normalized bounding box location of this object track for the frame.
   * @param normalizedBoundingBox normalizedBoundingBox or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame setNormalizedBoundingBox(GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox normalizedBoundingBox) {
    this.normalizedBoundingBox = normalizedBoundingBox;
    return this;
  }

  /**
   * The timestamp of the frame in microseconds.
   * @return value or {@code null} for none
   */
  public String getTimeOffset() {
    return timeOffset;
  }

  /**
   * The timestamp of the frame in microseconds.
   * @param timeOffset timeOffset or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame setTimeOffset(String timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame clone() {
    return (GoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame) super.clone();
  }

}
