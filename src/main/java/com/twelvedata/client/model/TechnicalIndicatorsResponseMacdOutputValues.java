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
import com.twelvedata.client.model.TechnicalIndicatorsResponseMacdOutputValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * An array of output values
 */
@JsonPropertyOrder({
  TechnicalIndicatorsResponseMacdOutputValues.JSON_PROPERTY_PARAMETER_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class TechnicalIndicatorsResponseMacdOutputValues {
  public static final String JSON_PROPERTY_PARAMETER_NAME = "parameter_name";
  @javax.annotation.Nullable
  private TechnicalIndicatorsResponseMacdOutputValue parameterName;

  public TechnicalIndicatorsResponseMacdOutputValues() { 
  }

  public TechnicalIndicatorsResponseMacdOutputValues parameterName(@javax.annotation.Nullable TechnicalIndicatorsResponseMacdOutputValue parameterName) {
    this.parameterName = parameterName;
    return this;
  }

  /**
   * Get parameterName
   * @return parameterName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PARAMETER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TechnicalIndicatorsResponseMacdOutputValue getParameterName() {
    return parameterName;
  }


  @JsonProperty(value = JSON_PROPERTY_PARAMETER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterName(@javax.annotation.Nullable TechnicalIndicatorsResponseMacdOutputValue parameterName) {
    this.parameterName = parameterName;
  }


  /**
   * Return true if this TechnicalIndicatorsResponseMacdOutputValues object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalIndicatorsResponseMacdOutputValues technicalIndicatorsResponseMacdOutputValues = (TechnicalIndicatorsResponseMacdOutputValues) o;
    return Objects.equals(this.parameterName, technicalIndicatorsResponseMacdOutputValues.parameterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalIndicatorsResponseMacdOutputValues {\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
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

    // add `parameter_name` to the URL query string
    if (getParameterName() != null) {
      joiner.add(getParameterName().toUrlQueryString(prefix + "parameter_name" + suffix));
    }

    return joiner.toString();
  }
}

