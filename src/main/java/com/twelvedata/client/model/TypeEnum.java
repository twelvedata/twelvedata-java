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
 * Gets or Sets TypeEnum
 */
public enum TypeEnum {
  
  AMERICAN_DEPOSITARY_RECEIPT("American Depositary Receipt"),
  
  BOND("Bond"),
  
  BOND_FUND("Bond Fund"),
  
  CLOSED_END_FUND("Closed-end Fund"),
  
  COMMON_STOCK("Common Stock"),
  
  DEPOSITARY_RECEIPT("Depositary Receipt"),
  
  DIGITAL_CURRENCY("Digital Currency"),
  
  ETF("ETF"),
  
  EXCHANGE_TRADED_NOTE("Exchange-Traded Note"),
  
  GLOBAL_DEPOSITARY_RECEIPT("Global Depositary Receipt"),
  
  LIMITED_PARTNERSHIP("Limited Partnership"),
  
  MUTUAL_FUND("Mutual Fund"),
  
  PHYSICAL_CURRENCY("Physical Currency"),
  
  PREFERRED_STOCK("Preferred Stock"),
  
  REIT("REIT"),
  
  RIGHT("Right"),
  
  STRUCTURED_PRODUCT("Structured Product"),
  
  TRUST("Trust"),
  
  UNIT("Unit"),
  
  WARRANT("Warrant");

  private String value;

  TypeEnum(String value) {
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
  public static TypeEnum fromValue(String value) {
    for (TypeEnum b : TypeEnum.values()) {
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

