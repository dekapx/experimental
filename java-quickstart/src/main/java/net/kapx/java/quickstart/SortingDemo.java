package net.kapx.java.quickstart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {
        final List<Person> persons = getPersons();
        display(persons);
        persons.sort(new NameComparator());
        display(persons);
    }

    private static void display(final List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("---------------------------------");
    }

    private static List<Person> getPersons() {
        final List<Person> persons = new ArrayList<>(5);
        persons.add(new Person("Ken Shemrock", "Ken.Shemrock@ufc.com", 4));
        persons.add(new Person("Chuck Liddel", "Chuck.Liddel@ufc.com", 7));
        persons.add(new Person("Anderson Silva", "Anderson.Silva@ufc.com", 5));
        persons.add(new Person("Miesa Tate", "Miesa.Tate@ufc.com", 1));
        persons.add(new Person("Ronda Rousey", "Ronda.Rousey@ufc.com", 2));
        return persons;
    }


    private static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
