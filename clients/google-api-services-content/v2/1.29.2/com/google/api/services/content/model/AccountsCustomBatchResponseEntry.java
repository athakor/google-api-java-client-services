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

package com.google.api.services.content.model;

/**
 * A batch entry encoding a single non-batch accounts response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountsCustomBatchResponseEntry extends com.google.api.client.json.GenericJson {

  /**
   * The retrieved, created, or updated account. Not defined if the method was delete, claimwebsite
   * or link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Account account;

  /**
   * The ID of the request entry this entry responds to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * A list of errors defined if and only if the request failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Errors errors;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#accountsCustomBatchResponseEntry".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Deprecated. This field is never set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkStatus;

  /**
   * The retrieved, created, or updated account. Not defined if the method was delete, claimwebsite
   * or link.
   * @return value or {@code null} for none
   */
  public Account getAccount() {
    return account;
  }

  /**
   * The retrieved, created, or updated account. Not defined if the method was delete, claimwebsite
   * or link.
   * @param account account or {@code null} for none
   */
  public AccountsCustomBatchResponseEntry setAccount(Account account) {
    this.account = account;
    return this;
  }

  /**
   * The ID of the request entry this entry responds to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * The ID of the request entry this entry responds to.
   * @param batchId batchId or {@code null} for none
   */
  public AccountsCustomBatchResponseEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * A list of errors defined if and only if the request failed.
   * @return value or {@code null} for none
   */
  public Errors getErrors() {
    return errors;
  }

  /**
   * A list of errors defined if and only if the request failed.
   * @param errors errors or {@code null} for none
   */
  public AccountsCustomBatchResponseEntry setErrors(Errors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#accountsCustomBatchResponseEntry".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#accountsCustomBatchResponseEntry".
   * @param kind kind or {@code null} for none
   */
  public AccountsCustomBatchResponseEntry setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Deprecated. This field is never set.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkStatus() {
    return linkStatus;
  }

  /**
   * Deprecated. This field is never set.
   * @param linkStatus linkStatus or {@code null} for none
   */
  public AccountsCustomBatchResponseEntry setLinkStatus(java.lang.String linkStatus) {
    this.linkStatus = linkStatus;
    return this;
  }

  @Override
  public AccountsCustomBatchResponseEntry set(String fieldName, Object value) {
    return (AccountsCustomBatchResponseEntry) super.set(fieldName, value);
  }

  @Override
  public AccountsCustomBatchResponseEntry clone() {
    return (AccountsCustomBatchResponseEntry) super.clone();
  }

}
