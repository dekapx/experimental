package com.dekapx.yahoofinance.stock;

import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;
import yahoofinance.quotes.stock.StockQuote;

import java.util.Calendar;
import java.util.List;

public interface StockFetcher {
    StockQuote getStock(String symbol) throws Exception;

    List<HistoricalQuote> getHistoricalQuote(String symbol, Calendar from, Calendar to, Interval interval) throws Exception;
}
