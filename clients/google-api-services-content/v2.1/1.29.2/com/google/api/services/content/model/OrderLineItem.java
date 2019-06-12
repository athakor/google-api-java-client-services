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
 * Model definition for OrderLineItem.
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
public final class OrderLineItem extends com.google.api.client.json.GenericJson {

  /**
   * Annotations that are attached to the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderMerchantProvidedAnnotation> annotations;

  /**
   * Cancellations of the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderCancellation> cancellations;

  static {
    // hack to force ProGuard to consider OrderCancellation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderCancellation.class);
  }

  /**
   * The ID of the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Total price for the line item. For example, if two items for $10 are purchased, the total price
   * will be $20.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price price;

  /**
   * Product data as seen by customer from the time of the order placement. Note that certain
   * attributes values (e.g. title or gtin) might be reformatted and no longer match values
   * submitted via product feed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderLineItemProduct product;

  /**
   * Number of items canceled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantityCanceled;

  /**
   * Number of items delivered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantityDelivered;

  /**
   * Number of items ordered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantityOrdered;

  /**
   * Number of items pending.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantityPending;

  /**
   * Number of items returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantityReturned;

  /**
   * Number of items shipped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantityShipped;

  /**
   * Details of the return policy for the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderLineItemReturnInfo returnInfo;

  /**
   * Returns of the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderReturn> returns;

  /**
   * Details of the requested shipping for the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderLineItemShippingDetails shippingDetails;

  /**
   * Total tax amount for the line item. For example, if two items are purchased, and each have a
   * cost tax of $2, the total tax amount will be $4.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price tax;

  /**
   * Annotations that are attached to the line item.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderMerchantProvidedAnnotation> getAnnotations() {
    return annotations;
  }

  /**
   * Annotations that are attached to the line item.
   * @param annotations annotations or {@code null} for none
   */
  public OrderLineItem setAnnotations(java.util.List<OrderMerchantProvidedAnnotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Cancellations of the line item.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderCancellation> getCancellations() {
    return cancellations;
  }

  /**
   * Cancellations of the line item.
   * @param cancellations cancellations or {@code null} for none
   */
  public OrderLineItem setCancellations(java.util.List<OrderCancellation> cancellations) {
    this.cancellations = cancellations;
    return this;
  }

  /**
   * The ID of the line item.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the line item.
   * @param id id or {@code null} for none
   */
  public OrderLineItem setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Total price for the line item. For example, if two items for $10 are purchased, the total price
   * will be $20.
   * @return value or {@code null} for none
   */
  public Price getPrice() {
    return price;
  }

  /**
   * Total price for the line item. For example, if two items for $10 are purchased, the total price
   * will be $20.
   * @param price price or {@code null} for none
   */
  public OrderLineItem setPrice(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Product data as seen by customer from the time of the order placement. Note that certain
   * attributes values (e.g. title or gtin) might be reformatted and no longer match values
   * submitted via product feed.
   * @return value or {@code null} for none
   */
  public OrderLineItemProduct getProduct() {
    return product;
  }

  /**
   * Product data as seen by customer from the time of the order placement. Note that certain
   * attributes values (e.g. title or gtin) might be reformatted and no longer match values
   * submitted via product feed.
   * @param product product or {@code null} for none
   */
  public OrderLineItem setProduct(OrderLineItemProduct product) {
    this.product = product;
    return this;
  }

  /**
   * Number of items canceled.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantityCanceled() {
    return quantityCanceled;
  }

  /**
   * Number of items canceled.
   * @param quantityCanceled quantityCanceled or {@code null} for none
   */
  public OrderLineItem setQuantityCanceled(java.lang.Long quantityCanceled) {
    this.quantityCanceled = quantityCanceled;
    return this;
  }

  /**
   * Number of items delivered.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantityDelivered() {
    return quantityDelivered;
  }

  /**
   * Number of items delivered.
   * @param quantityDelivered quantityDelivered or {@code null} for none
   */
  public OrderLineItem setQuantityDelivered(java.lang.Long quantityDelivered) {
    this.quantityDelivered = quantityDelivered;
    return this;
  }

  /**
   * Number of items ordered.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantityOrdered() {
    return quantityOrdered;
  }

  /**
   * Number of items ordered.
   * @param quantityOrdered quantityOrdered or {@code null} for none
   */
  public OrderLineItem setQuantityOrdered(java.lang.Long quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

  /**
   * Number of items pending.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantityPending() {
    return quantityPending;
  }

  /**
   * Number of items pending.
   * @param quantityPending quantityPending or {@code null} for none
   */
  public OrderLineItem setQuantityPending(java.lang.Long quantityPending) {
    this.quantityPending = quantityPending;
    return this;
  }

  /**
   * Number of items returned.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantityReturned() {
    return quantityReturned;
  }

  /**
   * Number of items returned.
   * @param quantityReturned quantityReturned or {@code null} for none
   */
  public OrderLineItem setQuantityReturned(java.lang.Long quantityReturned) {
    this.quantityReturned = quantityReturned;
    return this;
  }

  /**
   * Number of items shipped.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantityShipped() {
    return quantityShipped;
  }

  /**
   * Number of items shipped.
   * @param quantityShipped quantityShipped or {@code null} for none
   */
  public OrderLineItem setQuantityShipped(java.lang.Long quantityShipped) {
    this.quantityShipped = quantityShipped;
    return this;
  }

  /**
   * Details of the return policy for the line item.
   * @return value or {@code null} for none
   */
  public OrderLineItemReturnInfo getReturnInfo() {
    return returnInfo;
  }

  /**
   * Details of the return policy for the line item.
   * @param returnInfo returnInfo or {@code null} for none
   */
  public OrderLineItem setReturnInfo(OrderLineItemReturnInfo returnInfo) {
    this.returnInfo = returnInfo;
    return this;
  }

  /**
   * Returns of the line item.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderReturn> getReturns() {
    return returns;
  }

  /**
   * Returns of the line item.
   * @param returns returns or {@code null} for none
   */
  public OrderLineItem setReturns(java.util.List<OrderReturn> returns) {
    this.returns = returns;
    return this;
  }

  /**
   * Details of the requested shipping for the line item.
   * @return value or {@code null} for none
   */
  public OrderLineItemShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  /**
   * Details of the requested shipping for the line item.
   * @param shippingDetails shippingDetails or {@code null} for none
   */
  public OrderLineItem setShippingDetails(OrderLineItemShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

  /**
   * Total tax amount for the line item. For example, if two items are purchased, and each have a
   * cost tax of $2, the total tax amount will be $4.
   * @return value or {@code null} for none
   */
  public Price getTax() {
    return tax;
  }

  /**
   * Total tax amount for the line item. For example, if two items are purchased, and each have a
   * cost tax of $2, the total tax amount will be $4.
   * @param tax tax or {@code null} for none
   */
  public OrderLineItem setTax(Price tax) {
    this.tax = tax;
    return this;
  }

  @Override
  public OrderLineItem set(String fieldName, Object value) {
    return (OrderLineItem) super.set(fieldName, value);
  }

  @Override
  public OrderLineItem clone() {
    return (OrderLineItem) super.clone();
  }

}
