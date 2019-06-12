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

package com.google.api.services.content.model;

/**
 * Model definition for OrderLineItemShippingDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderLineItemShippingDetails extends com.google.api.client.json.GenericJson {

  /**
   * The delivery by date, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deliverByDate;

  /**
   * Details of the shipping method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderLineItemShippingDetailsMethod method;

  /**
   * The ship by date, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shipByDate;

  /**
   * The delivery by date, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeliverByDate() {
    return deliverByDate;
  }

  /**
   * The delivery by date, in ISO 8601 format.
   * @param deliverByDate deliverByDate or {@code null} for none
   */
  public OrderLineItemShippingDetails setDeliverByDate(java.lang.String deliverByDate) {
    this.deliverByDate = deliverByDate;
    return this;
  }

  /**
   * Details of the shipping method.
   * @return value or {@code null} for none
   */
  public OrderLineItemShippingDetailsMethod getMethod() {
    return method;
  }

  /**
   * Details of the shipping method.
   * @param method method or {@code null} for none
   */
  public OrderLineItemShippingDetails setMethod(OrderLineItemShippingDetailsMethod method) {
    this.method = method;
    return this;
  }

  /**
   * The ship by date, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getShipByDate() {
    return shipByDate;
  }

  /**
   * The ship by date, in ISO 8601 format.
   * @param shipByDate shipByDate or {@code null} for none
   */
  public OrderLineItemShippingDetails setShipByDate(java.lang.String shipByDate) {
    this.shipByDate = shipByDate;
    return this;
  }

  @Override
  public OrderLineItemShippingDetails set(String fieldName, Object value) {
    return (OrderLineItemShippingDetails) super.set(fieldName, value);
  }

  @Override
  public OrderLineItemShippingDetails clone() {
    return (OrderLineItemShippingDetails) super.clone();
  }

}
