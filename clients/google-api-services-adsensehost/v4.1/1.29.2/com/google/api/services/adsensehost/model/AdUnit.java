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

package com.google.api.services.adsensehost.model;

/**
 * Model definition for AdUnit.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Host API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdUnit extends com.google.api.client.json.GenericJson {

  /**
   * Identity code of this ad unit, not necessarily unique across ad clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContentAdsSettings contentAdsSettings;

  /**
   * Custom style information specific to this ad unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdStyle customStyle;

  /**
   * Unique identifier of this ad unit. This should be considered an opaque identifier; it is not
   * safe to rely on it being in any particular format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Kind of resource this is, in this case adsensehost#adUnit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Settings specific to WAP mobile content ads (AFMC - deprecated).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MobileContentAdsSettings mobileContentAdsSettings;

  /**
   * Name of this ad unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Status of this ad unit. Possible values are: NEW: Indicates that the ad unit was created within
   * the last seven days and does not yet have any activity associated with it.
   *
   * ACTIVE: Indicates that there has been activity on this ad unit in the last seven days.
   *
   * INACTIVE: Indicates that there has been no activity on this ad unit in the last seven days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Identity code of this ad unit, not necessarily unique across ad clients.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Identity code of this ad unit, not necessarily unique across ad clients.
   * @param code code or {@code null} for none
   */
  public AdUnit setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated).
   * @return value or {@code null} for none
   */
  public ContentAdsSettings getContentAdsSettings() {
    return contentAdsSettings;
  }

  /**
   * Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated).
   * @param contentAdsSettings contentAdsSettings or {@code null} for none
   */
  public AdUnit setContentAdsSettings(ContentAdsSettings contentAdsSettings) {
    this.contentAdsSettings = contentAdsSettings;
    return this;
  }

  /**
   * Custom style information specific to this ad unit.
   * @return value or {@code null} for none
   */
  public AdStyle getCustomStyle() {
    return customStyle;
  }

  /**
   * Custom style information specific to this ad unit.
   * @param customStyle customStyle or {@code null} for none
   */
  public AdUnit setCustomStyle(AdStyle customStyle) {
    this.customStyle = customStyle;
    return this;
  }

  /**
   * Unique identifier of this ad unit. This should be considered an opaque identifier; it is not
   * safe to rely on it being in any particular format.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier of this ad unit. This should be considered an opaque identifier; it is not
   * safe to rely on it being in any particular format.
   * @param id id or {@code null} for none
   */
  public AdUnit setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Kind of resource this is, in this case adsensehost#adUnit.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is, in this case adsensehost#adUnit.
   * @param kind kind or {@code null} for none
   */
  public AdUnit setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Settings specific to WAP mobile content ads (AFMC - deprecated).
   * @return value or {@code null} for none
   */
  public MobileContentAdsSettings getMobileContentAdsSettings() {
    return mobileContentAdsSettings;
  }

  /**
   * Settings specific to WAP mobile content ads (AFMC - deprecated).
   * @param mobileContentAdsSettings mobileContentAdsSettings or {@code null} for none
   */
  public AdUnit setMobileContentAdsSettings(MobileContentAdsSettings mobileContentAdsSettings) {
    this.mobileContentAdsSettings = mobileContentAdsSettings;
    return this;
  }

  /**
   * Name of this ad unit.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this ad unit.
   * @param name name or {@code null} for none
   */
  public AdUnit setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Status of this ad unit. Possible values are: NEW: Indicates that the ad unit was created within
   * the last seven days and does not yet have any activity associated with it.
   *
   * ACTIVE: Indicates that there has been activity on this ad unit in the last seven days.
   *
   * INACTIVE: Indicates that there has been no activity on this ad unit in the last seven days.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of this ad unit. Possible values are: NEW: Indicates that the ad unit was created within
   * the last seven days and does not yet have any activity associated with it.
   *
   * ACTIVE: Indicates that there has been activity on this ad unit in the last seven days.
   *
   * INACTIVE: Indicates that there has been no activity on this ad unit in the last seven days.
   * @param status status or {@code null} for none
   */
  public AdUnit setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public AdUnit set(String fieldName, Object value) {
    return (AdUnit) super.set(fieldName, value);
  }

  @Override
  public AdUnit clone() {
    return (AdUnit) super.clone();
  }

  /**
   * Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated).
   */
  public static final class ContentAdsSettings extends com.google.api.client.json.GenericJson {

    /**
     * The backup option to be used in instances where no ad is available.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private BackupOption backupOption;

    /**
     * Size of this ad unit. Size values are in the form SIZE_{width}_{height}.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String size;

    /**
     * Type of this ad unit. Possible values are TEXT, TEXT_IMAGE, IMAGE and LINK.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * The backup option to be used in instances where no ad is available.
     * @return value or {@code null} for none
     */
    public BackupOption getBackupOption() {
      return backupOption;
    }

    /**
     * The backup option to be used in instances where no ad is available.
     * @param backupOption backupOption or {@code null} for none
     */
    public ContentAdsSettings setBackupOption(BackupOption backupOption) {
      this.backupOption = backupOption;
      return this;
    }

    /**
     * Size of this ad unit. Size values are in the form SIZE_{width}_{height}.
     * @return value or {@code null} for none
     */
    public java.lang.String getSize() {
      return size;
    }

    /**
     * Size of this ad unit. Size values are in the form SIZE_{width}_{height}.
     * @param size size or {@code null} for none
     */
    public ContentAdsSettings setSize(java.lang.String size) {
      this.size = size;
      return this;
    }

    /**
     * Type of this ad unit. Possible values are TEXT, TEXT_IMAGE, IMAGE and LINK.
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
      return type;
    }

    /**
     * Type of this ad unit. Possible values are TEXT, TEXT_IMAGE, IMAGE and LINK.
     * @param type type or {@code null} for none
     */
    public ContentAdsSettings setType(java.lang.String type) {
      this.type = type;
      return this;
    }

    @Override
    public ContentAdsSettings set(String fieldName, Object value) {
      return (ContentAdsSettings) super.set(fieldName, value);
    }

    @Override
    public ContentAdsSettings clone() {
      return (ContentAdsSettings) super.clone();
    }

    /**
     * The backup option to be used in instances where no ad is available.
     */
    public static final class BackupOption extends com.google.api.client.json.GenericJson {

      /**
       * Color to use when type is set to COLOR. These are represented as six hexadecimal characters,
       * similar to HTML color codes, but without the leading hash.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String color;

      /**
       * Type of the backup option. Possible values are BLANK, COLOR and URL.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String type;

      /**
       * URL to use when type is set to URL.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String url;

      /**
       * Color to use when type is set to COLOR. These are represented as six hexadecimal characters,
       * similar to HTML color codes, but without the leading hash.
       * @return value or {@code null} for none
       */
      public java.lang.String getColor() {
        return color;
      }

      /**
       * Color to use when type is set to COLOR. These are represented as six hexadecimal characters,
       * similar to HTML color codes, but without the leading hash.
       * @param color color or {@code null} for none
       */
      public BackupOption setColor(java.lang.String color) {
        this.color = color;
        return this;
      }

      /**
       * Type of the backup option. Possible values are BLANK, COLOR and URL.
       * @return value or {@code null} for none
       */
      public java.lang.String getType() {
        return type;
      }

      /**
       * Type of the backup option. Possible values are BLANK, COLOR and URL.
       * @param type type or {@code null} for none
       */
      public BackupOption setType(java.lang.String type) {
        this.type = type;
        return this;
      }

      /**
       * URL to use when type is set to URL.
       * @return value or {@code null} for none
       */
      public java.lang.String getUrl() {
        return url;
      }

      /**
       * URL to use when type is set to URL.
       * @param url url or {@code null} for none
       */
      public BackupOption setUrl(java.lang.String url) {
        this.url = url;
        return this;
      }

      @Override
      public BackupOption set(String fieldName, Object value) {
        return (BackupOption) super.set(fieldName, value);
      }

      @Override
      public BackupOption clone() {
        return (BackupOption) super.clone();
      }

    }
  }

  /**
   * Settings specific to WAP mobile content ads (AFMC - deprecated).
   */
  public static final class MobileContentAdsSettings extends com.google.api.client.json.GenericJson {

    /**
     * The markup language to use for this ad unit.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String markupLanguage;

    /**
     * The scripting language to use for this ad unit.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String scriptingLanguage;

    /**
     * Size of this ad unit.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String size;

    /**
     * Type of this ad unit.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * The markup language to use for this ad unit.
     * @return value or {@code null} for none
     */
    public java.lang.String getMarkupLanguage() {
      return markupLanguage;
    }

    /**
     * The markup language to use for this ad unit.
     * @param markupLanguage markupLanguage or {@code null} for none
     */
    public MobileContentAdsSettings setMarkupLanguage(java.lang.String markupLanguage) {
      this.markupLanguage = markupLanguage;
      return this;
    }

    /**
     * The scripting language to use for this ad unit.
     * @return value or {@code null} for none
     */
    public java.lang.String getScriptingLanguage() {
      return scriptingLanguage;
    }

    /**
     * The scripting language to use for this ad unit.
     * @param scriptingLanguage scriptingLanguage or {@code null} for none
     */
    public MobileContentAdsSettings setScriptingLanguage(java.lang.String scriptingLanguage) {
      this.scriptingLanguage = scriptingLanguage;
      return this;
    }

    /**
     * Size of this ad unit.
     * @return value or {@code null} for none
     */
    public java.lang.String getSize() {
      return size;
    }

    /**
     * Size of this ad unit.
     * @param size size or {@code null} for none
     */
    public MobileContentAdsSettings setSize(java.lang.String size) {
      this.size = size;
      return this;
    }

    /**
     * Type of this ad unit.
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
      return type;
    }

    /**
     * Type of this ad unit.
     * @param type type or {@code null} for none
     */
    public MobileContentAdsSettings setType(java.lang.String type) {
      this.type = type;
      return this;
    }

    @Override
    public MobileContentAdsSettings set(String fieldName, Object value) {
      return (MobileContentAdsSettings) super.set(fieldName, value);
    }

    @Override
    public MobileContentAdsSettings clone() {
      return (MobileContentAdsSettings) super.clone();
    }

  }

}
