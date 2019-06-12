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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * A `LogFile` is a log stored in the CAS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2LogFile extends com.google.api.client.json.GenericJson {

  /**
   * The digest of the log contents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2Digest digest;

  /**
   * This is a hint as to the purpose of the log, and is set to true if the log is human-readable
   * text that can be usefully displayed to a user, and false otherwise. For instance, if a command-
   * line client wishes to print the server logs to the terminal for a failed action, this allows it
   * to avoid displaying a binary file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean humanReadable;

  /**
   * The digest of the log contents.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Digest getDigest() {
    return digest;
  }

  /**
   * The digest of the log contents.
   * @param digest digest or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2LogFile setDigest(BuildBazelRemoteExecutionV2Digest digest) {
    this.digest = digest;
    return this;
  }

  /**
   * This is a hint as to the purpose of the log, and is set to true if the log is human-readable
   * text that can be usefully displayed to a user, and false otherwise. For instance, if a command-
   * line client wishes to print the server logs to the terminal for a failed action, this allows it
   * to avoid displaying a binary file.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHumanReadable() {
    return humanReadable;
  }

  /**
   * This is a hint as to the purpose of the log, and is set to true if the log is human-readable
   * text that can be usefully displayed to a user, and false otherwise. For instance, if a command-
   * line client wishes to print the server logs to the terminal for a failed action, this allows it
   * to avoid displaying a binary file.
   * @param humanReadable humanReadable or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2LogFile setHumanReadable(java.lang.Boolean humanReadable) {
    this.humanReadable = humanReadable;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2LogFile set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2LogFile) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2LogFile clone() {
    return (BuildBazelRemoteExecutionV2LogFile) super.clone();
  }

}
