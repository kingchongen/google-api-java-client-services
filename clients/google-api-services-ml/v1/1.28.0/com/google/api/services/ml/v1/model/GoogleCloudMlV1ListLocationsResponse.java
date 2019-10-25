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

package com.google.api.services.ml.v1.model;

/**
 * Model definition for GoogleCloudMlV1ListLocationsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1ListLocationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Locations where at least one type of CMLE capability is available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudMlV1Location> locations;

  /**
   * Optional. Pass this token as the `page_token` field of the request for a subsequent call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Locations where at least one type of CMLE capability is available.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudMlV1Location> getLocations() {
    return locations;
  }

  /**
   * Locations where at least one type of CMLE capability is available.
   * @param locations locations or {@code null} for none
   */
  public GoogleCloudMlV1ListLocationsResponse setLocations(java.util.List<GoogleCloudMlV1Location> locations) {
    this.locations = locations;
    return this;
  }

  /**
   * Optional. Pass this token as the `page_token` field of the request for a subsequent call.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Optional. Pass this token as the `page_token` field of the request for a subsequent call.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudMlV1ListLocationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudMlV1ListLocationsResponse set(String fieldName, Object value) {
    return (GoogleCloudMlV1ListLocationsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1ListLocationsResponse clone() {
    return (GoogleCloudMlV1ListLocationsResponse) super.clone();
  }

}
