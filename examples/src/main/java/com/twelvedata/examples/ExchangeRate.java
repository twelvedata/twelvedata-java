package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.CurrenciesApi;
import com.twelvedata.client.api.CurrenciesApi.APIGetExchangeRateRequest;

public final class ExchangeRate {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    CurrenciesApi api = new CurrenciesApi(client);

    var response = api.getExchangeRate(
        APIGetExchangeRateRequest.newBuilder()
            .symbol("USD/EUR")
            .build());
    System.out.println(response);
  }

  private ExchangeRate() {}
}
