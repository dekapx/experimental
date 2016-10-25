package com.kapx.java.refactoring.scenario2;

public class Employee extends Person {

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public double calculateBaseSalary() {
        return new Double(base).doubleValue();
    }
}
