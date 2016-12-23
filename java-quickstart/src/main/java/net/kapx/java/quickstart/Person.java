package net.kapx.java.quickstart;

public class Person {
    private String name;
    private String email;
    private int rank;

    public Person(String name, String email, int rank) {
        this.name = name;
        this.email = email;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "[ " + this.name + " - " + this.email + " - " + this.rank + " ]";
    }
}
