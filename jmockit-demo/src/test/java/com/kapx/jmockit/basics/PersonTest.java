package com.kapx.jmockit.basics;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class PersonTest {
    @Test
    public void testNoArgsConstructor() {
        new MockUp<Person>() {
            @Mock
            public void $init() {
            }
        };

        Person p = new Person();
        String name = p.getName();
        assertNull("Name of person is null",name);
    }

    @Test
    public void testConstructorWithArgs() {
        new MockUp<Person>() {
            @Mock
            public void $init(String name) {
            }
        };

        Person p = new Person("TestName");
        String name = p.getName();
        System.out.println(name);
        assertNull("Name of person is null",name);
    }
}
