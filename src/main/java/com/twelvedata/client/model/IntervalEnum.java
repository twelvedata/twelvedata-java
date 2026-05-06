/*
 * Twelve Data API client for Java
 *
 * NOTE: This code is auto generated, please do not edit it manually.
 */


package com.twelvedata.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets IntervalEnum
 */
public enum IntervalEnum {
  
  _1MIN("1min"),
  
  _5MIN("5min"),
  
  _15MIN("15min"),
  
  _30MIN("30min"),
  
  _45MIN("45min"),
  
  _1H("1h"),
  
  _2H("2h"),
  
  _4H("4h"),
  
  _8H("8h"),
  
  _1DAY("1day"),
  
  _1WEEK("1week"),
  
  _1MONTH("1month");

  private String value;

  IntervalEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IntervalEnum fromValue(String value) {
    for (IntervalEnum b : IntervalEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format(java.util.Locale.ROOT, "%s=%s", prefix, this.toString());
  }

}

