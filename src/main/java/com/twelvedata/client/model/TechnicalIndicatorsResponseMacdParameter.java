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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Input parameter name. Example values: &lt;code&gt;series_type&lt;/code&gt;, &lt;code&gt;fast_period&lt;/code&gt;, &lt;code&gt;slow_period&lt;/code&gt;, &lt;code&gt;time_period&lt;/code&gt;, &lt;code&gt;signal_period&lt;/code&gt;
 */
@JsonPropertyOrder({
  TechnicalIndicatorsResponseMacdParameter.JSON_PROPERTY_DEFAULT,
  TechnicalIndicatorsResponseMacdParameter.JSON_PROPERTY_MAX_RANGE,
  TechnicalIndicatorsResponseMacdParameter.JSON_PROPERTY_MIN_RANGE,
  TechnicalIndicatorsResponseMacdParameter.JSON_PROPERTY_RANGE,
  TechnicalIndicatorsResponseMacdParameter.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class TechnicalIndicatorsResponseMacdParameter {
  public static final String JSON_PROPERTY_DEFAULT = "default";
  @javax.annotation.Nullable
  private Long _default;

  public static final String JSON_PROPERTY_MAX_RANGE = "max_range";
  @javax.annotation.Nullable
  private Long maxRange;

  public static final String JSON_PROPERTY_MIN_RANGE = "min_range";
  @javax.annotation.Nullable
  private Long minRange;

  public static final String JSON_PROPERTY_RANGE = "range";
  @javax.annotation.Nullable
  private List<String> range = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type;

  public TechnicalIndicatorsResponseMacdParameter() { 
  }

  public TechnicalIndicatorsResponseMacdParameter _default(@javax.annotation.Nullable Long _default) {
    this._default = _default;
    return this;
  }

  /**
   * Specifies parameter value set by default
   * @return _default
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDefault() {
    return _default;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(@javax.annotation.Nullable Long _default) {
    this._default = _default;
  }


  public TechnicalIndicatorsResponseMacdParameter maxRange(@javax.annotation.Nullable Long maxRange) {
    this.maxRange = maxRange;
    return this;
  }

  /**
   * If the parameter has upper bound in order to ensure correct calculation
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


  public TechnicalIndicatorsResponseMacdParameter minRange(@javax.annotation.Nullable Long minRange) {
    this.minRange = minRange;
    return this;
  }

  /**
   * If the parameter has lower bound in order to ensure correct calculation
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


  public TechnicalIndicatorsResponseMacdParameter range(@javax.annotation.Nullable List<String> range) {
    this.range = range;
    return this;
  }

  public TechnicalIndicatorsResponseMacdParameter addRangeItem(String rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<>();
    }
    this.range.add(rangeItem);
    return this;
  }

  /**
   * An array of available parameter values
   * @return range
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRange() {
    return range;
  }


  @JsonProperty(value = JSON_PROPERTY_RANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(@javax.annotation.Nullable List<String> range) {
    this.range = range;
  }


  public TechnicalIndicatorsResponseMacdParameter type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of parameter might be &lt;code&gt;string&lt;/code&gt;, &lt;code&gt;int&lt;/code&gt;, &lt;code&gt;float&lt;/code&gt; or &lt;code&gt;array&lt;/code&gt;
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  /**
   * Return true if this TechnicalIndicatorsResponseMacdParameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalIndicatorsResponseMacdParameter technicalIndicatorsResponseMacdParameter = (TechnicalIndicatorsResponseMacdParameter) o;
    return Objects.equals(this._default, technicalIndicatorsResponseMacdParameter._default) &&
        Objects.equals(this.maxRange, technicalIndicatorsResponseMacdParameter.maxRange) &&
        Objects.equals(this.minRange, technicalIndicatorsResponseMacdParameter.minRange) &&
        Objects.equals(this.range, technicalIndicatorsResponseMacdParameter.range) &&
        Objects.equals(this.type, technicalIndicatorsResponseMacdParameter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, maxRange, minRange, range, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalIndicatorsResponseMacdParameter {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    maxRange: ").append(toIndentedString(maxRange)).append("\n");
    sb.append("    minRange: ").append(toIndentedString(minRange)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `default` to the URL query string
    if (getDefault() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefault%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefault()))));
    }

    // add `max_range` to the URL query string
    if (getMaxRange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smax_range%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxRange()))));
    }

    // add `min_range` to the URL query string
    if (getMinRange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smin_range%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinRange()))));
    }

    // add `range` to the URL query string
    if (getRange() != null) {
      for (int i = 0; i < getRange().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%srange%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getRange().get(i)))));
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    return joiner.toString();
  }
}

