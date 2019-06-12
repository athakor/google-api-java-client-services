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

package com.google.api.services.slides.v1.model;

/**
 * A TextElement kind that represents the beginning of a new paragraph.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ParagraphMarker extends com.google.api.client.json.GenericJson {

  /**
   * The bullet for this paragraph. If not present, the paragraph does not belong to a list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Bullet bullet;

  /**
   * The paragraph's style
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParagraphStyle style;

  /**
   * The bullet for this paragraph. If not present, the paragraph does not belong to a list.
   * @return value or {@code null} for none
   */
  public Bullet getBullet() {
    return bullet;
  }

  /**
   * The bullet for this paragraph. If not present, the paragraph does not belong to a list.
   * @param bullet bullet or {@code null} for none
   */
  public ParagraphMarker setBullet(Bullet bullet) {
    this.bullet = bullet;
    return this;
  }

  /**
   * The paragraph's style
   * @return value or {@code null} for none
   */
  public ParagraphStyle getStyle() {
    return style;
  }

  /**
   * The paragraph's style
   * @param style style or {@code null} for none
   */
  public ParagraphMarker setStyle(ParagraphStyle style) {
    this.style = style;
    return this;
  }

  @Override
  public ParagraphMarker set(String fieldName, Object value) {
    return (ParagraphMarker) super.set(fieldName, value);
  }

  @Override
  public ParagraphMarker clone() {
    return (ParagraphMarker) super.clone();
  }

}
