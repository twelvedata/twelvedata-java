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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * ExchangeScheduleSession represents a trading session
 */
@JsonPropertyOrder({
  ExchangeScheduleSession.JSON_PROPERTY_OPEN_TIME,
  ExchangeScheduleSession.JSON_PROPERTY_CLOSE_TIME,
  ExchangeScheduleSession.JSON_PROPERTY_SESSION_NAME,
  ExchangeScheduleSession.JSON_PROPERTY_SESSION_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ExchangeScheduleSession {
  public static final String JSON_PROPERTY_OPEN_TIME = "open_time";
  @javax.annotation.Nonnull
  private String openTime;

  public static final String JSON_PROPERTY_CLOSE_TIME = "close_time";
  @javax.annotation.Nonnull
  private String closeTime;

  public static final String JSON_PROPERTY_SESSION_NAME = "session_name";
  @javax.annotation.Nonnull
  private String sessionName;

  public static final String JSON_PROPERTY_SESSION_TYPE = "session_type";
  @javax.annotation.Nonnull
  private String sessionType;

  public ExchangeScheduleSession() { 
  }

  public ExchangeScheduleSession openTime(@javax.annotation.Nonnull String openTime) {
    this.openTime = openTime;
    return this;
  }

  /**
   * Opening time of the session
   * @return openTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_OPEN_TIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOpenTime() {
    return openTime;
  }


  @JsonProperty(value = JSON_PROPERTY_OPEN_TIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenTime(@javax.annotation.Nonnull String openTime) {
    this.openTime = openTime;
  }


  public ExchangeScheduleSession closeTime(@javax.annotation.Nonnull String closeTime) {
    this.closeTime = closeTime;
    return this;
  }

  /**
   * Closing time of the session
   * @return closeTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CLOSE_TIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCloseTime() {
    return closeTime;
  }


  @JsonProperty(value = JSON_PROPERTY_CLOSE_TIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloseTime(@javax.annotation.Nonnull String closeTime) {
    this.closeTime = closeTime;
  }


  public ExchangeScheduleSession sessionName(@javax.annotation.Nonnull String sessionName) {
    this.sessionName = sessionName;
    return this;
  }

  /**
   * Name of the session
   * @return sessionName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SESSION_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSessionName() {
    return sessionName;
  }


  @JsonProperty(value = JSON_PROPERTY_SESSION_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionName(@javax.annotation.Nonnull String sessionName) {
    this.sessionName = sessionName;
  }


  public ExchangeScheduleSession sessionType(@javax.annotation.Nonnull String sessionType) {
    this.sessionType = sessionType;
    return this;
  }

  /**
   * Type of the session
   * @return sessionType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SESSION_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSessionType() {
    return sessionType;
  }


  @JsonProperty(value = JSON_PROPERTY_SESSION_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionType(@javax.annotation.Nonnull String sessionType) {
    this.sessionType = sessionType;
  }


  /**
   * Return true if this ExchangeScheduleSession object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeScheduleSession exchangeScheduleSession = (ExchangeScheduleSession) o;
    return Objects.equals(this.openTime, exchangeScheduleSession.openTime) &&
        Objects.equals(this.closeTime, exchangeScheduleSession.closeTime) &&
        Objects.equals(this.sessionName, exchangeScheduleSession.sessionName) &&
        Objects.equals(this.sessionType, exchangeScheduleSession.sessionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openTime, closeTime, sessionName, sessionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeScheduleSession {\n");
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
    sb.append("    sessionType: ").append(toIndentedString(sessionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `open_time` to the URL query string
    if (getOpenTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sopen_time%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOpenTime()))));
    }

    // add `close_time` to the URL query string
    if (getCloseTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclose_time%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCloseTime()))));
    }

    // add `session_name` to the URL query string
    if (getSessionName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssession_name%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSessionName()))));
    }

    // add `session_type` to the URL query string
    if (getSessionType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssession_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSessionType()))));
    }

    return joiner.toString();
  }
}

