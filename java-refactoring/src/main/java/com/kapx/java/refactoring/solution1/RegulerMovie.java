package com.kapx.java.refactoring.solution1;

public class RegulerMovie extends Movie {

    public RegulerMovie(final String title, final int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculateRentalAmount(final int _daysRented) {
        double thisAmount = 0;
        thisAmount += 2;
        if (_daysRented > 2)
            thisAmount += (_daysRented - 2) * 1.5;
        return 0;
    }

    @Override
    public int calculateFrequentRenterPoints(final int _daysRented) {
        return 1;
    }
}
