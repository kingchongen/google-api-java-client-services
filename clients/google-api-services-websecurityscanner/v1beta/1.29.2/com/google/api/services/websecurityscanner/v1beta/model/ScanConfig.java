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

package com.google.api.services.websecurityscanner.v1beta.model;

/**
 * A ScanConfig resource contains the configurations to launch a scan.
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
public final class ScanConfig extends com.google.api.client.json.GenericJson {

  /**
   * The authentication configuration. If specified, service will use the authentication
   * configuration during scanning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Authentication authentication;

  /**
   * The blacklist URL patterns as described in https://cloud.google.com/security-scanner/docs
   * /excluded-urls
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> blacklistPatterns;

  /**
   * Required. The user provided display name of the ScanConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Controls export of scan configurations and results to Cloud Security Command Center.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exportToSecurityCommandCenter;

  /**
   * Latest ScanRun if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ScanRun latestRun;

  /**
   * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is
   * unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20]
   * range will be rejected with INVALID_ARGUMENT error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxQps;

  /**
   * The resource name of the ScanConfig. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the
   * system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The risk level selected for the scan
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String riskLevel;

  /**
   * The schedule of the ScanConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Schedule schedule;

  /**
   * Required. The starting URLs from which the scanner finds site pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> startingUrls;

  /**
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetPlatforms;

  /**
   * The user agent used during scanning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgent;

  /**
   * The authentication configuration. If specified, service will use the authentication
   * configuration during scanning.
   * @return value or {@code null} for none
   */
  public Authentication getAuthentication() {
    return authentication;
  }

  /**
   * The authentication configuration. If specified, service will use the authentication
   * configuration during scanning.
   * @param authentication authentication or {@code null} for none
   */
  public ScanConfig setAuthentication(Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * The blacklist URL patterns as described in https://cloud.google.com/security-scanner/docs
   * /excluded-urls
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBlacklistPatterns() {
    return blacklistPatterns;
  }

  /**
   * The blacklist URL patterns as described in https://cloud.google.com/security-scanner/docs
   * /excluded-urls
   * @param blacklistPatterns blacklistPatterns or {@code null} for none
   */
  public ScanConfig setBlacklistPatterns(java.util.List<java.lang.String> blacklistPatterns) {
    this.blacklistPatterns = blacklistPatterns;
    return this;
  }

  /**
   * Required. The user provided display name of the ScanConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The user provided display name of the ScanConfig.
   * @param displayName displayName or {@code null} for none
   */
  public ScanConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Controls export of scan configurations and results to Cloud Security Command Center.
   * @return value or {@code null} for none
   */
  public java.lang.String getExportToSecurityCommandCenter() {
    return exportToSecurityCommandCenter;
  }

  /**
   * Controls export of scan configurations and results to Cloud Security Command Center.
   * @param exportToSecurityCommandCenter exportToSecurityCommandCenter or {@code null} for none
   */
  public ScanConfig setExportToSecurityCommandCenter(java.lang.String exportToSecurityCommandCenter) {
    this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
    return this;
  }

  /**
   * Latest ScanRun if available.
   * @return value or {@code null} for none
   */
  public ScanRun getLatestRun() {
    return latestRun;
  }

  /**
   * Latest ScanRun if available.
   * @param latestRun latestRun or {@code null} for none
   */
  public ScanConfig setLatestRun(ScanRun latestRun) {
    this.latestRun = latestRun;
    return this;
  }

  /**
   * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is
   * unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20]
   * range will be rejected with INVALID_ARGUMENT error.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxQps() {
    return maxQps;
  }

  /**
   * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is
   * unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20]
   * range will be rejected with INVALID_ARGUMENT error.
   * @param maxQps maxQps or {@code null} for none
   */
  public ScanConfig setMaxQps(java.lang.Integer maxQps) {
    this.maxQps = maxQps;
    return this;
  }

  /**
   * The resource name of the ScanConfig. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the
   * system.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the ScanConfig. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the
   * system.
   * @param name name or {@code null} for none
   */
  public ScanConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The risk level selected for the scan
   * @return value or {@code null} for none
   */
  public java.lang.String getRiskLevel() {
    return riskLevel;
  }

  /**
   * The risk level selected for the scan
   * @param riskLevel riskLevel or {@code null} for none
   */
  public ScanConfig setRiskLevel(java.lang.String riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

  /**
   * The schedule of the ScanConfig.
   * @return value or {@code null} for none
   */
  public Schedule getSchedule() {
    return schedule;
  }

  /**
   * The schedule of the ScanConfig.
   * @param schedule schedule or {@code null} for none
   */
  public ScanConfig setSchedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Required. The starting URLs from which the scanner finds site pages.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStartingUrls() {
    return startingUrls;
  }

  /**
   * Required. The starting URLs from which the scanner finds site pages.
   * @param startingUrls startingUrls or {@code null} for none
   */
  public ScanConfig setStartingUrls(java.util.List<java.lang.String> startingUrls) {
    this.startingUrls = startingUrls;
    return this;
  }

  /**
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetPlatforms() {
    return targetPlatforms;
  }

  /**
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
   * @param targetPlatforms targetPlatforms or {@code null} for none
   */
  public ScanConfig setTargetPlatforms(java.util.List<java.lang.String> targetPlatforms) {
    this.targetPlatforms = targetPlatforms;
    return this;
  }

  /**
   * The user agent used during scanning.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * The user agent used during scanning.
   * @param userAgent userAgent or {@code null} for none
   */
  public ScanConfig setUserAgent(java.lang.String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  @Override
  public ScanConfig set(String fieldName, Object value) {
    return (ScanConfig) super.set(fieldName, value);
  }

  @Override
  public ScanConfig clone() {
    return (ScanConfig) super.clone();
  }

}
