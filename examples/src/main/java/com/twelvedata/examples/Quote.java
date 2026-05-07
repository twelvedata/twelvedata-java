package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.MarketDataApi;

public final class Quote {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    MarketDataApi api = new MarketDataApi(client);

    var response = api.getQuote(
        "AAPL", null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null);
    System.out.println(response);
  }

  private Quote() {}
}
