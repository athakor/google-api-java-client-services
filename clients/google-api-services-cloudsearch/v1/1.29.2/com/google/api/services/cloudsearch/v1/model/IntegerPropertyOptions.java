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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Options for integer properties.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IntegerPropertyOptions extends com.google.api.client.json.GenericJson {

  /**
   * The maximum value of the property. The minimum and maximum values for the property are used to
   * rank results according to the ordered ranking. Indexing requests with values greater than the
   * maximum are accepted and ranked with the same weight as items indexed with the maximum value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maximumValue;

  /**
   * The minimum value of the property. The minimum and maximum values for the property are used to
   * rank results according to the ordered ranking. Indexing requests with values less than the
   * minimum are accepted and ranked with the same weight as items indexed with the minimum value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minimumValue;

  /**
   * If set, describes how the integer should be used as a search operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IntegerOperatorOptions operatorOptions;

  /**
   * Used to specify the ordered ranking for the integer. Can only be used if isRepeatable is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderedRanking;

  /**
   * The maximum value of the property. The minimum and maximum values for the property are used to
   * rank results according to the ordered ranking. Indexing requests with values greater than the
   * maximum are accepted and ranked with the same weight as items indexed with the maximum value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaximumValue() {
    return maximumValue;
  }

  /**
   * The maximum value of the property. The minimum and maximum values for the property are used to
   * rank results according to the ordered ranking. Indexing requests with values greater than the
   * maximum are accepted and ranked with the same weight as items indexed with the maximum value.
   * @param maximumValue maximumValue or {@code null} for none
   */
  public IntegerPropertyOptions setMaximumValue(java.lang.Long maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

  /**
   * The minimum value of the property. The minimum and maximum values for the property are used to
   * rank results according to the ordered ranking. Indexing requests with values less than the
   * minimum are accepted and ranked with the same weight as items indexed with the minimum value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinimumValue() {
    return minimumValue;
  }

  /**
   * The minimum value of the property. The minimum and maximum values for the property are used to
   * rank results according to the ordered ranking. Indexing requests with values less than the
   * minimum are accepted and ranked with the same weight as items indexed with the minimum value.
   * @param minimumValue minimumValue or {@code null} for none
   */
  public IntegerPropertyOptions setMinimumValue(java.lang.Long minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

  /**
   * If set, describes how the integer should be used as a search operator.
   * @return value or {@code null} for none
   */
  public IntegerOperatorOptions getOperatorOptions() {
    return operatorOptions;
  }

  /**
   * If set, describes how the integer should be used as a search operator.
   * @param operatorOptions operatorOptions or {@code null} for none
   */
  public IntegerPropertyOptions setOperatorOptions(IntegerOperatorOptions operatorOptions) {
    this.operatorOptions = operatorOptions;
    return this;
  }

  /**
   * Used to specify the ordered ranking for the integer. Can only be used if isRepeatable is false.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderedRanking() {
    return orderedRanking;
  }

  /**
   * Used to specify the ordered ranking for the integer. Can only be used if isRepeatable is false.
   * @param orderedRanking orderedRanking or {@code null} for none
   */
  public IntegerPropertyOptions setOrderedRanking(java.lang.String orderedRanking) {
    this.orderedRanking = orderedRanking;
    return this;
  }

  @Override
  public IntegerPropertyOptions set(String fieldName, Object value) {
    return (IntegerPropertyOptions) super.set(fieldName, value);
  }

  @Override
  public IntegerPropertyOptions clone() {
    return (IntegerPropertyOptions) super.clone();
  }

}
