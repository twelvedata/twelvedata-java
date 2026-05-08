package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.APIGetEodRequest;

public final class Eod {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    MarketDataApi api = new MarketDataApi(client);

    var response = api.getEod(
        APIGetEodRequest.newBuilder()
            .symbol("AAPL")
            .build());
    System.out.println(response);
  }

  private Eod() {}
}
