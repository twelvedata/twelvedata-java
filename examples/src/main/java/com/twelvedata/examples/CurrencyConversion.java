package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.CurrenciesApi;

public final class CurrencyConversion {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    CurrenciesApi api = new CurrenciesApi(client);

    var response = api.getCurrencyConversion(
        "USD/EUR", 100.0, null, null, null, null, null);
    System.out.println(response);
  }

  private CurrencyConversion() {}
}
