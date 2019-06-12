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
 * Reporting Configuration
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
public final class ReportsConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * Whether the exposure to conversion report is enabled. This report shows detailed pathway
   * information on up to 10 of the most recent ad exposures seen by a user before converting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exposureToConversionEnabled;

  /**
   * Default lookback windows for new advertisers in this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LookbackConfiguration lookbackConfiguration;

  /**
   * Report generation time zone ID of this account. This is a required field that can only be
   * changed by a superuser. Acceptable values are:
   *
   * - "1" for "America/New_York"  - "2" for "Europe/London"  - "3" for "Europe/Paris"  - "4" for
   * "Africa/Johannesburg"  - "5" for "Asia/Jerusalem"  - "6" for "Asia/Shanghai"  - "7" for
   * "Asia/Hong_Kong"  - "8" for "Asia/Tokyo"  - "9" for "Australia/Sydney"  - "10" for "Asia/Dubai"
   * - "11" for "America/Los_Angeles"  - "12" for "Pacific/Auckland"  - "13" for "America/Sao_Paulo"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reportGenerationTimeZoneId;

  /**
   * Whether the exposure to conversion report is enabled. This report shows detailed pathway
   * information on up to 10 of the most recent ad exposures seen by a user before converting.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExposureToConversionEnabled() {
    return exposureToConversionEnabled;
  }

  /**
   * Whether the exposure to conversion report is enabled. This report shows detailed pathway
   * information on up to 10 of the most recent ad exposures seen by a user before converting.
   * @param exposureToConversionEnabled exposureToConversionEnabled or {@code null} for none
   */
  public ReportsConfiguration setExposureToConversionEnabled(java.lang.Boolean exposureToConversionEnabled) {
    this.exposureToConversionEnabled = exposureToConversionEnabled;
    return this;
  }

  /**
   * Default lookback windows for new advertisers in this account.
   * @return value or {@code null} for none
   */
  public LookbackConfiguration getLookbackConfiguration() {
    return lookbackConfiguration;
  }

  /**
   * Default lookback windows for new advertisers in this account.
   * @param lookbackConfiguration lookbackConfiguration or {@code null} for none
   */
  public ReportsConfiguration setLookbackConfiguration(LookbackConfiguration lookbackConfiguration) {
    this.lookbackConfiguration = lookbackConfiguration;
    return this;
  }

  /**
   * Report generation time zone ID of this account. This is a required field that can only be
   * changed by a superuser. Acceptable values are:
   *
   * - "1" for "America/New_York"  - "2" for "Europe/London"  - "3" for "Europe/Paris"  - "4" for
   * "Africa/Johannesburg"  - "5" for "Asia/Jerusalem"  - "6" for "Asia/Shanghai"  - "7" for
   * "Asia/Hong_Kong"  - "8" for "Asia/Tokyo"  - "9" for "Australia/Sydney"  - "10" for "Asia/Dubai"
   * - "11" for "America/Los_Angeles"  - "12" for "Pacific/Auckland"  - "13" for "America/Sao_Paulo"
   * @return value or {@code null} for none
   */
  public java.lang.Long getReportGenerationTimeZoneId() {
    return reportGenerationTimeZoneId;
  }

  /**
   * Report generation time zone ID of this account. This is a required field that can only be
   * changed by a superuser. Acceptable values are:
   *
   * - "1" for "America/New_York"  - "2" for "Europe/London"  - "3" for "Europe/Paris"  - "4" for
   * "Africa/Johannesburg"  - "5" for "Asia/Jerusalem"  - "6" for "Asia/Shanghai"  - "7" for
   * "Asia/Hong_Kong"  - "8" for "Asia/Tokyo"  - "9" for "Australia/Sydney"  - "10" for "Asia/Dubai"
   * - "11" for "America/Los_Angeles"  - "12" for "Pacific/Auckland"  - "13" for "America/Sao_Paulo"
   * @param reportGenerationTimeZoneId reportGenerationTimeZoneId or {@code null} for none
   */
  public ReportsConfiguration setReportGenerationTimeZoneId(java.lang.Long reportGenerationTimeZoneId) {
    this.reportGenerationTimeZoneId = reportGenerationTimeZoneId;
    return this;
  }

  @Override
  public ReportsConfiguration set(String fieldName, Object value) {
    return (ReportsConfiguration) super.set(fieldName, value);
  }

  @Override
  public ReportsConfiguration clone() {
    return (ReportsConfiguration) super.clone();
  }

}
