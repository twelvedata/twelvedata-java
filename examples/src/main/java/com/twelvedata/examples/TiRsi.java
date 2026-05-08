package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.TechnicalIndicatorApi;
import com.twelvedata.client.api.TechnicalIndicatorApi.APIGetTimeSeriesRsiRequest;
import com.twelvedata.client.model.IntervalEnum;

public final class TiRsi {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    TechnicalIndicatorApi api = new TechnicalIndicatorApi(client);

    var response = api.getTimeSeriesRsi(
        APIGetTimeSeriesRsiRequest.newBuilder()
            .interval(IntervalEnum._1DAY)
            .symbol("AAPL")
            .outputsize(10L)
            .timezone("UTC")
            .build());
    System.out.println(response);
  }

  private TiRsi() {}
}
