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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * Specifies the day part targeting criteria.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DayPartTargeting extends com.google.api.client.json.GenericJson {

  /**
   * A list of day part targeting criterion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DayPart> dayParts;

  static {
    // hack to force ProGuard to consider DayPart used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DayPart.class);
  }

  /**
   * The timezone to use for interpreting the day part targeting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZoneType;

  /**
   * A list of day part targeting criterion.
   * @return value or {@code null} for none
   */
  public java.util.List<DayPart> getDayParts() {
    return dayParts;
  }

  /**
   * A list of day part targeting criterion.
   * @param dayParts dayParts or {@code null} for none
   */
  public DayPartTargeting setDayParts(java.util.List<DayPart> dayParts) {
    this.dayParts = dayParts;
    return this;
  }

  /**
   * The timezone to use for interpreting the day part targeting.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZoneType() {
    return timeZoneType;
  }

  /**
   * The timezone to use for interpreting the day part targeting.
   * @param timeZoneType timeZoneType or {@code null} for none
   */
  public DayPartTargeting setTimeZoneType(java.lang.String timeZoneType) {
    this.timeZoneType = timeZoneType;
    return this;
  }

  @Override
  public DayPartTargeting set(String fieldName, Object value) {
    return (DayPartTargeting) super.set(fieldName, value);
  }

  @Override
  public DayPartTargeting clone() {
    return (DayPartTargeting) super.clone();
  }

}
