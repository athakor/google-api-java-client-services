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

package com.google.api.services.gmail.model;

/**
 * Vacation auto-reply settings for an account. These settings correspond to the "Vacation
 * responder" feature in the web interface.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VacationSettings extends com.google.api.client.json.GenericJson {

  /**
   * Flag that controls whether Gmail automatically replies to messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutoReply;

  /**
   * An optional end time for sending auto-replies (epoch ms). When this is specified, Gmail will
   * automatically reply only to messages that it receives before the end time. If both startTime
   * and endTime are specified, startTime must precede endTime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endTime;

  /**
   * Response body in HTML format. Gmail will sanitize the HTML before storing it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseBodyHtml;

  /**
   * Response body in plain text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseBodyPlainText;

  /**
   * Optional text to prepend to the subject line in vacation responses. In order to enable auto-
   * replies, either the response subject or the response body must be nonempty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseSubject;

  /**
   * Flag that determines whether responses are sent to recipients who are not in the user's list of
   * contacts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean restrictToContacts;

  /**
   * Flag that determines whether responses are sent to recipients who are outside of the user's
   * domain. This feature is only available for G Suite users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean restrictToDomain;

  /**
   * An optional start time for sending auto-replies (epoch ms). When this is specified, Gmail will
   * automatically reply only to messages that it receives after the start time. If both startTime
   * and endTime are specified, startTime must precede endTime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTime;

  /**
   * Flag that controls whether Gmail automatically replies to messages.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutoReply() {
    return enableAutoReply;
  }

  /**
   * Flag that controls whether Gmail automatically replies to messages.
   * @param enableAutoReply enableAutoReply or {@code null} for none
   */
  public VacationSettings setEnableAutoReply(java.lang.Boolean enableAutoReply) {
    this.enableAutoReply = enableAutoReply;
    return this;
  }

  /**
   * An optional end time for sending auto-replies (epoch ms). When this is specified, Gmail will
   * automatically reply only to messages that it receives before the end time. If both startTime
   * and endTime are specified, startTime must precede endTime.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndTime() {
    return endTime;
  }

  /**
   * An optional end time for sending auto-replies (epoch ms). When this is specified, Gmail will
   * automatically reply only to messages that it receives before the end time. If both startTime
   * and endTime are specified, startTime must precede endTime.
   * @param endTime endTime or {@code null} for none
   */
  public VacationSettings setEndTime(java.lang.Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Response body in HTML format. Gmail will sanitize the HTML before storing it.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseBodyHtml() {
    return responseBodyHtml;
  }

  /**
   * Response body in HTML format. Gmail will sanitize the HTML before storing it.
   * @param responseBodyHtml responseBodyHtml or {@code null} for none
   */
  public VacationSettings setResponseBodyHtml(java.lang.String responseBodyHtml) {
    this.responseBodyHtml = responseBodyHtml;
    return this;
  }

  /**
   * Response body in plain text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseBodyPlainText() {
    return responseBodyPlainText;
  }

  /**
   * Response body in plain text format.
   * @param responseBodyPlainText responseBodyPlainText or {@code null} for none
   */
  public VacationSettings setResponseBodyPlainText(java.lang.String responseBodyPlainText) {
    this.responseBodyPlainText = responseBodyPlainText;
    return this;
  }

  /**
   * Optional text to prepend to the subject line in vacation responses. In order to enable auto-
   * replies, either the response subject or the response body must be nonempty.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseSubject() {
    return responseSubject;
  }

  /**
   * Optional text to prepend to the subject line in vacation responses. In order to enable auto-
   * replies, either the response subject or the response body must be nonempty.
   * @param responseSubject responseSubject or {@code null} for none
   */
  public VacationSettings setResponseSubject(java.lang.String responseSubject) {
    this.responseSubject = responseSubject;
    return this;
  }

  /**
   * Flag that determines whether responses are sent to recipients who are not in the user's list of
   * contacts.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRestrictToContacts() {
    return restrictToContacts;
  }

  /**
   * Flag that determines whether responses are sent to recipients who are not in the user's list of
   * contacts.
   * @param restrictToContacts restrictToContacts or {@code null} for none
   */
  public VacationSettings setRestrictToContacts(java.lang.Boolean restrictToContacts) {
    this.restrictToContacts = restrictToContacts;
    return this;
  }

  /**
   * Flag that determines whether responses are sent to recipients who are outside of the user's
   * domain. This feature is only available for G Suite users.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRestrictToDomain() {
    return restrictToDomain;
  }

  /**
   * Flag that determines whether responses are sent to recipients who are outside of the user's
   * domain. This feature is only available for G Suite users.
   * @param restrictToDomain restrictToDomain or {@code null} for none
   */
  public VacationSettings setRestrictToDomain(java.lang.Boolean restrictToDomain) {
    this.restrictToDomain = restrictToDomain;
    return this;
  }

  /**
   * An optional start time for sending auto-replies (epoch ms). When this is specified, Gmail will
   * automatically reply only to messages that it receives after the start time. If both startTime
   * and endTime are specified, startTime must precede endTime.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTime() {
    return startTime;
  }

  /**
   * An optional start time for sending auto-replies (epoch ms). When this is specified, Gmail will
   * automatically reply only to messages that it receives after the start time. If both startTime
   * and endTime are specified, startTime must precede endTime.
   * @param startTime startTime or {@code null} for none
   */
  public VacationSettings setStartTime(java.lang.Long startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public VacationSettings set(String fieldName, Object value) {
    return (VacationSettings) super.set(fieldName, value);
  }

  @Override
  public VacationSettings clone() {
    return (VacationSettings) super.clone();
  }

}
