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
 * InlineObject13ValuesInner
 */
@JsonPropertyOrder({
  InlineObject13ValuesInner.JSON_PROPERTY_DATETIME,
  InlineObject13ValuesInner.JSON_PROPERTY_MAVP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject13ValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nullable
  private String datetime;

  public static final String JSON_PROPERTY_MAVP = "mavp";
  @javax.annotation.Nullable
  private String mavp;

  public InlineObject13ValuesInner() { 
  }

  public InlineObject13ValuesInner datetime(@javax.annotation.Nullable String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Get datetime
   * @return datetime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DATETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDatetime() {
    return datetime;
  }


  @JsonProperty(value = JSON_PROPERTY_DATETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatetime(@javax.annotation.Nullable String datetime) {
    this.datetime = datetime;
  }


  public InlineObject13ValuesInner mavp(@javax.annotation.Nullable String mavp) {
    this.mavp = mavp;
    return this;
  }

  /**
   * Get mavp
   * @return mavp
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAVP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMavp() {
    return mavp;
  }


  @JsonProperty(value = JSON_PROPERTY_MAVP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMavp(@javax.annotation.Nullable String mavp) {
    this.mavp = mavp;
  }


  /**
   * Return true if this inline_object_13_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject13ValuesInner inlineObject13ValuesInner = (InlineObject13ValuesInner) o;
    return Objects.equals(this.datetime, inlineObject13ValuesInner.datetime) &&
        Objects.equals(this.mavp, inlineObject13ValuesInner.mavp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, mavp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject13ValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    mavp: ").append(toIndentedString(mavp)).append("\n");
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

    // add `datetime` to the URL query string
    if (getDatetime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdatetime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDatetime()))));
    }

    // add `mavp` to the URL query string
    if (getMavp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smavp%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMavp()))));
    }

    return joiner.toString();
  }
}

