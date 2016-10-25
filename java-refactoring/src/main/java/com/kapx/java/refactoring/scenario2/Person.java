package com.kapx.java.refactoring.scenario2;

public abstract class Person {
    protected String firstName;
    protected String lastName;

    protected static final double base = 1000;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected abstract double calculateBaseSalary();
}
