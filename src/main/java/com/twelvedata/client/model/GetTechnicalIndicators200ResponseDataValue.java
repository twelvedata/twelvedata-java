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
import com.twelvedata.client.model.TechnicalIndicatorsResponseMacdOutputValues;
import com.twelvedata.client.model.TechnicalIndicatorsResponseMacdParameters;
import com.twelvedata.client.model.TechnicalIndicatorsResponseMacdTinting;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetTechnicalIndicators200ResponseDataValue
 */
@JsonPropertyOrder({
  GetTechnicalIndicators200ResponseDataValue.JSON_PROPERTY_ENABLE,
  GetTechnicalIndicators200ResponseDataValue.JSON_PROPERTY_FULL_NAME,
  GetTechnicalIndicators200ResponseDataValue.JSON_PROPERTY_DESCRIPTION,
  GetTechnicalIndicators200ResponseDataValue.JSON_PROPERTY_TYPE,
  GetTechnicalIndicators200ResponseDataValue.JSON_PROPERTY_OVERLAY,
  GetTechnicalIndicators200ResponseDataValue.JSON_PROPERTY_OUTPUT_VALUES,
  GetTechnicalIndicators200ResponseDataValue.JSON_PROPERTY_PARAMETERS,
  GetTechnicalIndicators200ResponseDataValue.JSON_PROPERTY_TINTING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTechnicalIndicators200ResponseDataValue {
  public static final String JSON_PROPERTY_ENABLE = "enable";
  @javax.annotation.Nonnull
  private Boolean enable;

  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  @javax.annotation.Nonnull
  private String fullName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nonnull
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_OVERLAY = "overlay";
  @javax.annotation.Nonnull
  private Boolean overlay;

  public static final String JSON_PROPERTY_OUTPUT_VALUES = "output_values";
  @javax.annotation.Nullable
  private TechnicalIndicatorsResponseMacdOutputValues outputValues;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @javax.annotation.Nullable
  private TechnicalIndicatorsResponseMacdParameters parameters;

  public static final String JSON_PROPERTY_TINTING = "tinting";
  @javax.annotation.Nullable
  private TechnicalIndicatorsResponseMacdTinting tinting;

  public GetTechnicalIndicators200ResponseDataValue() { 
  }

  public GetTechnicalIndicators200ResponseDataValue enable(@javax.annotation.Nonnull Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * If the indicator is tested, approved and is recommended for use returns &lt;code&gt;true&lt;/code&gt;, otherwise returns &lt;code&gt;false&lt;/code&gt;
   * @return enable
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENABLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnable() {
    return enable;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnable(@javax.annotation.Nonnull Boolean enable) {
    this.enable = enable;
  }


  public GetTechnicalIndicators200ResponseDataValue fullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full indicator name
   * @return fullName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FULL_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFullName() {
    return fullName;
  }


  @JsonProperty(value = JSON_PROPERTY_FULL_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
  }


  public GetTechnicalIndicators200ResponseDataValue description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Brief description of the indicator
   * @return description
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public GetTechnicalIndicators200ResponseDataValue type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Group to which indicator belongs to
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public GetTechnicalIndicators200ResponseDataValue overlay(@javax.annotation.Nonnull Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

  /**
   * If indicator should be plotted over price bars returns &lt;code&gt;true&lt;/code&gt;, otherwise returns &lt;code&gt;false&lt;/code&gt;
   * @return overlay
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_OVERLAY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getOverlay() {
    return overlay;
  }


  @JsonProperty(value = JSON_PROPERTY_OVERLAY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOverlay(@javax.annotation.Nonnull Boolean overlay) {
    this.overlay = overlay;
  }


  public GetTechnicalIndicators200ResponseDataValue outputValues(@javax.annotation.Nullable TechnicalIndicatorsResponseMacdOutputValues outputValues) {
    this.outputValues = outputValues;
    return this;
  }

  /**
   * Get outputValues
   * @return outputValues
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OUTPUT_VALUES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TechnicalIndicatorsResponseMacdOutputValues getOutputValues() {
    return outputValues;
  }


  @JsonProperty(value = JSON_PROPERTY_OUTPUT_VALUES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputValues(@javax.annotation.Nullable TechnicalIndicatorsResponseMacdOutputValues outputValues) {
    this.outputValues = outputValues;
  }


  public GetTechnicalIndicators200ResponseDataValue parameters(@javax.annotation.Nullable TechnicalIndicatorsResponseMacdParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TechnicalIndicatorsResponseMacdParameters getParameters() {
    return parameters;
  }


  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(@javax.annotation.Nullable TechnicalIndicatorsResponseMacdParameters parameters) {
    this.parameters = parameters;
  }


  public GetTechnicalIndicators200ResponseDataValue tinting(@javax.annotation.Nullable TechnicalIndicatorsResponseMacdTinting tinting) {
    this.tinting = tinting;
    return this;
  }

  /**
   * Get tinting
   * @return tinting
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TINTING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TechnicalIndicatorsResponseMacdTinting getTinting() {
    return tinting;
  }


  @JsonProperty(value = JSON_PROPERTY_TINTING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTinting(@javax.annotation.Nullable TechnicalIndicatorsResponseMacdTinting tinting) {
    this.tinting = tinting;
  }


  /**
   * Return true if this GetTechnicalIndicators_200_response_data_value object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTechnicalIndicators200ResponseDataValue getTechnicalIndicators200ResponseDataValue = (GetTechnicalIndicators200ResponseDataValue) o;
    return Objects.equals(this.enable, getTechnicalIndicators200ResponseDataValue.enable) &&
        Objects.equals(this.fullName, getTechnicalIndicators200ResponseDataValue.fullName) &&
        Objects.equals(this.description, getTechnicalIndicators200ResponseDataValue.description) &&
        Objects.equals(this.type, getTechnicalIndicators200ResponseDataValue.type) &&
        Objects.equals(this.overlay, getTechnicalIndicators200ResponseDataValue.overlay) &&
        Objects.equals(this.outputValues, getTechnicalIndicators200ResponseDataValue.outputValues) &&
        Objects.equals(this.parameters, getTechnicalIndicators200ResponseDataValue.parameters) &&
        Objects.equals(this.tinting, getTechnicalIndicators200ResponseDataValue.tinting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, fullName, description, type, overlay, outputValues, parameters, tinting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTechnicalIndicators200ResponseDataValue {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
    sb.append("    outputValues: ").append(toIndentedString(outputValues)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    tinting: ").append(toIndentedString(tinting)).append("\n");
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

    // add `enable` to the URL query string
    if (getEnable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnable()))));
    }

    // add `full_name` to the URL query string
    if (getFullName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfull_name%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFullName()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `overlay` to the URL query string
    if (getOverlay() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soverlay%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOverlay()))));
    }

    // add `output_values` to the URL query string
    if (getOutputValues() != null) {
      joiner.add(getOutputValues().toUrlQueryString(prefix + "output_values" + suffix));
    }

    // add `parameters` to the URL query string
    if (getParameters() != null) {
      joiner.add(getParameters().toUrlQueryString(prefix + "parameters" + suffix));
    }

    // add `tinting` to the URL query string
    if (getTinting() != null) {
      joiner.add(getTinting().toUrlQueryString(prefix + "tinting" + suffix));
    }

    return joiner.toString();
  }
}

