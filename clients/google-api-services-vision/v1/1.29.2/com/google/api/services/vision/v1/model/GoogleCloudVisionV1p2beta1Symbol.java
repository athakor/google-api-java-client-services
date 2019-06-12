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

package com.google.api.services.vision.v1.model;

/**
 * A single symbol representation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p2beta1Symbol extends com.google.api.client.json.GenericJson {

  /**
   * The bounding box for the symbol. The vertices are in the order of top-left, top-right, bottom-
   * right, bottom-left. When a rotation of the bounding box is detected the rotation is represented
   * as around the top-left corner as defined when the text is read in the 'natural' orientation.
   * For example:   * when the text is horizontal it might look like:      0----1      |    |      3
   * ----2   * when it's rotated 180 degrees around the top-left corner it becomes:      2----3
   * |    |      1----0   and the vertice order will still be (0, 1, 2, 3).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p2beta1BoundingPoly boundingBox;

  /**
   * Confidence of the OCR results for the symbol. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Additional information detected for the symbol.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p2beta1TextAnnotationTextProperty property;

  /**
   * The actual UTF-8 representation of the symbol.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The bounding box for the symbol. The vertices are in the order of top-left, top-right, bottom-
   * right, bottom-left. When a rotation of the bounding box is detected the rotation is represented
   * as around the top-left corner as defined when the text is read in the 'natural' orientation.
   * For example:   * when the text is horizontal it might look like:      0----1      |    |      3
   * ----2   * when it's rotated 180 degrees around the top-left corner it becomes:      2----3
   * |    |      1----0   and the vertice order will still be (0, 1, 2, 3).
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1BoundingPoly getBoundingBox() {
    return boundingBox;
  }

  /**
   * The bounding box for the symbol. The vertices are in the order of top-left, top-right, bottom-
   * right, bottom-left. When a rotation of the bounding box is detected the rotation is represented
   * as around the top-left corner as defined when the text is read in the 'natural' orientation.
   * For example:   * when the text is horizontal it might look like:      0----1      |    |      3
   * ----2   * when it's rotated 180 degrees around the top-left corner it becomes:      2----3
   * |    |      1----0   and the vertice order will still be (0, 1, 2, 3).
   * @param boundingBox boundingBox or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Symbol setBoundingBox(GoogleCloudVisionV1p2beta1BoundingPoly boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Confidence of the OCR results for the symbol. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence of the OCR results for the symbol. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Symbol setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Additional information detected for the symbol.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1TextAnnotationTextProperty getProperty() {
    return property;
  }

  /**
   * Additional information detected for the symbol.
   * @param property property or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Symbol setProperty(GoogleCloudVisionV1p2beta1TextAnnotationTextProperty property) {
    this.property = property;
    return this;
  }

  /**
   * The actual UTF-8 representation of the symbol.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The actual UTF-8 representation of the symbol.
   * @param text text or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Symbol setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p2beta1Symbol set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p2beta1Symbol) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p2beta1Symbol clone() {
    return (GoogleCloudVisionV1p2beta1Symbol) super.clone();
  }

}
