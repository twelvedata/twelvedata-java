package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.model.IntervalEnum;

public final class TimeSeries {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    MarketDataApi api = new MarketDataApi(client);

    var response = api.getTimeSeries(
        IntervalEnum._1DAY, "AAPL", null, null, null, null,
        null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null);
    System.out.println(response);
  }

  private TimeSeries() {}
}
