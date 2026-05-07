package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.TechnicalIndicatorApi;
import com.twelvedata.client.model.IntervalEnum;

public final class TiAtr {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    TechnicalIndicatorApi api = new TechnicalIndicatorApi(client);

    var response = api.getTimeSeriesAtr(
        IntervalEnum._1DAY, "AAPL", null, null, null, 10L,
        null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null);
    System.out.println(response);
  }

  private TiAtr() {}
}
