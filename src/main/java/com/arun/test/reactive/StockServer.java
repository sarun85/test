package com.arun.test.reactive;

import java.util.List;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

public class StockServer {
  public static Observable<StockInfo> getFeed(List<String> symbols) {
    System.out.println("Created..");
    return Observable.create(emitter -> emitPrice(emitter, symbols));
  }

  private static void emitPrice(ObservableEmitter<StockInfo> emitter, List<String> symbols) {
    System.out.println("Ready to emit");

    int count = 0;
    while (count < 5) {
      symbols.stream().map(StockInfo::fetch).forEach(emitter::onNext);
      sleep(1000);
      count++;
    }
    emitter.onComplete();

    emitter.onNext(new StockInfo("Blah", 0.0));
  }

  public static void sleep(int ms) {
    try {
      Thread.sleep(ms);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

}
