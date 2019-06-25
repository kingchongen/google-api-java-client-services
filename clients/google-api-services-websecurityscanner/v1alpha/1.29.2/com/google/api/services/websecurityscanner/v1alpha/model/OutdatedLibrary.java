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

package com.google.api.services.websecurityscanner.v1alpha.model;

/**
 * Information reported for an outdated library.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Web Security Scanner API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OutdatedLibrary extends com.google.api.client.json.GenericJson {

  /**
   * URLs to learn more information about the vulnerabilities in the library.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> learnMoreUrls;

  /**
   * The name of the outdated library.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String libraryName;

  /**
   * The version number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * URLs to learn more information about the vulnerabilities in the library.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLearnMoreUrls() {
    return learnMoreUrls;
  }

  /**
   * URLs to learn more information about the vulnerabilities in the library.
   * @param learnMoreUrls learnMoreUrls or {@code null} for none
   */
  public OutdatedLibrary setLearnMoreUrls(java.util.List<java.lang.String> learnMoreUrls) {
    this.learnMoreUrls = learnMoreUrls;
    return this;
  }

  /**
   * The name of the outdated library.
   * @return value or {@code null} for none
   */
  public java.lang.String getLibraryName() {
    return libraryName;
  }

  /**
   * The name of the outdated library.
   * @param libraryName libraryName or {@code null} for none
   */
  public OutdatedLibrary setLibraryName(java.lang.String libraryName) {
    this.libraryName = libraryName;
    return this;
  }

  /**
   * The version number.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version number.
   * @param version version or {@code null} for none
   */
  public OutdatedLibrary setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public OutdatedLibrary set(String fieldName, Object value) {
    return (OutdatedLibrary) super.set(fieldName, value);
  }

  @Override
  public OutdatedLibrary clone() {
    return (OutdatedLibrary) super.clone();
  }

}
