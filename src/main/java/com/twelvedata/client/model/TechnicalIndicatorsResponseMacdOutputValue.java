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
 * Output parameter name. Example values: &lt;code&gt;ad&lt;/code&gt;, &lt;code&gt;add&lt;/code&gt;, &lt;code&gt;adxr&lt;/code&gt;, &lt;code&gt;aroonosc&lt;/code&gt;,  &lt;code&gt;macd&lt;/code&gt;, &lt;code&gt;macd_signal&lt;/code&gt;, &lt;code&gt;macd_hist&lt;/code&gt;, etc
 */
@JsonPropertyOrder({
  TechnicalIndicatorsResponseMacdOutputValue.JSON_PROPERTY_DEFAULT_COLOR,
  TechnicalIndicatorsResponseMacdOutputValue.JSON_PROPERTY_DISPLAY,
  TechnicalIndicatorsResponseMacdOutputValue.JSON_PROPERTY_MIN_RANGE,
  TechnicalIndicatorsResponseMacdOutputValue.JSON_PROPERTY_MAX_RANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class TechnicalIndicatorsResponseMacdOutputValue {
  public static final String JSON_PROPERTY_DEFAULT_COLOR = "default_color";
  @javax.annotation.Nullable
  private String defaultColor;

  /**
   * How output value should be rendered
   */
  public enum DisplayEnum {
    LINE(String.valueOf("line")),
    
    HISTOGRAM(String.valueOf("histogram")),
    
    CANDLE(String.valueOf("candle")),
    
    POINTS(String.valueOf("points"));

    private String value;

    DisplayEnum(String value) {
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
    public static DisplayEnum fromValue(String value) {
      for (DisplayEnum b : DisplayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DISPLAY = "display";
  @javax.annotation.Nullable
  private DisplayEnum display;

  public static final String JSON_PROPERTY_MIN_RANGE = "min_range";
  @javax.annotation.Nullable
  private Long minRange;

  public static final String JSON_PROPERTY_MAX_RANGE = "max_range";
  @javax.annotation.Nullable
  private Long maxRange;

  public TechnicalIndicatorsResponseMacdOutputValue() { 
  }

  public TechnicalIndicatorsResponseMacdOutputValue defaultColor(@javax.annotation.Nullable String defaultColor) {
    this.defaultColor = defaultColor;
    return this;
  }

  /**
   * Suggested color for displaying returns hex color code
   * @return defaultColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultColor() {
    return defaultColor;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultColor(@javax.annotation.Nullable String defaultColor) {
    this.defaultColor = defaultColor;
  }


  public TechnicalIndicatorsResponseMacdOutputValue display(@javax.annotation.Nullable DisplayEnum display) {
    this.display = display;
    return this;
  }

  /**
   * How output value should be rendered
   * @return display
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DISPLAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DisplayEnum getDisplay() {
    return display;
  }


  @JsonProperty(value = JSON_PROPERTY_DISPLAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplay(@javax.annotation.Nullable DisplayEnum display) {
    this.display = display;
  }


  public TechnicalIndicatorsResponseMacdOutputValue minRange(@javax.annotation.Nullable Long minRange) {
    this.minRange = minRange;
    return this;
  }

  /**
   * If output value has minimum bound
   * @return minRange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_RANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinRange() {
    return minRange;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_RANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinRange(@javax.annotation.Nullable Long minRange) {
    this.minRange = minRange;
  }


  public TechnicalIndicatorsResponseMacdOutputValue maxRange(@javax.annotation.Nullable Long maxRange) {
    this.maxRange = maxRange;
    return this;
  }

  /**
   * If output value has maximum bound
   * @return maxRange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_RANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxRange() {
    return maxRange;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_RANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRange(@javax.annotation.Nullable Long maxRange) {
    this.maxRange = maxRange;
  }


  /**
   * Return true if this TechnicalIndicatorsResponseMacdOutputValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalIndicatorsResponseMacdOutputValue technicalIndicatorsResponseMacdOutputValue = (TechnicalIndicatorsResponseMacdOutputValue) o;
    return Objects.equals(this.defaultColor, technicalIndicatorsResponseMacdOutputValue.defaultColor) &&
        Objects.equals(this.display, technicalIndicatorsResponseMacdOutputValue.display) &&
        Objects.equals(this.minRange, technicalIndicatorsResponseMacdOutputValue.minRange) &&
        Objects.equals(this.maxRange, technicalIndicatorsResponseMacdOutputValue.maxRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultColor, display, minRange, maxRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalIndicatorsResponseMacdOutputValue {\n");
    sb.append("    defaultColor: ").append(toIndentedString(defaultColor)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    minRange: ").append(toIndentedString(minRange)).append("\n");
    sb.append("    maxRange: ").append(toIndentedString(maxRange)).append("\n");
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

    // add `default_color` to the URL query string
    if (getDefaultColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefault_color%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultColor()))));
    }

    // add `display` to the URL query string
    if (getDisplay() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdisplay%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDisplay()))));
    }

    // add `min_range` to the URL query string
    if (getMinRange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smin_range%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinRange()))));
    }

    // add `max_range` to the URL query string
    if (getMaxRange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smax_range%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxRange()))));
    }

    return joiner.toString();
  }
}

