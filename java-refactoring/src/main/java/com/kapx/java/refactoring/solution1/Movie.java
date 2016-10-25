package com.kapx.java.refactoring.solution1;

public abstract class Movie {
    private String _title;
    private int _priceCode;

    protected Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    protected abstract double calculateRentalAmount(int _daysRented);
    protected abstract int calculateFrequentRenterPoints(int _daysRented);

}
