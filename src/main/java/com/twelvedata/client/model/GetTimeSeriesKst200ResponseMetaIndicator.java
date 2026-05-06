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
 * Technical indicator information
 */
@JsonPropertyOrder({
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_ROC_PERIOD1,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_ROC_PERIOD2,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_ROC_PERIOD3,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_ROC_PERIOD4,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_SMA_PERIOD1,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_SMA_PERIOD2,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_SMA_PERIOD3,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_SMA_PERIOD4,
  GetTimeSeriesKst200ResponseMetaIndicator.JSON_PROPERTY_SIGNAL_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesKst200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_ROC_PERIOD1 = "roc_period_1";
  @javax.annotation.Nonnull
  private Long rocPeriod1;

  public static final String JSON_PROPERTY_ROC_PERIOD2 = "roc_period_2";
  @javax.annotation.Nonnull
  private Long rocPeriod2;

  public static final String JSON_PROPERTY_ROC_PERIOD3 = "roc_period_3";
  @javax.annotation.Nonnull
  private Long rocPeriod3;

  public static final String JSON_PROPERTY_ROC_PERIOD4 = "roc_period_4";
  @javax.annotation.Nonnull
  private Long rocPeriod4;

  public static final String JSON_PROPERTY_SMA_PERIOD1 = "sma_period_1";
  @javax.annotation.Nonnull
  private Long smaPeriod1;

  public static final String JSON_PROPERTY_SMA_PERIOD2 = "sma_period_2";
  @javax.annotation.Nonnull
  private Long smaPeriod2;

  public static final String JSON_PROPERTY_SMA_PERIOD3 = "sma_period_3";
  @javax.annotation.Nonnull
  private Long smaPeriod3;

  public static final String JSON_PROPERTY_SMA_PERIOD4 = "sma_period_4";
  @javax.annotation.Nonnull
  private Long smaPeriod4;

  public static final String JSON_PROPERTY_SIGNAL_PERIOD = "signal_period";
  @javax.annotation.Nonnull
  private Long signalPeriod;

  public GetTimeSeriesKst200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesKst200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the technical indicator
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


  public GetTimeSeriesKst200ResponseMetaIndicator rocPeriod1(@javax.annotation.Nonnull Long rocPeriod1) {
    this.rocPeriod1 = rocPeriod1;
    return this;
  }

  /**
   * The time period for the first Rate of Change calculation
   * @return rocPeriod1
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROC_PERIOD1, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRocPeriod1() {
    return rocPeriod1;
  }


  @JsonProperty(value = JSON_PROPERTY_ROC_PERIOD1, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRocPeriod1(@javax.annotation.Nonnull Long rocPeriod1) {
    this.rocPeriod1 = rocPeriod1;
  }


  public GetTimeSeriesKst200ResponseMetaIndicator rocPeriod2(@javax.annotation.Nonnull Long rocPeriod2) {
    this.rocPeriod2 = rocPeriod2;
    return this;
  }

  /**
   * The time period for the second Rate of Change calculation
   * @return rocPeriod2
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROC_PERIOD2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRocPeriod2() {
    return rocPeriod2;
  }


  @JsonProperty(value = JSON_PROPERTY_ROC_PERIOD2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRocPeriod2(@javax.annotation.Nonnull Long rocPeriod2) {
    this.rocPeriod2 = rocPeriod2;
  }


  public GetTimeSeriesKst200ResponseMetaIndicator rocPeriod3(@javax.annotation.Nonnull Long rocPeriod3) {
    this.rocPeriod3 = rocPeriod3;
    return this;
  }

  /**
   * The time period for the third Rate of Change calculation
   * @return rocPeriod3
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROC_PERIOD3, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRocPeriod3() {
    return rocPeriod3;
  }


  @JsonProperty(value = JSON_PROPERTY_ROC_PERIOD3, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRocPeriod3(@javax.annotation.Nonnull Long rocPeriod3) {
    this.rocPeriod3 = rocPeriod3;
  }


  public GetTimeSeriesKst200ResponseMetaIndicator rocPeriod4(@javax.annotation.Nonnull Long rocPeriod4) {
    this.rocPeriod4 = rocPeriod4;
    return this;
  }

  /**
   * The time period for the forth Rate of Change calculation
   * @return rocPeriod4
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROC_PERIOD4, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRocPeriod4() {
    return rocPeriod4;
  }


  @JsonProperty(value = JSON_PROPERTY_ROC_PERIOD4, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRocPeriod4(@javax.annotation.Nonnull Long rocPeriod4) {
    this.rocPeriod4 = rocPeriod4;
  }


  public GetTimeSeriesKst200ResponseMetaIndicator smaPeriod1(@javax.annotation.Nonnull Long smaPeriod1) {
    this.smaPeriod1 = smaPeriod1;
    return this;
  }

  /**
   * The time period for the first Simple Moving Average
   * @return smaPeriod1
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SMA_PERIOD1, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSmaPeriod1() {
    return smaPeriod1;
  }


  @JsonProperty(value = JSON_PROPERTY_SMA_PERIOD1, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSmaPeriod1(@javax.annotation.Nonnull Long smaPeriod1) {
    this.smaPeriod1 = smaPeriod1;
  }


  public GetTimeSeriesKst200ResponseMetaIndicator smaPeriod2(@javax.annotation.Nonnull Long smaPeriod2) {
    this.smaPeriod2 = smaPeriod2;
    return this;
  }

  /**
   * The time period for the second Simple Moving Average
   * @return smaPeriod2
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SMA_PERIOD2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSmaPeriod2() {
    return smaPeriod2;
  }


  @JsonProperty(value = JSON_PROPERTY_SMA_PERIOD2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSmaPeriod2(@javax.annotation.Nonnull Long smaPeriod2) {
    this.smaPeriod2 = smaPeriod2;
  }


  public GetTimeSeriesKst200ResponseMetaIndicator smaPeriod3(@javax.annotation.Nonnull Long smaPeriod3) {
    this.smaPeriod3 = smaPeriod3;
    return this;
  }

  /**
   * The time period for the third Simple Moving Average
   * @return smaPeriod3
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SMA_PERIOD3, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSmaPeriod3() {
    return smaPeriod3;
  }


  @JsonProperty(value = JSON_PROPERTY_SMA_PERIOD3, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSmaPeriod3(@javax.annotation.Nonnull Long smaPeriod3) {
    this.smaPeriod3 = smaPeriod3;
  }


  public GetTimeSeriesKst200ResponseMetaIndicator smaPeriod4(@javax.annotation.Nonnull Long smaPeriod4) {
    this.smaPeriod4 = smaPeriod4;
    return this;
  }

  /**
   * The time period for the forth Simple Moving Average
   * @return smaPeriod4
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SMA_PERIOD4, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSmaPeriod4() {
    return smaPeriod4;
  }


  @JsonProperty(value = JSON_PROPERTY_SMA_PERIOD4, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSmaPeriod4(@javax.annotation.Nonnull Long smaPeriod4) {
    this.smaPeriod4 = smaPeriod4;
  }


  public GetTimeSeriesKst200ResponseMetaIndicator signalPeriod(@javax.annotation.Nonnull Long signalPeriod) {
    this.signalPeriod = signalPeriod;
    return this;
  }

  /**
   * The time period used for generating the signal line
   * @return signalPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SIGNAL_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSignalPeriod() {
    return signalPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_SIGNAL_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignalPeriod(@javax.annotation.Nonnull Long signalPeriod) {
    this.signalPeriod = signalPeriod;
  }


  /**
   * Return true if this GetTimeSeriesKst_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesKst200ResponseMetaIndicator getTimeSeriesKst200ResponseMetaIndicator = (GetTimeSeriesKst200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesKst200ResponseMetaIndicator.name) &&
        Objects.equals(this.rocPeriod1, getTimeSeriesKst200ResponseMetaIndicator.rocPeriod1) &&
        Objects.equals(this.rocPeriod2, getTimeSeriesKst200ResponseMetaIndicator.rocPeriod2) &&
        Objects.equals(this.rocPeriod3, getTimeSeriesKst200ResponseMetaIndicator.rocPeriod3) &&
        Objects.equals(this.rocPeriod4, getTimeSeriesKst200ResponseMetaIndicator.rocPeriod4) &&
        Objects.equals(this.smaPeriod1, getTimeSeriesKst200ResponseMetaIndicator.smaPeriod1) &&
        Objects.equals(this.smaPeriod2, getTimeSeriesKst200ResponseMetaIndicator.smaPeriod2) &&
        Objects.equals(this.smaPeriod3, getTimeSeriesKst200ResponseMetaIndicator.smaPeriod3) &&
        Objects.equals(this.smaPeriod4, getTimeSeriesKst200ResponseMetaIndicator.smaPeriod4) &&
        Objects.equals(this.signalPeriod, getTimeSeriesKst200ResponseMetaIndicator.signalPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rocPeriod1, rocPeriod2, rocPeriod3, rocPeriod4, smaPeriod1, smaPeriod2, smaPeriod3, smaPeriod4, signalPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesKst200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rocPeriod1: ").append(toIndentedString(rocPeriod1)).append("\n");
    sb.append("    rocPeriod2: ").append(toIndentedString(rocPeriod2)).append("\n");
    sb.append("    rocPeriod3: ").append(toIndentedString(rocPeriod3)).append("\n");
    sb.append("    rocPeriod4: ").append(toIndentedString(rocPeriod4)).append("\n");
    sb.append("    smaPeriod1: ").append(toIndentedString(smaPeriod1)).append("\n");
    sb.append("    smaPeriod2: ").append(toIndentedString(smaPeriod2)).append("\n");
    sb.append("    smaPeriod3: ").append(toIndentedString(smaPeriod3)).append("\n");
    sb.append("    smaPeriod4: ").append(toIndentedString(smaPeriod4)).append("\n");
    sb.append("    signalPeriod: ").append(toIndentedString(signalPeriod)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `roc_period_1` to the URL query string
    if (getRocPeriod1() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sroc_period_1%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRocPeriod1()))));
    }

    // add `roc_period_2` to the URL query string
    if (getRocPeriod2() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sroc_period_2%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRocPeriod2()))));
    }

    // add `roc_period_3` to the URL query string
    if (getRocPeriod3() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sroc_period_3%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRocPeriod3()))));
    }

    // add `roc_period_4` to the URL query string
    if (getRocPeriod4() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sroc_period_4%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRocPeriod4()))));
    }

    // add `sma_period_1` to the URL query string
    if (getSmaPeriod1() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssma_period_1%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmaPeriod1()))));
    }

    // add `sma_period_2` to the URL query string
    if (getSmaPeriod2() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssma_period_2%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmaPeriod2()))));
    }

    // add `sma_period_3` to the URL query string
    if (getSmaPeriod3() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssma_period_3%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmaPeriod3()))));
    }

    // add `sma_period_4` to the URL query string
    if (getSmaPeriod4() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssma_period_4%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmaPeriod4()))));
    }

    // add `signal_period` to the URL query string
    if (getSignalPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssignal_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSignalPeriod()))));
    }

    return joiner.toString();
  }
}

