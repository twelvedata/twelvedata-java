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
import com.twelvedata.client.model.ExchangeScheduleSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * ExchangeScheduleResponseItem represents details of an exchange schedule
 */
@JsonPropertyOrder({
  ExchangeScheduleResponseItem.JSON_PROPERTY_TITLE,
  ExchangeScheduleResponseItem.JSON_PROPERTY_NAME,
  ExchangeScheduleResponseItem.JSON_PROPERTY_CODE,
  ExchangeScheduleResponseItem.JSON_PROPERTY_COUNTRY,
  ExchangeScheduleResponseItem.JSON_PROPERTY_TIME_ZONE,
  ExchangeScheduleResponseItem.JSON_PROPERTY_SESSIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ExchangeScheduleResponseItem {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nonnull
  private String code;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  @javax.annotation.Nonnull
  private String timeZone;

  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  @javax.annotation.Nonnull
  private List<ExchangeScheduleSession> sessions = new ArrayList<>();

  public ExchangeScheduleResponseItem() { 
  }

  public ExchangeScheduleResponseItem title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Official name of exchange
   * @return title
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public ExchangeScheduleResponseItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of exchange
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ExchangeScheduleResponseItem code(@javax.annotation.Nonnull String code) {
    this.code = code;
    return this;
  }

  /**
   * Market identifier code (MIC) under ISO 10383 standard
   * @return code
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCode() {
    return code;
  }


  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(@javax.annotation.Nonnull String code) {
    this.code = code;
  }


  public ExchangeScheduleResponseItem country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country to which stock exchange belongs to
   * @return country
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }


  public ExchangeScheduleResponseItem timeZone(@javax.annotation.Nonnull String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Time zone where exchange is located
   * @return timeZone
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIME_ZONE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_ZONE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeZone(@javax.annotation.Nonnull String timeZone) {
    this.timeZone = timeZone;
  }


  public ExchangeScheduleResponseItem sessions(@javax.annotation.Nonnull List<ExchangeScheduleSession> sessions) {
    this.sessions = sessions;
    return this;
  }

  public ExchangeScheduleResponseItem addSessionsItem(ExchangeScheduleSession sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

  /**
   * Exchange trading hours
   * @return sessions
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SESSIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExchangeScheduleSession> getSessions() {
    return sessions;
  }


  @JsonProperty(value = JSON_PROPERTY_SESSIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessions(@javax.annotation.Nonnull List<ExchangeScheduleSession> sessions) {
    this.sessions = sessions;
  }


  /**
   * Return true if this ExchangeScheduleResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeScheduleResponseItem exchangeScheduleResponseItem = (ExchangeScheduleResponseItem) o;
    return Objects.equals(this.title, exchangeScheduleResponseItem.title) &&
        Objects.equals(this.name, exchangeScheduleResponseItem.name) &&
        Objects.equals(this.code, exchangeScheduleResponseItem.code) &&
        Objects.equals(this.country, exchangeScheduleResponseItem.country) &&
        Objects.equals(this.timeZone, exchangeScheduleResponseItem.timeZone) &&
        Objects.equals(this.sessions, exchangeScheduleResponseItem.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, name, code, country, timeZone, sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeScheduleResponseItem {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `code` to the URL query string
    if (getCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCode()))));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `time_zone` to the URL query string
    if (getTimeZone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_zone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimeZone()))));
    }

    // add `sessions` to the URL query string
    if (getSessions() != null) {
      for (int i = 0; i < getSessions().size(); i++) {
        if (getSessions().get(i) != null) {
          joiner.add(getSessions().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%ssessions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

