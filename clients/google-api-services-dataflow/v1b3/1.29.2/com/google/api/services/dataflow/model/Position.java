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

package com.google.api.services.dataflow.model;

/**
 * Position defines a position within a collection of data.  The value can be either the end
 * position, a key (used with ordered collections), a byte offset, or a record index.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Position extends com.google.api.client.json.GenericJson {

  /**
   * Position is a byte offset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long byteOffset;

  /**
   * CloudPosition is a concat position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConcatPosition concatPosition;

  /**
   * Position is past all other positions. Also useful for the end position of an unbounded range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean end;

  /**
   * Position is a string key, ordered lexicographically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Position is a record index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long recordIndex;

  /**
   * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED sharding).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shufflePosition;

  /**
   * Position is a byte offset.
   * @return value or {@code null} for none
   */
  public java.lang.Long getByteOffset() {
    return byteOffset;
  }

  /**
   * Position is a byte offset.
   * @param byteOffset byteOffset or {@code null} for none
   */
  public Position setByteOffset(java.lang.Long byteOffset) {
    this.byteOffset = byteOffset;
    return this;
  }

  /**
   * CloudPosition is a concat position.
   * @return value or {@code null} for none
   */
  public ConcatPosition getConcatPosition() {
    return concatPosition;
  }

  /**
   * CloudPosition is a concat position.
   * @param concatPosition concatPosition or {@code null} for none
   */
  public Position setConcatPosition(ConcatPosition concatPosition) {
    this.concatPosition = concatPosition;
    return this;
  }

  /**
   * Position is past all other positions. Also useful for the end position of an unbounded range.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnd() {
    return end;
  }

  /**
   * Position is past all other positions. Also useful for the end position of an unbounded range.
   * @param end end or {@code null} for none
   */
  public Position setEnd(java.lang.Boolean end) {
    this.end = end;
    return this;
  }

  /**
   * Position is a string key, ordered lexicographically.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Position is a string key, ordered lexicographically.
   * @param key key or {@code null} for none
   */
  public Position setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Position is a record index.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRecordIndex() {
    return recordIndex;
  }

  /**
   * Position is a record index.
   * @param recordIndex recordIndex or {@code null} for none
   */
  public Position setRecordIndex(java.lang.Long recordIndex) {
    this.recordIndex = recordIndex;
    return this;
  }

  /**
   * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED sharding).
   * @return value or {@code null} for none
   */
  public java.lang.String getShufflePosition() {
    return shufflePosition;
  }

  /**
   * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED sharding).
   * @param shufflePosition shufflePosition or {@code null} for none
   */
  public Position setShufflePosition(java.lang.String shufflePosition) {
    this.shufflePosition = shufflePosition;
    return this;
  }

  @Override
  public Position set(String fieldName, Object value) {
    return (Position) super.set(fieldName, value);
  }

  @Override
  public Position clone() {
    return (Position) super.clone();
  }

}
