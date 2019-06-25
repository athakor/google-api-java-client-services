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

package com.google.api.services.androidenterprise.model;

/**
 * A WebApps resource represents a web app created for an enterprise. Web apps are published to
 * managed Google Play and can be distributed like other Android apps. On a user's device, a web app
 * opens its specified URL.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WebApp extends com.google.api.client.json.GenericJson {

  /**
   * The display mode of the web app.
   *
   * Possible values include:  - "minimalUi", the device's status bar, navigation bar, the app's
   * URL, and a refresh button are visible when the app is open. For HTTP URLs, you can only select
   * this option. - "standalone", the device's status bar and navigation bar are visible when the
   * app is open. - "fullScreen", the app opens in full screen mode, hiding the device's status and
   * navigation bars. All browser UI elements, page URL, system status bar and back button are not
   * visible, and the web app takes up the entirety of the available display area.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayMode;

  /**
   * A list of icons representing this website. If absent, a default icon (for create) or the
   * current icon (for update) will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebAppIcon> icons;

  /**
   * A flag whether the app has been published to the Play store yet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPublished;

  /**
   * The start URL, i.e. the URL that should load when the user opens the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startUrl;

  /**
   * The title of the web app as displayed to the user (e.g., amongst a list of other applications,
   * or as a label for an icon).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The current version of the app.
   *
   * Note that the version can automatically increase during the lifetime of the web app, while
   * Google does internal housekeeping to keep the web app up-to-date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long versionCode;

  /**
   * The ID of the application. A string of the form "app:" where the package name always starts
   * with the prefix "com.google.enterprise.webapp." followed by a random id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webAppId;

  /**
   * The display mode of the web app.
   *
   * Possible values include:  - "minimalUi", the device's status bar, navigation bar, the app's
   * URL, and a refresh button are visible when the app is open. For HTTP URLs, you can only select
   * this option. - "standalone", the device's status bar and navigation bar are visible when the
   * app is open. - "fullScreen", the app opens in full screen mode, hiding the device's status and
   * navigation bars. All browser UI elements, page URL, system status bar and back button are not
   * visible, and the web app takes up the entirety of the available display area.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayMode() {
    return displayMode;
  }

  /**
   * The display mode of the web app.
   *
   * Possible values include:  - "minimalUi", the device's status bar, navigation bar, the app's
   * URL, and a refresh button are visible when the app is open. For HTTP URLs, you can only select
   * this option. - "standalone", the device's status bar and navigation bar are visible when the
   * app is open. - "fullScreen", the app opens in full screen mode, hiding the device's status and
   * navigation bars. All browser UI elements, page URL, system status bar and back button are not
   * visible, and the web app takes up the entirety of the available display area.
   * @param displayMode displayMode or {@code null} for none
   */
  public WebApp setDisplayMode(java.lang.String displayMode) {
    this.displayMode = displayMode;
    return this;
  }

  /**
   * A list of icons representing this website. If absent, a default icon (for create) or the
   * current icon (for update) will be used.
   * @return value or {@code null} for none
   */
  public java.util.List<WebAppIcon> getIcons() {
    return icons;
  }

  /**
   * A list of icons representing this website. If absent, a default icon (for create) or the
   * current icon (for update) will be used.
   * @param icons icons or {@code null} for none
   */
  public WebApp setIcons(java.util.List<WebAppIcon> icons) {
    this.icons = icons;
    return this;
  }

  /**
   * A flag whether the app has been published to the Play store yet.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPublished() {
    return isPublished;
  }

  /**
   * A flag whether the app has been published to the Play store yet.
   * @param isPublished isPublished or {@code null} for none
   */
  public WebApp setIsPublished(java.lang.Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * The start URL, i.e. the URL that should load when the user opens the application.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartUrl() {
    return startUrl;
  }

  /**
   * The start URL, i.e. the URL that should load when the user opens the application.
   * @param startUrl startUrl or {@code null} for none
   */
  public WebApp setStartUrl(java.lang.String startUrl) {
    this.startUrl = startUrl;
    return this;
  }

  /**
   * The title of the web app as displayed to the user (e.g., amongst a list of other applications,
   * or as a label for an icon).
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the web app as displayed to the user (e.g., amongst a list of other applications,
   * or as a label for an icon).
   * @param title title or {@code null} for none
   */
  public WebApp setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The current version of the app.
   *
   * Note that the version can automatically increase during the lifetime of the web app, while
   * Google does internal housekeeping to keep the web app up-to-date.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersionCode() {
    return versionCode;
  }

  /**
   * The current version of the app.
   *
   * Note that the version can automatically increase during the lifetime of the web app, while
   * Google does internal housekeeping to keep the web app up-to-date.
   * @param versionCode versionCode or {@code null} for none
   */
  public WebApp setVersionCode(java.lang.Long versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * The ID of the application. A string of the form "app:" where the package name always starts
   * with the prefix "com.google.enterprise.webapp." followed by a random id.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebAppId() {
    return webAppId;
  }

  /**
   * The ID of the application. A string of the form "app:" where the package name always starts
   * with the prefix "com.google.enterprise.webapp." followed by a random id.
   * @param webAppId webAppId or {@code null} for none
   */
  public WebApp setWebAppId(java.lang.String webAppId) {
    this.webAppId = webAppId;
    return this;
  }

  @Override
  public WebApp set(String fieldName, Object value) {
    return (WebApp) super.set(fieldName, value);
  }

  @Override
  public WebApp clone() {
    return (WebApp) super.clone();
  }

}
