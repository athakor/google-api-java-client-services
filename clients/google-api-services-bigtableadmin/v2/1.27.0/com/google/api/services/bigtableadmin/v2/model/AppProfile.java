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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * A configuration object describing how Cloud Bigtable should treat traffic from a particular end
 * user application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppProfile extends com.google.api.client.json.GenericJson {

  /**
   * Optional long form description of the use case for this AppProfile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Strongly validated etag for optimistic concurrency control. Preserve the value returned from
   * `GetAppProfile` when calling `UpdateAppProfile` to fail the request if there has been a
   * modification in the mean time. The `update_mask` of the request need not include `etag` for
   * this protection to apply. See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and [RFC
   * 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Use a multi-cluster routing policy that may pick any cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MultiClusterRoutingUseAny multiClusterRoutingUseAny;

  /**
   * (`OutputOnly`) The unique name of the app profile. Values are of the form
   * `projects//instances//appProfiles/_a-zA-Z0-9*`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Use a single-cluster routing policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SingleClusterRouting singleClusterRouting;

  /**
   * Optional long form description of the use case for this AppProfile.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional long form description of the use case for this AppProfile.
   * @param description description or {@code null} for none
   */
  public AppProfile setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Strongly validated etag for optimistic concurrency control. Preserve the value returned from
   * `GetAppProfile` when calling `UpdateAppProfile` to fail the request if there has been a
   * modification in the mean time. The `update_mask` of the request need not include `etag` for
   * this protection to apply. See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and [RFC
   * 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Strongly validated etag for optimistic concurrency control. Preserve the value returned from
   * `GetAppProfile` when calling `UpdateAppProfile` to fail the request if there has been a
   * modification in the mean time. The `update_mask` of the request need not include `etag` for
   * this protection to apply. See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and [RFC
   * 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more details.
   * @param etag etag or {@code null} for none
   */
  public AppProfile setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Use a multi-cluster routing policy that may pick any cluster.
   * @return value or {@code null} for none
   */
  public MultiClusterRoutingUseAny getMultiClusterRoutingUseAny() {
    return multiClusterRoutingUseAny;
  }

  /**
   * Use a multi-cluster routing policy that may pick any cluster.
   * @param multiClusterRoutingUseAny multiClusterRoutingUseAny or {@code null} for none
   */
  public AppProfile setMultiClusterRoutingUseAny(MultiClusterRoutingUseAny multiClusterRoutingUseAny) {
    this.multiClusterRoutingUseAny = multiClusterRoutingUseAny;
    return this;
  }

  /**
   * (`OutputOnly`) The unique name of the app profile. Values are of the form
   * `projects//instances//appProfiles/_a-zA-Z0-9*`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * (`OutputOnly`) The unique name of the app profile. Values are of the form
   * `projects//instances//appProfiles/_a-zA-Z0-9*`.
   * @param name name or {@code null} for none
   */
  public AppProfile setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Use a single-cluster routing policy.
   * @return value or {@code null} for none
   */
  public SingleClusterRouting getSingleClusterRouting() {
    return singleClusterRouting;
  }

  /**
   * Use a single-cluster routing policy.
   * @param singleClusterRouting singleClusterRouting or {@code null} for none
   */
  public AppProfile setSingleClusterRouting(SingleClusterRouting singleClusterRouting) {
    this.singleClusterRouting = singleClusterRouting;
    return this;
  }

  @Override
  public AppProfile set(String fieldName, Object value) {
    return (AppProfile) super.set(fieldName, value);
  }

  @Override
  public AppProfile clone() {
    return (AppProfile) super.clone();
  }

}
