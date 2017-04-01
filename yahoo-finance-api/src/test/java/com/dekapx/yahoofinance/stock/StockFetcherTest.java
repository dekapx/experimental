package com.dekapx.yahoofinance.stock;

import org.junit.Before;
import org.junit.Test;
import yahoofinance.quotes.stock.StockQuote;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class StockFetcherTest {
    final StockFetcher stockFetcher = new StockFetcherImpl();

    @Before
    public void setup() {
    }

    @Test
    public void getStock_withGoogleSymbol_getLatestStockQuote() throws Exception {
        final String symbol = "GOOG";
        final StockQuote stockQuoteCurrent = stockFetcher.getStock(symbol);

        assertThat(stockQuoteCurrent.getSymbol(), is(equalTo("GOOG")));

        System.out.println("Symbol: " + stockQuoteCurrent.getSymbol());
        System.out.println("Price: " + stockQuoteCurrent.getPrice());
        System.out.println("Date: " + stockQuoteCurrent.getLastTradeTime().getTime());
    }
}
