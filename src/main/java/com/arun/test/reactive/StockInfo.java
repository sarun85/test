package com.arun.test.reactive;

public class StockInfo {

  private String theTicker;
  private double theValue;

  public StockInfo(String theTicker, double theValue) {
    super();
    this.theTicker = theTicker;
    this.theValue = theValue;
  }

  public static StockInfo fetch(String ticker) {
    double rand = Math.random();
    if (rand < 0.1) {
      throw new RuntimeException("oops, ran into trouble");
    }
    return new StockInfo(ticker, rand);
  }

  public String getTheTicker() {
    return theTicker;
  }

  public double getTheValue() {
    return theValue;
  }

  @Override
  public String toString() {
    return String.format("%s : %f", theTicker, theValue);
  }
}
