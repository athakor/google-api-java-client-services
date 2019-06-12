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

package com.google.api.services.dfareporting.model;

/**
 * Creative Custom Event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeCustomEvent extends com.google.api.client.json.GenericJson {

  /**
   * Unique ID of this event used by Reporting and Data Transfer. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserCustomEventId;

  /**
   * User-entered name for the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiserCustomEventName;

  /**
   * Type of the event. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiserCustomEventType;

  /**
   * Artwork label column, used to link events in Campaign Manager back to events in Studio. This is
   * a required field and should not be modified after insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artworkLabel;

  /**
   * Artwork type used by the creative.This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artworkType;

  /**
   * Exit click-through URL for the event. This field is used only for exit events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreativeClickThroughUrl exitClickThroughUrl;

  /**
   * ID of this event. This is a required field and should not be modified after insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Properties for rich media popup windows. This field is used only for exit events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PopupWindowProperties popupWindowProperties;

  /**
   * Target type used by the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetType;

  /**
   * Video reporting ID, used to differentiate multiple videos in a single creative. This is a read-
   * only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoReportingId;

  /**
   * Unique ID of this event used by Reporting and Data Transfer. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserCustomEventId() {
    return advertiserCustomEventId;
  }

  /**
   * Unique ID of this event used by Reporting and Data Transfer. This is a read-only field.
   * @param advertiserCustomEventId advertiserCustomEventId or {@code null} for none
   */
  public CreativeCustomEvent setAdvertiserCustomEventId(java.lang.Long advertiserCustomEventId) {
    this.advertiserCustomEventId = advertiserCustomEventId;
    return this;
  }

  /**
   * User-entered name for the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiserCustomEventName() {
    return advertiserCustomEventName;
  }

  /**
   * User-entered name for the event.
   * @param advertiserCustomEventName advertiserCustomEventName or {@code null} for none
   */
  public CreativeCustomEvent setAdvertiserCustomEventName(java.lang.String advertiserCustomEventName) {
    this.advertiserCustomEventName = advertiserCustomEventName;
    return this;
  }

  /**
   * Type of the event. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiserCustomEventType() {
    return advertiserCustomEventType;
  }

  /**
   * Type of the event. This is a read-only field.
   * @param advertiserCustomEventType advertiserCustomEventType or {@code null} for none
   */
  public CreativeCustomEvent setAdvertiserCustomEventType(java.lang.String advertiserCustomEventType) {
    this.advertiserCustomEventType = advertiserCustomEventType;
    return this;
  }

  /**
   * Artwork label column, used to link events in Campaign Manager back to events in Studio. This is
   * a required field and should not be modified after insertion.
   * @return value or {@code null} for none
   */
  public java.lang.String getArtworkLabel() {
    return artworkLabel;
  }

  /**
   * Artwork label column, used to link events in Campaign Manager back to events in Studio. This is
   * a required field and should not be modified after insertion.
   * @param artworkLabel artworkLabel or {@code null} for none
   */
  public CreativeCustomEvent setArtworkLabel(java.lang.String artworkLabel) {
    this.artworkLabel = artworkLabel;
    return this;
  }

  /**
   * Artwork type used by the creative.This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getArtworkType() {
    return artworkType;
  }

  /**
   * Artwork type used by the creative.This is a read-only field.
   * @param artworkType artworkType or {@code null} for none
   */
  public CreativeCustomEvent setArtworkType(java.lang.String artworkType) {
    this.artworkType = artworkType;
    return this;
  }

  /**
   * Exit click-through URL for the event. This field is used only for exit events.
   * @return value or {@code null} for none
   */
  public CreativeClickThroughUrl getExitClickThroughUrl() {
    return exitClickThroughUrl;
  }

  /**
   * Exit click-through URL for the event. This field is used only for exit events.
   * @param exitClickThroughUrl exitClickThroughUrl or {@code null} for none
   */
  public CreativeCustomEvent setExitClickThroughUrl(CreativeClickThroughUrl exitClickThroughUrl) {
    this.exitClickThroughUrl = exitClickThroughUrl;
    return this;
  }

  /**
   * ID of this event. This is a required field and should not be modified after insertion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this event. This is a required field and should not be modified after insertion.
   * @param id id or {@code null} for none
   */
  public CreativeCustomEvent setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Properties for rich media popup windows. This field is used only for exit events.
   * @return value or {@code null} for none
   */
  public PopupWindowProperties getPopupWindowProperties() {
    return popupWindowProperties;
  }

  /**
   * Properties for rich media popup windows. This field is used only for exit events.
   * @param popupWindowProperties popupWindowProperties or {@code null} for none
   */
  public CreativeCustomEvent setPopupWindowProperties(PopupWindowProperties popupWindowProperties) {
    this.popupWindowProperties = popupWindowProperties;
    return this;
  }

  /**
   * Target type used by the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetType() {
    return targetType;
  }

  /**
   * Target type used by the event.
   * @param targetType targetType or {@code null} for none
   */
  public CreativeCustomEvent setTargetType(java.lang.String targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Video reporting ID, used to differentiate multiple videos in a single creative. This is a read-
   * only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoReportingId() {
    return videoReportingId;
  }

  /**
   * Video reporting ID, used to differentiate multiple videos in a single creative. This is a read-
   * only field.
   * @param videoReportingId videoReportingId or {@code null} for none
   */
  public CreativeCustomEvent setVideoReportingId(java.lang.String videoReportingId) {
    this.videoReportingId = videoReportingId;
    return this;
  }

  @Override
  public CreativeCustomEvent set(String fieldName, Object value) {
    return (CreativeCustomEvent) super.set(fieldName, value);
  }

  @Override
  public CreativeCustomEvent clone() {
    return (CreativeCustomEvent) super.clone();
  }

}
