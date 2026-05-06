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
 * Direct method cash flow
 */
@JsonPropertyOrder({
  CashFlowDataDirectMethodCashFlow.JSON_PROPERTY_CLASSES_OF_CASH_RECEIPTS_FROM_OPERATING_ACTIVITIES,
  CashFlowDataDirectMethodCashFlow.JSON_PROPERTY_OTHER_CASH_RECEIPTS_FROM_OPERATING_ACTIVITIES,
  CashFlowDataDirectMethodCashFlow.JSON_PROPERTY_RECEIPTS_FROM_GOVERNMENT_GRANTS,
  CashFlowDataDirectMethodCashFlow.JSON_PROPERTY_RECEIPTS_FROM_CUSTOMERS,
  CashFlowDataDirectMethodCashFlow.JSON_PROPERTY_CLASSES_OF_CASH_PAYMENTS,
  CashFlowDataDirectMethodCashFlow.JSON_PROPERTY_OTHER_CASH_PAYMENTS_FROM_OPERATING_ACTIVITIES,
  CashFlowDataDirectMethodCashFlow.JSON_PROPERTY_PAYMENTS_ON_BEHALF_OF_EMPLOYEES,
  CashFlowDataDirectMethodCashFlow.JSON_PROPERTY_PAYMENTS_TO_SUPPLIERS_FOR_GOODS_AND_SERVICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowDataDirectMethodCashFlow {
  public static final String JSON_PROPERTY_CLASSES_OF_CASH_RECEIPTS_FROM_OPERATING_ACTIVITIES = "classes_of_cash_receipts_from_operating_activities";
  @javax.annotation.Nullable
  private Double classesOfCashReceiptsFromOperatingActivities;

  public static final String JSON_PROPERTY_OTHER_CASH_RECEIPTS_FROM_OPERATING_ACTIVITIES = "other_cash_receipts_from_operating_activities";
  @javax.annotation.Nullable
  private Double otherCashReceiptsFromOperatingActivities;

  public static final String JSON_PROPERTY_RECEIPTS_FROM_GOVERNMENT_GRANTS = "receipts_from_government_grants";
  @javax.annotation.Nullable
  private Double receiptsFromGovernmentGrants;

  public static final String JSON_PROPERTY_RECEIPTS_FROM_CUSTOMERS = "receipts_from_customers";
  @javax.annotation.Nullable
  private Double receiptsFromCustomers;

  public static final String JSON_PROPERTY_CLASSES_OF_CASH_PAYMENTS = "classes_of_cash_payments";
  @javax.annotation.Nullable
  private Double classesOfCashPayments;

  public static final String JSON_PROPERTY_OTHER_CASH_PAYMENTS_FROM_OPERATING_ACTIVITIES = "other_cash_payments_from_operating_activities";
  @javax.annotation.Nullable
  private Double otherCashPaymentsFromOperatingActivities;

  public static final String JSON_PROPERTY_PAYMENTS_ON_BEHALF_OF_EMPLOYEES = "payments_on_behalf_of_employees";
  @javax.annotation.Nullable
  private Double paymentsOnBehalfOfEmployees;

  public static final String JSON_PROPERTY_PAYMENTS_TO_SUPPLIERS_FOR_GOODS_AND_SERVICES = "payments_to_suppliers_for_goods_and_services";
  @javax.annotation.Nullable
  private Double paymentsToSuppliersForGoodsAndServices;

  public CashFlowDataDirectMethodCashFlow() { 
  }

  public CashFlowDataDirectMethodCashFlow classesOfCashReceiptsFromOperatingActivities(@javax.annotation.Nullable Double classesOfCashReceiptsFromOperatingActivities) {
    this.classesOfCashReceiptsFromOperatingActivities = classesOfCashReceiptsFromOperatingActivities;
    return this;
  }

  /**
   * Classes of cash receipts from operating activities
   * @return classesOfCashReceiptsFromOperatingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLASSES_OF_CASH_RECEIPTS_FROM_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getClassesOfCashReceiptsFromOperatingActivities() {
    return classesOfCashReceiptsFromOperatingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CLASSES_OF_CASH_RECEIPTS_FROM_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassesOfCashReceiptsFromOperatingActivities(@javax.annotation.Nullable Double classesOfCashReceiptsFromOperatingActivities) {
    this.classesOfCashReceiptsFromOperatingActivities = classesOfCashReceiptsFromOperatingActivities;
  }


  public CashFlowDataDirectMethodCashFlow otherCashReceiptsFromOperatingActivities(@javax.annotation.Nullable Double otherCashReceiptsFromOperatingActivities) {
    this.otherCashReceiptsFromOperatingActivities = otherCashReceiptsFromOperatingActivities;
    return this;
  }

  /**
   * Other cash receipts from operating activities
   * @return otherCashReceiptsFromOperatingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_CASH_RECEIPTS_FROM_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherCashReceiptsFromOperatingActivities() {
    return otherCashReceiptsFromOperatingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_CASH_RECEIPTS_FROM_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCashReceiptsFromOperatingActivities(@javax.annotation.Nullable Double otherCashReceiptsFromOperatingActivities) {
    this.otherCashReceiptsFromOperatingActivities = otherCashReceiptsFromOperatingActivities;
  }


  public CashFlowDataDirectMethodCashFlow receiptsFromGovernmentGrants(@javax.annotation.Nullable Double receiptsFromGovernmentGrants) {
    this.receiptsFromGovernmentGrants = receiptsFromGovernmentGrants;
    return this;
  }

  /**
   * Receipts from government grants
   * @return receiptsFromGovernmentGrants
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RECEIPTS_FROM_GOVERNMENT_GRANTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReceiptsFromGovernmentGrants() {
    return receiptsFromGovernmentGrants;
  }


  @JsonProperty(value = JSON_PROPERTY_RECEIPTS_FROM_GOVERNMENT_GRANTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptsFromGovernmentGrants(@javax.annotation.Nullable Double receiptsFromGovernmentGrants) {
    this.receiptsFromGovernmentGrants = receiptsFromGovernmentGrants;
  }


  public CashFlowDataDirectMethodCashFlow receiptsFromCustomers(@javax.annotation.Nullable Double receiptsFromCustomers) {
    this.receiptsFromCustomers = receiptsFromCustomers;
    return this;
  }

  /**
   * Receipts from customers
   * @return receiptsFromCustomers
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RECEIPTS_FROM_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReceiptsFromCustomers() {
    return receiptsFromCustomers;
  }


  @JsonProperty(value = JSON_PROPERTY_RECEIPTS_FROM_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptsFromCustomers(@javax.annotation.Nullable Double receiptsFromCustomers) {
    this.receiptsFromCustomers = receiptsFromCustomers;
  }


  public CashFlowDataDirectMethodCashFlow classesOfCashPayments(@javax.annotation.Nullable Double classesOfCashPayments) {
    this.classesOfCashPayments = classesOfCashPayments;
    return this;
  }

  /**
   * Classes of cash payments
   * @return classesOfCashPayments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLASSES_OF_CASH_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getClassesOfCashPayments() {
    return classesOfCashPayments;
  }


  @JsonProperty(value = JSON_PROPERTY_CLASSES_OF_CASH_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassesOfCashPayments(@javax.annotation.Nullable Double classesOfCashPayments) {
    this.classesOfCashPayments = classesOfCashPayments;
  }


  public CashFlowDataDirectMethodCashFlow otherCashPaymentsFromOperatingActivities(@javax.annotation.Nullable Double otherCashPaymentsFromOperatingActivities) {
    this.otherCashPaymentsFromOperatingActivities = otherCashPaymentsFromOperatingActivities;
    return this;
  }

  /**
   * Other cash payments from operating activities
   * @return otherCashPaymentsFromOperatingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_CASH_PAYMENTS_FROM_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherCashPaymentsFromOperatingActivities() {
    return otherCashPaymentsFromOperatingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_CASH_PAYMENTS_FROM_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCashPaymentsFromOperatingActivities(@javax.annotation.Nullable Double otherCashPaymentsFromOperatingActivities) {
    this.otherCashPaymentsFromOperatingActivities = otherCashPaymentsFromOperatingActivities;
  }


  public CashFlowDataDirectMethodCashFlow paymentsOnBehalfOfEmployees(@javax.annotation.Nullable Double paymentsOnBehalfOfEmployees) {
    this.paymentsOnBehalfOfEmployees = paymentsOnBehalfOfEmployees;
    return this;
  }

  /**
   * Payments on behalf of employees
   * @return paymentsOnBehalfOfEmployees
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAYMENTS_ON_BEHALF_OF_EMPLOYEES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPaymentsOnBehalfOfEmployees() {
    return paymentsOnBehalfOfEmployees;
  }


  @JsonProperty(value = JSON_PROPERTY_PAYMENTS_ON_BEHALF_OF_EMPLOYEES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentsOnBehalfOfEmployees(@javax.annotation.Nullable Double paymentsOnBehalfOfEmployees) {
    this.paymentsOnBehalfOfEmployees = paymentsOnBehalfOfEmployees;
  }


  public CashFlowDataDirectMethodCashFlow paymentsToSuppliersForGoodsAndServices(@javax.annotation.Nullable Double paymentsToSuppliersForGoodsAndServices) {
    this.paymentsToSuppliersForGoodsAndServices = paymentsToSuppliersForGoodsAndServices;
    return this;
  }

  /**
   * Payments to suppliers for goods and services
   * @return paymentsToSuppliersForGoodsAndServices
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAYMENTS_TO_SUPPLIERS_FOR_GOODS_AND_SERVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPaymentsToSuppliersForGoodsAndServices() {
    return paymentsToSuppliersForGoodsAndServices;
  }


  @JsonProperty(value = JSON_PROPERTY_PAYMENTS_TO_SUPPLIERS_FOR_GOODS_AND_SERVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentsToSuppliersForGoodsAndServices(@javax.annotation.Nullable Double paymentsToSuppliersForGoodsAndServices) {
    this.paymentsToSuppliersForGoodsAndServices = paymentsToSuppliersForGoodsAndServices;
  }


  /**
   * Return true if this CashFlowData_direct_method_cash_flow object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowDataDirectMethodCashFlow cashFlowDataDirectMethodCashFlow = (CashFlowDataDirectMethodCashFlow) o;
    return Objects.equals(this.classesOfCashReceiptsFromOperatingActivities, cashFlowDataDirectMethodCashFlow.classesOfCashReceiptsFromOperatingActivities) &&
        Objects.equals(this.otherCashReceiptsFromOperatingActivities, cashFlowDataDirectMethodCashFlow.otherCashReceiptsFromOperatingActivities) &&
        Objects.equals(this.receiptsFromGovernmentGrants, cashFlowDataDirectMethodCashFlow.receiptsFromGovernmentGrants) &&
        Objects.equals(this.receiptsFromCustomers, cashFlowDataDirectMethodCashFlow.receiptsFromCustomers) &&
        Objects.equals(this.classesOfCashPayments, cashFlowDataDirectMethodCashFlow.classesOfCashPayments) &&
        Objects.equals(this.otherCashPaymentsFromOperatingActivities, cashFlowDataDirectMethodCashFlow.otherCashPaymentsFromOperatingActivities) &&
        Objects.equals(this.paymentsOnBehalfOfEmployees, cashFlowDataDirectMethodCashFlow.paymentsOnBehalfOfEmployees) &&
        Objects.equals(this.paymentsToSuppliersForGoodsAndServices, cashFlowDataDirectMethodCashFlow.paymentsToSuppliersForGoodsAndServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classesOfCashReceiptsFromOperatingActivities, otherCashReceiptsFromOperatingActivities, receiptsFromGovernmentGrants, receiptsFromCustomers, classesOfCashPayments, otherCashPaymentsFromOperatingActivities, paymentsOnBehalfOfEmployees, paymentsToSuppliersForGoodsAndServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowDataDirectMethodCashFlow {\n");
    sb.append("    classesOfCashReceiptsFromOperatingActivities: ").append(toIndentedString(classesOfCashReceiptsFromOperatingActivities)).append("\n");
    sb.append("    otherCashReceiptsFromOperatingActivities: ").append(toIndentedString(otherCashReceiptsFromOperatingActivities)).append("\n");
    sb.append("    receiptsFromGovernmentGrants: ").append(toIndentedString(receiptsFromGovernmentGrants)).append("\n");
    sb.append("    receiptsFromCustomers: ").append(toIndentedString(receiptsFromCustomers)).append("\n");
    sb.append("    classesOfCashPayments: ").append(toIndentedString(classesOfCashPayments)).append("\n");
    sb.append("    otherCashPaymentsFromOperatingActivities: ").append(toIndentedString(otherCashPaymentsFromOperatingActivities)).append("\n");
    sb.append("    paymentsOnBehalfOfEmployees: ").append(toIndentedString(paymentsOnBehalfOfEmployees)).append("\n");
    sb.append("    paymentsToSuppliersForGoodsAndServices: ").append(toIndentedString(paymentsToSuppliersForGoodsAndServices)).append("\n");
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

    // add `classes_of_cash_receipts_from_operating_activities` to the URL query string
    if (getClassesOfCashReceiptsFromOperatingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclasses_of_cash_receipts_from_operating_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClassesOfCashReceiptsFromOperatingActivities()))));
    }

    // add `other_cash_receipts_from_operating_activities` to the URL query string
    if (getOtherCashReceiptsFromOperatingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_cash_receipts_from_operating_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCashReceiptsFromOperatingActivities()))));
    }

    // add `receipts_from_government_grants` to the URL query string
    if (getReceiptsFromGovernmentGrants() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreceipts_from_government_grants%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReceiptsFromGovernmentGrants()))));
    }

    // add `receipts_from_customers` to the URL query string
    if (getReceiptsFromCustomers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreceipts_from_customers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReceiptsFromCustomers()))));
    }

    // add `classes_of_cash_payments` to the URL query string
    if (getClassesOfCashPayments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclasses_of_cash_payments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClassesOfCashPayments()))));
    }

    // add `other_cash_payments_from_operating_activities` to the URL query string
    if (getOtherCashPaymentsFromOperatingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_cash_payments_from_operating_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCashPaymentsFromOperatingActivities()))));
    }

    // add `payments_on_behalf_of_employees` to the URL query string
    if (getPaymentsOnBehalfOfEmployees() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spayments_on_behalf_of_employees%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPaymentsOnBehalfOfEmployees()))));
    }

    // add `payments_to_suppliers_for_goods_and_services` to the URL query string
    if (getPaymentsToSuppliersForGoodsAndServices() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spayments_to_suppliers_for_goods_and_services%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPaymentsToSuppliersForGoodsAndServices()))));
    }

    return joiner.toString();
  }
}

