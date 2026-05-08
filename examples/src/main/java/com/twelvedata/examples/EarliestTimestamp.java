package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.ReferenceDataApi;
import com.twelvedata.client.api.ReferenceDataApi.APIGetEarliestTimestampRequest;
import com.twelvedata.client.model.IntervalEnum;

public final class EarliestTimestamp {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    ReferenceDataApi api = new ReferenceDataApi(client);

    var response = api.getEarliestTimestamp(
        APIGetEarliestTimestampRequest.newBuilder()
            .interval(IntervalEnum._1DAY)
            .symbol("AAPL")
            .build());
    System.out.println(response);
  }

  private EarliestTimestamp() {}
}
