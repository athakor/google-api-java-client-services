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

package com.google.api.services.dataproc.v1beta2.model;

/**
 * A request to instantiate a workflow template.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstantiateWorkflowTemplateRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Please use request_id field instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceId;

  /**
   * Optional. Map from parameter names to values that should be used for those parameters. Values
   * may not exceed 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> parameters;

  /**
   * Optional. A tag that prevents multiple concurrent workflow instances with the same tag from
   * running. This mitigates risk of concurrent instances started due to retries.It is recommended
   * to always set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The tag must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Optional. The version of workflow template to instantiate. If specified, the workflow will be
   * instantiated only if the current version of the workflow template has the supplied version.This
   * option cannot be used to instantiate a previous version of workflow template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * Deprecated. Please use request_id field instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceId() {
    return instanceId;
  }

  /**
   * Deprecated. Please use request_id field instead.
   * @param instanceId instanceId or {@code null} for none
   */
  public InstantiateWorkflowTemplateRequest setInstanceId(java.lang.String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Optional. Map from parameter names to values that should be used for those parameters. Values
   * may not exceed 100 characters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getParameters() {
    return parameters;
  }

  /**
   * Optional. Map from parameter names to values that should be used for those parameters. Values
   * may not exceed 100 characters.
   * @param parameters parameters or {@code null} for none
   */
  public InstantiateWorkflowTemplateRequest setParameters(java.util.Map<String, java.lang.String> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Optional. A tag that prevents multiple concurrent workflow instances with the same tag from
   * running. This mitigates risk of concurrent instances started due to retries.It is recommended
   * to always set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The tag must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Optional. A tag that prevents multiple concurrent workflow instances with the same tag from
   * running. This mitigates risk of concurrent instances started due to retries.It is recommended
   * to always set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The tag must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * @param requestId requestId or {@code null} for none
   */
  public InstantiateWorkflowTemplateRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Optional. The version of workflow template to instantiate. If specified, the workflow will be
   * instantiated only if the current version of the workflow template has the supplied version.This
   * option cannot be used to instantiate a previous version of workflow template.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Optional. The version of workflow template to instantiate. If specified, the workflow will be
   * instantiated only if the current version of the workflow template has the supplied version.This
   * option cannot be used to instantiate a previous version of workflow template.
   * @param version version or {@code null} for none
   */
  public InstantiateWorkflowTemplateRequest setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public InstantiateWorkflowTemplateRequest set(String fieldName, Object value) {
    return (InstantiateWorkflowTemplateRequest) super.set(fieldName, value);
  }

  @Override
  public InstantiateWorkflowTemplateRequest clone() {
    return (InstantiateWorkflowTemplateRequest) super.clone();
  }

}
