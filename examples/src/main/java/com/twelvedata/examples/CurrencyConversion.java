package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.CurrenciesApi;
import com.twelvedata.client.api.CurrenciesApi.APIGetCurrencyConversionRequest;

public final class CurrencyConversion {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    CurrenciesApi api = new CurrenciesApi(client);

    var response = api.getCurrencyConversion(
        APIGetCurrencyConversionRequest.newBuilder()
            .symbol("USD/EUR")
            .amount(100.0)
            .build());
    System.out.println(response);
  }

  private CurrencyConversion() {}
}
