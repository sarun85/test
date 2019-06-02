package com.arun.test.reactive;

import java.util.Arrays;
import java.util.List;
import io.reactivex.Observable;

public class StockClient {
  public static void main(String[] args) {
    List<String> symbols = Arrays.asList("GOOG", "AMZN", "ITC");

    Observable<StockInfo> feed = StockServer.getFeed(symbols);
    System.out.println("Got observable");

    feed.filter(stockInfo -> stockInfo.getTheValue() > 0.5)
        .subscribe(
            stockInfo -> System.out.println(stockInfo), // Success
            err -> System.out.println("Error: " + err), // Error - Murphy law
            () -> System.out.println("DONE")); // OnComplete
  }
}
