package com.kapx.java.refactoring.solution1;

public class ChildrenMovie extends Movie {

    public ChildrenMovie(final String title, final int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculateRentalAmount(final int _daysRented) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (_daysRented > 3)
            thisAmount += (_daysRented - 3) * 1.5;
        return thisAmount;
    }

    @Override
    public int calculateFrequentRenterPoints(final int _daysRented) {
        return 1;
    }
}
