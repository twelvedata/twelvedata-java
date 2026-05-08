package com.twelvedata.examples;

import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;

import com.twelvedata.client.ws.PriceEvent;
import com.twelvedata.client.ws.ReconnectingEvent;
import com.twelvedata.client.ws.SubscribeStatusEvent;
import com.twelvedata.client.ws.TwelvedataWebSocketClient;
import com.twelvedata.client.ws.TwelvedataWebSocketException;
import com.twelvedata.client.ws.TwelvedataWebSocketListener;

public final class WebSocketStream {
  public static void main(String[] args) throws Exception {
    TwelvedataWebSocketClient client = new TwelvedataWebSocketClient();

    client.addListener(new TwelvedataWebSocketListener() {
      @Override
      public void onPrice(PriceEvent event) {
        System.out.println(event.getSymbol() + " @ " + event.getPrice() + " (" + event.getTimestamp() + ")");
      }

      @Override
      public void onSubscribeStatus(SubscribeStatusEvent event) {
        System.out.println("Subscribed: " + event.getSuccess());
        if (!event.getFails().isEmpty()) {
          System.err.println("Failed: " + event.getFails());
        }
      }

      @Override
      public void onReconnecting(ReconnectingEvent event) {
        System.out.println("Reconnecting (attempt " + event.getAttempt() + ") in " + event.getDelayMs() + "ms");
      }

      @Override
      public void onError(TwelvedataWebSocketException error) {
        System.err.println("WebSocket error [" + error.getClass().getSimpleName() + "]: " + error.getMessage());
      }
    });

    try {
      client.connect().join();
    } catch (CompletionException ex) {
      if (ex.getCause() instanceof TwelvedataWebSocketException.AuthException) {
        System.err.println("Authentication failed: " + ex.getCause().getMessage());
        System.exit(1);
      }
      throw ex;
    }

    client.subscribe("AAPL,EUR/USD,BTC/USD");

    // Stream for 30 seconds, then close cleanly.
    TimeUnit.SECONDS.sleep(30);
    client.disconnect();
  }

  private WebSocketStream() {}
}
