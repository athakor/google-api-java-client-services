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

package com.google.api.services.sql.model;

/**
 * Binary log coordinates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BinLogCoordinates extends com.google.api.client.json.GenericJson {

  /**
   * Name of the binary log file for a Cloud SQL instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String binLogFileName;

  /**
   * Position (offset) within the binary log file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long binLogPosition;

  /**
   * This is always sql#binLogCoordinates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the binary log file for a Cloud SQL instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getBinLogFileName() {
    return binLogFileName;
  }

  /**
   * Name of the binary log file for a Cloud SQL instance.
   * @param binLogFileName binLogFileName or {@code null} for none
   */
  public BinLogCoordinates setBinLogFileName(java.lang.String binLogFileName) {
    this.binLogFileName = binLogFileName;
    return this;
  }

  /**
   * Position (offset) within the binary log file.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBinLogPosition() {
    return binLogPosition;
  }

  /**
   * Position (offset) within the binary log file.
   * @param binLogPosition binLogPosition or {@code null} for none
   */
  public BinLogCoordinates setBinLogPosition(java.lang.Long binLogPosition) {
    this.binLogPosition = binLogPosition;
    return this;
  }

  /**
   * This is always sql#binLogCoordinates.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#binLogCoordinates.
   * @param kind kind or {@code null} for none
   */
  public BinLogCoordinates setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public BinLogCoordinates set(String fieldName, Object value) {
    return (BinLogCoordinates) super.set(fieldName, value);
  }

  @Override
  public BinLogCoordinates clone() {
    return (BinLogCoordinates) super.clone();
  }

}
