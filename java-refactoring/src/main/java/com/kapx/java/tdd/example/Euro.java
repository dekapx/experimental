package com.kapx.java.tdd.example;

public class Euro {
    private int amount;

    public Euro(final int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int times(final int multiplier) {
        return amount * multiplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;

        return amount == euro.amount;

    }

    @Override
    public int hashCode() {
        return amount;
    }
}
