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

package com.google.api.services.osconfig.v1.model;

/**
 * Yum patching is performed by executing `yum update`. Additional options can be set to control how
 * this is executed. Note that not all settings are supported on all platforms.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class YumSettings extends com.google.api.client.json.GenericJson {

  /**
   * List of packages to exclude from update. These packages are excluded by using the yum
   * `--exclude` flag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludes;

  /**
   * An exclusive list of packages to be updated. These are the only packages that will be updated.
   * If these packages are not installed, they will be ignored. This field must not be specified
   * with any other patch configuration fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exclusivePackages;

  /**
   * Will cause patch to run `yum update-minimal` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean minimal;

  /**
   * Adds the `--security` flag to `yum update`. Not supported on all platforms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean security;

  /**
   * List of packages to exclude from update. These packages are excluded by using the yum
   * `--exclude` flag.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludes() {
    return excludes;
  }

  /**
   * List of packages to exclude from update. These packages are excluded by using the yum
   * `--exclude` flag.
   * @param excludes excludes or {@code null} for none
   */
  public YumSettings setExcludes(java.util.List<java.lang.String> excludes) {
    this.excludes = excludes;
    return this;
  }

  /**
   * An exclusive list of packages to be updated. These are the only packages that will be updated.
   * If these packages are not installed, they will be ignored. This field must not be specified
   * with any other patch configuration fields.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExclusivePackages() {
    return exclusivePackages;
  }

  /**
   * An exclusive list of packages to be updated. These are the only packages that will be updated.
   * If these packages are not installed, they will be ignored. This field must not be specified
   * with any other patch configuration fields.
   * @param exclusivePackages exclusivePackages or {@code null} for none
   */
  public YumSettings setExclusivePackages(java.util.List<java.lang.String> exclusivePackages) {
    this.exclusivePackages = exclusivePackages;
    return this;
  }

  /**
   * Will cause patch to run `yum update-minimal` instead.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMinimal() {
    return minimal;
  }

  /**
   * Will cause patch to run `yum update-minimal` instead.
   * @param minimal minimal or {@code null} for none
   */
  public YumSettings setMinimal(java.lang.Boolean minimal) {
    this.minimal = minimal;
    return this;
  }

  /**
   * Adds the `--security` flag to `yum update`. Not supported on all platforms.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSecurity() {
    return security;
  }

  /**
   * Adds the `--security` flag to `yum update`. Not supported on all platforms.
   * @param security security or {@code null} for none
   */
  public YumSettings setSecurity(java.lang.Boolean security) {
    this.security = security;
    return this;
  }

  @Override
  public YumSettings set(String fieldName, Object value) {
    return (YumSettings) super.set(fieldName, value);
  }

  @Override
  public YumSettings clone() {
    return (YumSettings) super.clone();
  }

}
