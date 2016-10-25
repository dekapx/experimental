package com.kapx.java.refactoring.scenario2;

public class Manager extends Person{
    private int grade;

    public Manager(String firstName, String lastName, int grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public double calculateBaseSalary() {
        return new Double(base * 2).doubleValue();
    }
}
