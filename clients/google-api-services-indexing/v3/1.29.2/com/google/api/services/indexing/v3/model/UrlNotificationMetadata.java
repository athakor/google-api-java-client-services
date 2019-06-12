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

package com.google.api.services.indexing.v3.model;

/**
 * Summary of the most recent Indexing API notifications successfully received, for a given URL.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Indexing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlNotificationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Latest notification received with type `URL_REMOVED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UrlNotification latestRemove;

  /**
   * Latest notification received with type `URL_UPDATED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UrlNotification latestUpdate;

  /**
   * URL to which this metadata refers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Latest notification received with type `URL_REMOVED`.
   * @return value or {@code null} for none
   */
  public UrlNotification getLatestRemove() {
    return latestRemove;
  }

  /**
   * Latest notification received with type `URL_REMOVED`.
   * @param latestRemove latestRemove or {@code null} for none
   */
  public UrlNotificationMetadata setLatestRemove(UrlNotification latestRemove) {
    this.latestRemove = latestRemove;
    return this;
  }

  /**
   * Latest notification received with type `URL_UPDATED`.
   * @return value or {@code null} for none
   */
  public UrlNotification getLatestUpdate() {
    return latestUpdate;
  }

  /**
   * Latest notification received with type `URL_UPDATED`.
   * @param latestUpdate latestUpdate or {@code null} for none
   */
  public UrlNotificationMetadata setLatestUpdate(UrlNotification latestUpdate) {
    this.latestUpdate = latestUpdate;
    return this;
  }

  /**
   * URL to which this metadata refers.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL to which this metadata refers.
   * @param url url or {@code null} for none
   */
  public UrlNotificationMetadata setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public UrlNotificationMetadata set(String fieldName, Object value) {
    return (UrlNotificationMetadata) super.set(fieldName, value);
  }

  @Override
  public UrlNotificationMetadata clone() {
    return (UrlNotificationMetadata) super.clone();
  }

}
