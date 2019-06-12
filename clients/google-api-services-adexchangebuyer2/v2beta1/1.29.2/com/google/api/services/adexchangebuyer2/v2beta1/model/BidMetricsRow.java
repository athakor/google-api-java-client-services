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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * The set of metrics that are measured in numbers of bids, representing how many bids with the
 * specified dimension values were considered eligible at each stage of the bidding funnel;
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BidMetricsRow extends com.google.api.client.json.GenericJson {

  /**
   * The number of bids that Ad Exchange received from the buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue bids;

  /**
   * The number of bids that were permitted to compete in the auction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue bidsInAuction;

  /**
   * The number of bids for which the buyer was billed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue billedImpressions;

  /**
   * The number of bids that won an impression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue impressionsWon;

  /**
   * The number of bids for which the corresponding impression was measurable for viewability (as
   * defined by Active View).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue measurableImpressions;

  /**
   * The values of all dimensions associated with metric values in this row.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RowDimensions rowDimensions;

  /**
   * The number of bids for which the corresponding impression was viewable (as defined by Active
   * View).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue viewableImpressions;

  /**
   * The number of bids that Ad Exchange received from the buyer.
   * @return value or {@code null} for none
   */
  public MetricValue getBids() {
    return bids;
  }

  /**
   * The number of bids that Ad Exchange received from the buyer.
   * @param bids bids or {@code null} for none
   */
  public BidMetricsRow setBids(MetricValue bids) {
    this.bids = bids;
    return this;
  }

  /**
   * The number of bids that were permitted to compete in the auction.
   * @return value or {@code null} for none
   */
  public MetricValue getBidsInAuction() {
    return bidsInAuction;
  }

  /**
   * The number of bids that were permitted to compete in the auction.
   * @param bidsInAuction bidsInAuction or {@code null} for none
   */
  public BidMetricsRow setBidsInAuction(MetricValue bidsInAuction) {
    this.bidsInAuction = bidsInAuction;
    return this;
  }

  /**
   * The number of bids for which the buyer was billed.
   * @return value or {@code null} for none
   */
  public MetricValue getBilledImpressions() {
    return billedImpressions;
  }

  /**
   * The number of bids for which the buyer was billed.
   * @param billedImpressions billedImpressions or {@code null} for none
   */
  public BidMetricsRow setBilledImpressions(MetricValue billedImpressions) {
    this.billedImpressions = billedImpressions;
    return this;
  }

  /**
   * The number of bids that won an impression.
   * @return value or {@code null} for none
   */
  public MetricValue getImpressionsWon() {
    return impressionsWon;
  }

  /**
   * The number of bids that won an impression.
   * @param impressionsWon impressionsWon or {@code null} for none
   */
  public BidMetricsRow setImpressionsWon(MetricValue impressionsWon) {
    this.impressionsWon = impressionsWon;
    return this;
  }

  /**
   * The number of bids for which the corresponding impression was measurable for viewability (as
   * defined by Active View).
   * @return value or {@code null} for none
   */
  public MetricValue getMeasurableImpressions() {
    return measurableImpressions;
  }

  /**
   * The number of bids for which the corresponding impression was measurable for viewability (as
   * defined by Active View).
   * @param measurableImpressions measurableImpressions or {@code null} for none
   */
  public BidMetricsRow setMeasurableImpressions(MetricValue measurableImpressions) {
    this.measurableImpressions = measurableImpressions;
    return this;
  }

  /**
   * The values of all dimensions associated with metric values in this row.
   * @return value or {@code null} for none
   */
  public RowDimensions getRowDimensions() {
    return rowDimensions;
  }

  /**
   * The values of all dimensions associated with metric values in this row.
   * @param rowDimensions rowDimensions or {@code null} for none
   */
  public BidMetricsRow setRowDimensions(RowDimensions rowDimensions) {
    this.rowDimensions = rowDimensions;
    return this;
  }

  /**
   * The number of bids for which the corresponding impression was viewable (as defined by Active
   * View).
   * @return value or {@code null} for none
   */
  public MetricValue getViewableImpressions() {
    return viewableImpressions;
  }

  /**
   * The number of bids for which the corresponding impression was viewable (as defined by Active
   * View).
   * @param viewableImpressions viewableImpressions or {@code null} for none
   */
  public BidMetricsRow setViewableImpressions(MetricValue viewableImpressions) {
    this.viewableImpressions = viewableImpressions;
    return this;
  }

  @Override
  public BidMetricsRow set(String fieldName, Object value) {
    return (BidMetricsRow) super.set(fieldName, value);
  }

  @Override
  public BidMetricsRow clone() {
    return (BidMetricsRow) super.clone();
  }

}
