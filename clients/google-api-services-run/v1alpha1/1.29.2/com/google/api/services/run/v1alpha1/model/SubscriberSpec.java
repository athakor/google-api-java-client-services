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

package com.google.api.services.run.v1alpha1.model;

/**
 * Model definition for SubscriberSpec.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubscriberSpec extends com.google.api.client.json.GenericJson {

  /**
   * Reference to an object that will be used to find the target endpoint, which should implement
   * the Addressable duck type. For example, this could be a reference to a Route resource or a
   * Knative Service resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectReference ref;

  /**
   * Reference to a 'known' endpoint where no resolving is done. http://k8s-service for example
   * http://myexternalhandler.example.com/foo/bar
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Reference to an object that will be used to find the target endpoint, which should implement
   * the Addressable duck type. For example, this could be a reference to a Route resource or a
   * Knative Service resource.
   * @return value or {@code null} for none
   */
  public ObjectReference getRef() {
    return ref;
  }

  /**
   * Reference to an object that will be used to find the target endpoint, which should implement
   * the Addressable duck type. For example, this could be a reference to a Route resource or a
   * Knative Service resource.
   * @param ref ref or {@code null} for none
   */
  public SubscriberSpec setRef(ObjectReference ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Reference to a 'known' endpoint where no resolving is done. http://k8s-service for example
   * http://myexternalhandler.example.com/foo/bar
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Reference to a 'known' endpoint where no resolving is done. http://k8s-service for example
   * http://myexternalhandler.example.com/foo/bar
   * @param uri uri or {@code null} for none
   */
  public SubscriberSpec setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public SubscriberSpec set(String fieldName, Object value) {
    return (SubscriberSpec) super.set(fieldName, value);
  }

  @Override
  public SubscriberSpec clone() {
    return (SubscriberSpec) super.clone();
  }

}
