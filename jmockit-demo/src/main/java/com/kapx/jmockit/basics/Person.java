package com.kapx.jmockit.basics;

public class Person {
    private String name;


    public Person(){
        name = "Default";
    }
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
