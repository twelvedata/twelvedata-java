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
 * GetKeyExecutives200ResponseKeyExecutivesInner
 */
@JsonPropertyOrder({
  GetKeyExecutives200ResponseKeyExecutivesInner.JSON_PROPERTY_NAME,
  GetKeyExecutives200ResponseKeyExecutivesInner.JSON_PROPERTY_TITLE,
  GetKeyExecutives200ResponseKeyExecutivesInner.JSON_PROPERTY_AGE,
  GetKeyExecutives200ResponseKeyExecutivesInner.JSON_PROPERTY_YEAR_BORN,
  GetKeyExecutives200ResponseKeyExecutivesInner.JSON_PROPERTY_PAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetKeyExecutives200ResponseKeyExecutivesInner {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_AGE = "age";
  @javax.annotation.Nullable
  private Long age;

  public static final String JSON_PROPERTY_YEAR_BORN = "year_born";
  @javax.annotation.Nullable
  private Long yearBorn;

  public static final String JSON_PROPERTY_PAY = "pay";
  @javax.annotation.Nullable
  private Long pay;

  public GetKeyExecutives200ResponseKeyExecutivesInner() { 
  }

  public GetKeyExecutives200ResponseKeyExecutivesInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of an executive, including first name, middle name, last name, and suffix
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


  public GetKeyExecutives200ResponseKeyExecutivesInner title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Refers to job title
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


  public GetKeyExecutives200ResponseKeyExecutivesInner age(@javax.annotation.Nullable Long age) {
    this.age = age;
    return this;
  }

  /**
   * Current age of an executive if available
   * @return age
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAge() {
    return age;
  }


  @JsonProperty(value = JSON_PROPERTY_AGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAge(@javax.annotation.Nullable Long age) {
    this.age = age;
  }


  public GetKeyExecutives200ResponseKeyExecutivesInner yearBorn(@javax.annotation.Nullable Long yearBorn) {
    this.yearBorn = yearBorn;
    return this;
  }

  /**
   * Year of birth of an executive if available
   * @return yearBorn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_YEAR_BORN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getYearBorn() {
    return yearBorn;
  }


  @JsonProperty(value = JSON_PROPERTY_YEAR_BORN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearBorn(@javax.annotation.Nullable Long yearBorn) {
    this.yearBorn = yearBorn;
  }


  public GetKeyExecutives200ResponseKeyExecutivesInner pay(@javax.annotation.Nullable Long pay) {
    this.pay = pay;
    return this;
  }

  /**
   * Total salary of an executive if available
   * @return pay
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPay() {
    return pay;
  }


  @JsonProperty(value = JSON_PROPERTY_PAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPay(@javax.annotation.Nullable Long pay) {
    this.pay = pay;
  }


  /**
   * Return true if this GetKeyExecutives_200_response_key_executives_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKeyExecutives200ResponseKeyExecutivesInner getKeyExecutives200ResponseKeyExecutivesInner = (GetKeyExecutives200ResponseKeyExecutivesInner) o;
    return Objects.equals(this.name, getKeyExecutives200ResponseKeyExecutivesInner.name) &&
        Objects.equals(this.title, getKeyExecutives200ResponseKeyExecutivesInner.title) &&
        Objects.equals(this.age, getKeyExecutives200ResponseKeyExecutivesInner.age) &&
        Objects.equals(this.yearBorn, getKeyExecutives200ResponseKeyExecutivesInner.yearBorn) &&
        Objects.equals(this.pay, getKeyExecutives200ResponseKeyExecutivesInner.pay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, age, yearBorn, pay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKeyExecutives200ResponseKeyExecutivesInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    yearBorn: ").append(toIndentedString(yearBorn)).append("\n");
    sb.append("    pay: ").append(toIndentedString(pay)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `age` to the URL query string
    if (getAge() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAge()))));
    }

    // add `year_born` to the URL query string
    if (getYearBorn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syear_born%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYearBorn()))));
    }

    // add `pay` to the URL query string
    if (getPay() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spay%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPay()))));
    }

    return joiner.toString();
  }
}

