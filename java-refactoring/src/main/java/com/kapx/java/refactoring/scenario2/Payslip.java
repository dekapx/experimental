package com.kapx.java.refactoring.scenario2;

import java.util.List;

public class Payslip {
    public double payAmount(final List<Person> employees) {
        double _monthlySalary = 0;

        for (Person person : employees) {
            _monthlySalary = person.calculateBaseSalary();
        }

        return _monthlySalary;
    }
}
