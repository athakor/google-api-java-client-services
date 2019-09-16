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

package com.google.api.services.securitycenter.v1.model;

/**
 * Defines an Identity and Access Management (IAM) policy. It is used to specify access control
 * policies for Cloud Platform resources.
 *
 * A `Policy` consists of a list of `bindings`. A `binding` binds a list of `members` to a `role`,
 * where the members can be user accounts, Google groups, Google domains, and service accounts. A
 * `role` is a named list of permissions defined by IAM.
 *
 * **JSON Example**
 *
 *     {       "bindings": [         {           "role": "roles/owner",           "members": [
 * "user:mike@example.com",             "group:admins@example.com",             "domain:google.com",
 * "serviceAccount:my-other-app@appspot.gserviceaccount.com"           ]         },         {
 * "role": "roles/viewer",           "members": ["user:sean@example.com"]         }       ]     }
 *
 * **YAML Example**
 *
 *     bindings:     - members:       - user:mike@example.com       - group:admins@example.com
 * - domain:google.com       - serviceAccount:my-other-app@appspot.gserviceaccount.com       role:
 * roles/owner     - members:       - user:sean@example.com       role: roles/viewer
 *
 * For a description of IAM and its features, see the [IAM developer's
 * guide](https://cloud.google.com/iam/docs).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Policy extends com.google.api.client.json.GenericJson {

  /**
   * Specifies cloud audit logging configuration for this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AuditConfig> auditConfigs;

  static {
    // hack to force ProGuard to consider AuditConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AuditConfig.class);
  }

  /**
   * Associates a list of `members` to a `role`. `bindings` with no members will result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Binding> bindings;

  static {
    // hack to force ProGuard to consider Binding used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Binding.class);
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy.
   *
   * If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is
   * overwritten.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Specifies the format of the policy.
   *
   * Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.
   *
   * Policies with any conditional bindings must specify version 3. Policies without any conditional
   * bindings may specify any valid value or leave the field unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * Specifies cloud audit logging configuration for this policy.
   * @return value or {@code null} for none
   */
  public java.util.List<AuditConfig> getAuditConfigs() {
    return auditConfigs;
  }

  /**
   * Specifies cloud audit logging configuration for this policy.
   * @param auditConfigs auditConfigs or {@code null} for none
   */
  public Policy setAuditConfigs(java.util.List<AuditConfig> auditConfigs) {
    this.auditConfigs = auditConfigs;
    return this;
  }

  /**
   * Associates a list of `members` to a `role`. `bindings` with no members will result in an error.
   * @return value or {@code null} for none
   */
  public java.util.List<Binding> getBindings() {
    return bindings;
  }

  /**
   * Associates a list of `members` to a `role`. `bindings` with no members will result in an error.
   * @param bindings bindings or {@code null} for none
   */
  public Policy setBindings(java.util.List<Binding> bindings) {
    this.bindings = bindings;
    return this;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy.
   *
   * If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is
   * overwritten.
   * @see #decodeEtag()
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy.
   *
   * If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is
   * overwritten.
   * @see #getEtag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEtag() {
    return com.google.api.client.util.Base64.decodeBase64(etag);
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy.
   *
   * If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is
   * overwritten.
   * @see #encodeEtag()
   * @param etag etag or {@code null} for none
   */
  public Policy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   * to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   * to the same version of the policy.
   *
   * If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is
   * overwritten.
   * @see #setEtag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Policy encodeEtag(byte[] etag) {
    this.etag = com.google.api.client.util.Base64.encodeBase64URLSafeString(etag);
    return this;
  }

  /**
   * Specifies the format of the policy.
   *
   * Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.
   *
   * Policies with any conditional bindings must specify version 3. Policies without any conditional
   * bindings may specify any valid value or leave the field unset.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Specifies the format of the policy.
   *
   * Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.
   *
   * Policies with any conditional bindings must specify version 3. Policies without any conditional
   * bindings may specify any valid value or leave the field unset.
   * @param version version or {@code null} for none
   */
  public Policy setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public Policy set(String fieldName, Object value) {
    return (Policy) super.set(fieldName, value);
  }

  @Override
  public Policy clone() {
    return (Policy) super.clone();
  }

}
