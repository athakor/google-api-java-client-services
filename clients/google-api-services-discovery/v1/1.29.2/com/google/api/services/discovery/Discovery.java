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

package com.google.api.services.discovery;

/**
 * Service definition for Discovery (v1).
 *
 * <p>
 * Provides information about other Google APIs, such as what APIs are available, the resource, and method details for each API.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/discovery/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link DiscoveryRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Discovery extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.29.2 of the API Discovery Service library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "discovery/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/discovery/v1";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Discovery(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Discovery(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Apis collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Discovery discovery = new Discovery(...);}
   *   {@code Discovery.Apis.List request = discovery.apis().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Apis apis() {
    return new Apis();
  }

  /**
   * The "apis" collection of methods.
   */
  public class Apis {

    /**
     * Retrieve the description of a particular version of an api.
     *
     * Create a request for the method "apis.getRest".
     *
     * This request holds the parameters needed by the discovery server.  After setting any optional
     * parameters, call the {@link GetRest#execute()} method to invoke the remote operation.
     *
     * @param api The name of the API.
     * @param version The version of the API.
     * @return the request
     */
    public GetRest getRest(java.lang.String api, java.lang.String version) throws java.io.IOException {
      GetRest result = new GetRest(api, version);
      initialize(result);
      return result;
    }

    public class GetRest extends DiscoveryRequest<com.google.api.services.discovery.model.RestDescription> {

      private static final String REST_PATH = "apis/{api}/{version}/rest";

      /**
       * Retrieve the description of a particular version of an api.
       *
       * Create a request for the method "apis.getRest".
       *
       * This request holds the parameters needed by the the discovery server.  After setting any
       * optional parameters, call the {@link GetRest#execute()} method to invoke the remote operation.
       * <p> {@link
       * GetRest#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param api The name of the API.
       * @param version The version of the API.
       * @since 1.13
       */
      protected GetRest(java.lang.String api, java.lang.String version) {
        super(Discovery.this, "GET", REST_PATH, null, com.google.api.services.discovery.model.RestDescription.class);
        this.api = com.google.api.client.util.Preconditions.checkNotNull(api, "Required parameter api must be specified.");
        this.version = com.google.api.client.util.Preconditions.checkNotNull(version, "Required parameter version must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetRest setAlt(java.lang.String alt) {
        return (GetRest) super.setAlt(alt);
      }

      @Override
      public GetRest setFields(java.lang.String fields) {
        return (GetRest) super.setFields(fields);
      }

      @Override
      public GetRest setKey(java.lang.String key) {
        return (GetRest) super.setKey(key);
      }

      @Override
      public GetRest setOauthToken(java.lang.String oauthToken) {
        return (GetRest) super.setOauthToken(oauthToken);
      }

      @Override
      public GetRest setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetRest) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetRest setQuotaUser(java.lang.String quotaUser) {
        return (GetRest) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetRest setUserIp(java.lang.String userIp) {
        return (GetRest) super.setUserIp(userIp);
      }

      /** The name of the API. */
      @com.google.api.client.util.Key
      private java.lang.String api;

      /** The name of the API.
       */
      public java.lang.String getApi() {
        return api;
      }

      /** The name of the API. */
      public GetRest setApi(java.lang.String api) {
        this.api = api;
        return this;
      }

      /** The version of the API. */
      @com.google.api.client.util.Key
      private java.lang.String version;

      /** The version of the API.
       */
      public java.lang.String getVersion() {
        return version;
      }

      /** The version of the API. */
      public GetRest setVersion(java.lang.String version) {
        this.version = version;
        return this;
      }

      @Override
      public GetRest set(String parameterName, Object value) {
        return (GetRest) super.set(parameterName, value);
      }
    }
    /**
     * Retrieve the list of APIs supported at this endpoint.
     *
     * Create a request for the method "apis.list".
     *
     * This request holds the parameters needed by the discovery server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends DiscoveryRequest<com.google.api.services.discovery.model.DirectoryList> {

      private static final String REST_PATH = "apis";

      /**
       * Retrieve the list of APIs supported at this endpoint.
       *
       * Create a request for the method "apis.list".
       *
       * This request holds the parameters needed by the the discovery server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(Discovery.this, "GET", REST_PATH, null, com.google.api.services.discovery.model.DirectoryList.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      /** Only include APIs with the given name. */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** Only include APIs with the given name.
       */
      public java.lang.String getName() {
        return name;
      }

      /** Only include APIs with the given name. */
      public List setName(java.lang.String name) {
        this.name = name;
        return this;
      }

      /** Return only the preferred version of an API. */
      @com.google.api.client.util.Key
      private java.lang.Boolean preferred;

      /** Return only the preferred version of an API. [default: false]
       */
      public java.lang.Boolean getPreferred() {
        return preferred;
      }

      /** Return only the preferred version of an API. */
      public List setPreferred(java.lang.Boolean preferred) {
        this.preferred = preferred;
        return this;
      }

      /**
       * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
       *
       * <p>
       * Boolean properties can have four possible values:
       * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
       * or {@link Boolean#FALSE}.
       * </p>
       *
       * <p>
       * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
       * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
       * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
       * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
       * </p>
       *
       * <p>
       * Return only the preferred version of an API.
       * </p>
       */
      public boolean isPreferred() {
        if (preferred == null || preferred == com.google.api.client.util.Data.NULL_BOOLEAN) {
          return false;
        }
        return preferred;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Discovery}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Discovery}. */
    @Override
    public Discovery build() {
      return new Discovery(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link DiscoveryRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setDiscoveryRequestInitializer(
        DiscoveryRequestInitializer discoveryRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(discoveryRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
