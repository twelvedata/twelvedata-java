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
 * An array of tinting values used for proper indicator coloring
 */
@JsonPropertyOrder({
  TechnicalIndicatorsResponseMacdTinting.JSON_PROPERTY_DISPLAY,
  TechnicalIndicatorsResponseMacdTinting.JSON_PROPERTY_COLOR,
  TechnicalIndicatorsResponseMacdTinting.JSON_PROPERTY_TRANSPARENCY,
  TechnicalIndicatorsResponseMacdTinting.JSON_PROPERTY_LOWER_BOUND,
  TechnicalIndicatorsResponseMacdTinting.JSON_PROPERTY_UPPER_BOUND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class TechnicalIndicatorsResponseMacdTinting {
  public static final String JSON_PROPERTY_DISPLAY = "display";
  @javax.annotation.Nullable
  private String display;

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private String color;

  public static final String JSON_PROPERTY_TRANSPARENCY = "transparency";
  @javax.annotation.Nullable
  private Double transparency;

  public static final String JSON_PROPERTY_LOWER_BOUND = "lower_bound";
  @javax.annotation.Nullable
  private Object lowerBound;

  public static final String JSON_PROPERTY_UPPER_BOUND = "upper_bound";
  @javax.annotation.Nullable
  private Object upperBound;

  public TechnicalIndicatorsResponseMacdTinting() { 
  }

  public TechnicalIndicatorsResponseMacdTinting display(@javax.annotation.Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * How the tinting should be rendered
   * @return display
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DISPLAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplay() {
    return display;
  }


  @JsonProperty(value = JSON_PROPERTY_DISPLAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplay(@javax.annotation.Nullable String display) {
    this.display = display;
  }


  public TechnicalIndicatorsResponseMacdTinting color(@javax.annotation.Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * Hex color code for the tinting
   * @return color
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColor() {
    return color;
  }


  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(@javax.annotation.Nullable String color) {
    this.color = color;
  }


  public TechnicalIndicatorsResponseMacdTinting transparency(@javax.annotation.Nullable Double transparency) {
    this.transparency = transparency;
    return this;
  }

  /**
   * Transparency level, float value from &lt;code&gt;0&lt;/code&gt; to &lt;code&gt;1&lt;/code&gt;
   * @return transparency
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPARENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTransparency() {
    return transparency;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPARENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransparency(@javax.annotation.Nullable Double transparency) {
    this.transparency = transparency;
  }


  public TechnicalIndicatorsResponseMacdTinting lowerBound(@javax.annotation.Nullable Object lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

  /**
   * Lower bound of tinting, can be a number or a return parameter name
   * @return lowerBound
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOWER_BOUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getLowerBound() {
    return lowerBound;
  }


  @JsonProperty(value = JSON_PROPERTY_LOWER_BOUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowerBound(@javax.annotation.Nullable Object lowerBound) {
    this.lowerBound = lowerBound;
  }


  public TechnicalIndicatorsResponseMacdTinting upperBound(@javax.annotation.Nullable Object upperBound) {
    this.upperBound = upperBound;
    return this;
  }

  /**
   * Upper bound of tinting, can be a number or a return parameter name
   * @return upperBound
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UPPER_BOUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getUpperBound() {
    return upperBound;
  }


  @JsonProperty(value = JSON_PROPERTY_UPPER_BOUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpperBound(@javax.annotation.Nullable Object upperBound) {
    this.upperBound = upperBound;
  }


  /**
   * Return true if this TechnicalIndicatorsResponseMacdTinting object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalIndicatorsResponseMacdTinting technicalIndicatorsResponseMacdTinting = (TechnicalIndicatorsResponseMacdTinting) o;
    return Objects.equals(this.display, technicalIndicatorsResponseMacdTinting.display) &&
        Objects.equals(this.color, technicalIndicatorsResponseMacdTinting.color) &&
        Objects.equals(this.transparency, technicalIndicatorsResponseMacdTinting.transparency) &&
        Objects.equals(this.lowerBound, technicalIndicatorsResponseMacdTinting.lowerBound) &&
        Objects.equals(this.upperBound, technicalIndicatorsResponseMacdTinting.upperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, color, transparency, lowerBound, upperBound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalIndicatorsResponseMacdTinting {\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    transparency: ").append(toIndentedString(transparency)).append("\n");
    sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
    sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
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

    // add `display` to the URL query string
    if (getDisplay() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdisplay%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDisplay()))));
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scolor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getColor()))));
    }

    // add `transparency` to the URL query string
    if (getTransparency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransparency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransparency()))));
    }

    // add `lower_bound` to the URL query string
    if (getLowerBound() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slower_bound%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLowerBound()))));
    }

    // add `upper_bound` to the URL query string
    if (getUpperBound() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supper_bound%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpperBound()))));
    }

    return joiner.toString();
  }
}

