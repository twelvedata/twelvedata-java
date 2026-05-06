/*
 * Twelve Data API client for Java
 *
 * NOTE: This code is auto generated, please do not edit it manually.
 */


package com.twelvedata.client;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class Pair {
  private final String name;
  private final String value;

  public Pair(String name, String value) {
    this.name = isValidString(name) ? name : "";
    this.value = isValidString(value) ? value : "";
  }

  public String getName() {
    return this.name;
  }

  public String getValue() {
    return this.value;
  }

  private static boolean isValidString(String arg) {
    return arg != null;
  }
}
