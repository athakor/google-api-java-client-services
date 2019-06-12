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
 * DirectorySites contains properties of a website from the Site Directory. Sites need to be added
 * to an account via the Sites resource before they can be assigned to a placement.
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
public final class DirectorySite extends com.google.api.client.json.GenericJson {

  /**
   * Whether this directory site is active.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean active;

  /**
   * ID of this directory site. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Dimension value for the ID of this directory site. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue idDimensionValue;

  /**
   * Tag types for regular placements.
   *
   * Acceptable values are: - "STANDARD" - "IFRAME_JAVASCRIPT_INPAGE" - "INTERNAL_REDIRECT_INPAGE" -
   * "JAVASCRIPT_INPAGE"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> inpageTagFormats;

  /**
   * Tag types for interstitial placements.
   *
   * Acceptable values are: - "IFRAME_JAVASCRIPT_INTERSTITIAL" - "INTERNAL_REDIRECT_INTERSTITIAL" -
   * "JAVASCRIPT_INTERSTITIAL"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> interstitialTagFormats;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySite".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this directory site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Directory site settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DirectorySiteSettings settings;

  /**
   * URL of this directory site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Whether this directory site is active.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * Whether this directory site is active.
   * @param active active or {@code null} for none
   */
  public DirectorySite setActive(java.lang.Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * ID of this directory site. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this directory site. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public DirectorySite setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Dimension value for the ID of this directory site. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getIdDimensionValue() {
    return idDimensionValue;
  }

  /**
   * Dimension value for the ID of this directory site. This is a read-only, auto-generated field.
   * @param idDimensionValue idDimensionValue or {@code null} for none
   */
  public DirectorySite setIdDimensionValue(DimensionValue idDimensionValue) {
    this.idDimensionValue = idDimensionValue;
    return this;
  }

  /**
   * Tag types for regular placements.
   *
   * Acceptable values are: - "STANDARD" - "IFRAME_JAVASCRIPT_INPAGE" - "INTERNAL_REDIRECT_INPAGE" -
   * "JAVASCRIPT_INPAGE"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInpageTagFormats() {
    return inpageTagFormats;
  }

  /**
   * Tag types for regular placements.
   *
   * Acceptable values are: - "STANDARD" - "IFRAME_JAVASCRIPT_INPAGE" - "INTERNAL_REDIRECT_INPAGE" -
   * "JAVASCRIPT_INPAGE"
   * @param inpageTagFormats inpageTagFormats or {@code null} for none
   */
  public DirectorySite setInpageTagFormats(java.util.List<java.lang.String> inpageTagFormats) {
    this.inpageTagFormats = inpageTagFormats;
    return this;
  }

  /**
   * Tag types for interstitial placements.
   *
   * Acceptable values are: - "IFRAME_JAVASCRIPT_INTERSTITIAL" - "INTERNAL_REDIRECT_INTERSTITIAL" -
   * "JAVASCRIPT_INTERSTITIAL"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInterstitialTagFormats() {
    return interstitialTagFormats;
  }

  /**
   * Tag types for interstitial placements.
   *
   * Acceptable values are: - "IFRAME_JAVASCRIPT_INTERSTITIAL" - "INTERNAL_REDIRECT_INTERSTITIAL" -
   * "JAVASCRIPT_INTERSTITIAL"
   * @param interstitialTagFormats interstitialTagFormats or {@code null} for none
   */
  public DirectorySite setInterstitialTagFormats(java.util.List<java.lang.String> interstitialTagFormats) {
    this.interstitialTagFormats = interstitialTagFormats;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySite".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySite".
   * @param kind kind or {@code null} for none
   */
  public DirectorySite setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this directory site.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this directory site.
   * @param name name or {@code null} for none
   */
  public DirectorySite setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Directory site settings.
   * @return value or {@code null} for none
   */
  public DirectorySiteSettings getSettings() {
    return settings;
  }

  /**
   * Directory site settings.
   * @param settings settings or {@code null} for none
   */
  public DirectorySite setSettings(DirectorySiteSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * URL of this directory site.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL of this directory site.
   * @param url url or {@code null} for none
   */
  public DirectorySite setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public DirectorySite set(String fieldName, Object value) {
    return (DirectorySite) super.set(fieldName, value);
  }

  @Override
  public DirectorySite clone() {
    return (DirectorySite) super.clone();
  }

}
