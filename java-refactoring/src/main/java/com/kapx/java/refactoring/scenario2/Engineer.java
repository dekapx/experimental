package com.kapx.java.refactoring.scenario2;

public class Engineer extends Person {
    private String dept;

    public Engineer(String firstName, String lastName, String dept) {
        super(firstName, lastName);
        this.dept = dept;
    }

    @Override
    public double calculateBaseSalary() {
        return new Double(base * 1.5).doubleValue();
    }
}
