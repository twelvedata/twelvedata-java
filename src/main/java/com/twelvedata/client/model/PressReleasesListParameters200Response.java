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
import com.twelvedata.client.model.PressRelease;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * PressReleasesListParameters200Response
 */
@JsonPropertyOrder({
  PressReleasesListParameters200Response.JSON_PROPERTY_PRESS_RELEASES,
  PressReleasesListParameters200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class PressReleasesListParameters200Response {
  public static final String JSON_PROPERTY_PRESS_RELEASES = "press_releases";
  @javax.annotation.Nonnull
  private List<PressRelease> pressReleases = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public PressReleasesListParameters200Response() { 
  }

  public PressReleasesListParameters200Response pressReleases(@javax.annotation.Nonnull List<PressRelease> pressReleases) {
    this.pressReleases = pressReleases;
    return this;
  }

  public PressReleasesListParameters200Response addPressReleasesItem(PressRelease pressReleasesItem) {
    if (this.pressReleases == null) {
      this.pressReleases = new ArrayList<>();
    }
    this.pressReleases.add(pressReleasesItem);
    return this;
  }

  /**
   * List of press releases
   * @return pressReleases
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PRESS_RELEASES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PressRelease> getPressReleases() {
    return pressReleases;
  }


  @JsonProperty(value = JSON_PROPERTY_PRESS_RELEASES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPressReleases(@javax.annotation.Nonnull List<PressRelease> pressReleases) {
    this.pressReleases = pressReleases;
  }


  public PressReleasesListParameters200Response status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Response status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull String status) {
    this.status = status;
  }


  /**
   * Return true if this PressReleasesListParameters_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PressReleasesListParameters200Response pressReleasesListParameters200Response = (PressReleasesListParameters200Response) o;
    return Objects.equals(this.pressReleases, pressReleasesListParameters200Response.pressReleases) &&
        Objects.equals(this.status, pressReleasesListParameters200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pressReleases, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PressReleasesListParameters200Response {\n");
    sb.append("    pressReleases: ").append(toIndentedString(pressReleases)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `press_releases` to the URL query string
    if (getPressReleases() != null) {
      for (int i = 0; i < getPressReleases().size(); i++) {
        if (getPressReleases().get(i) != null) {
          joiner.add(getPressReleases().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%spress_releases%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

