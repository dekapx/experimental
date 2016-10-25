package com.kapx.java.refactoring.solution1;

public class NewReleasesMovie extends Movie {

    public NewReleasesMovie(final String title, final int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculateRentalAmount(final int _daysRented) {
        double thisAmount = 0;
        thisAmount += _daysRented * 3;
        return thisAmount;
    }

    @Override
    public int calculateFrequentRenterPoints(final int _daysRented) {
        return _daysRented > 1 ? 2 : 1;
    }
}
