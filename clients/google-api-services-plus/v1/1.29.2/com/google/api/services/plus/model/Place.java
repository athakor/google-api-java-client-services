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

package com.google.api.services.plus.model;

/**
 * Model definition for Place.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google+ API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Place extends com.google.api.client.json.GenericJson {

  /**
   * The physical address of the place.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Address address;

  /**
   * The display name of the place.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The id of the place.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies this resource as a place. Value: "plus#place".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The position of the place.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Position position;

  /**
   * The physical address of the place.
   * @return value or {@code null} for none
   */
  public Address getAddress() {
    return address;
  }

  /**
   * The physical address of the place.
   * @param address address or {@code null} for none
   */
  public Place setAddress(Address address) {
    this.address = address;
    return this;
  }

  /**
   * The display name of the place.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the place.
   * @param displayName displayName or {@code null} for none
   */
  public Place setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The id of the place.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The id of the place.
   * @param id id or {@code null} for none
   */
  public Place setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies this resource as a place. Value: "plus#place".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this resource as a place. Value: "plus#place".
   * @param kind kind or {@code null} for none
   */
  public Place setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The position of the place.
   * @return value or {@code null} for none
   */
  public Position getPosition() {
    return position;
  }

  /**
   * The position of the place.
   * @param position position or {@code null} for none
   */
  public Place setPosition(Position position) {
    this.position = position;
    return this;
  }

  @Override
  public Place set(String fieldName, Object value) {
    return (Place) super.set(fieldName, value);
  }

  @Override
  public Place clone() {
    return (Place) super.clone();
  }

  /**
   * The physical address of the place.
   */
  public static final class Address extends com.google.api.client.json.GenericJson {

    /**
     * The formatted address for display.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String formatted;

    /**
     * The formatted address for display.
     * @return value or {@code null} for none
     */
    public java.lang.String getFormatted() {
      return formatted;
    }

    /**
     * The formatted address for display.
     * @param formatted formatted or {@code null} for none
     */
    public Address setFormatted(java.lang.String formatted) {
      this.formatted = formatted;
      return this;
    }

    @Override
    public Address set(String fieldName, Object value) {
      return (Address) super.set(fieldName, value);
    }

    @Override
    public Address clone() {
      return (Address) super.clone();
    }

  }

  /**
   * The position of the place.
   */
  public static final class Position extends com.google.api.client.json.GenericJson {

    /**
     * The latitude of this position.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double latitude;

    /**
     * The longitude of this position.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double longitude;

    /**
     * The latitude of this position.
     * @return value or {@code null} for none
     */
    public java.lang.Double getLatitude() {
      return latitude;
    }

    /**
     * The latitude of this position.
     * @param latitude latitude or {@code null} for none
     */
    public Position setLatitude(java.lang.Double latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * The longitude of this position.
     * @return value or {@code null} for none
     */
    public java.lang.Double getLongitude() {
      return longitude;
    }

    /**
     * The longitude of this position.
     * @param longitude longitude or {@code null} for none
     */
    public Position setLongitude(java.lang.Double longitude) {
      this.longitude = longitude;
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
}
