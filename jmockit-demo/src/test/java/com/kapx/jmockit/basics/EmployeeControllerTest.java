package com.kapx.jmockit.basics;

import mockit.Verifications;
import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

import static org.junit.Assert.*;

@RunWith(JMockit.class)
public class EmployeeControllerTest {

    @Mocked
    EmployeeService mockedEmployeeService;

    @Mocked
    Employee mockedEmployee;

    @Test
    public void testGetCount() {
        new Expectations() {
            {
                mockedEmployeeService.getCount();
                returns(7);
            }
        };

        final EmployeeController controller = new EmployeeController(mockedEmployeeService);
        final int count = controller.getCount();
        assertEquals(7, count);
    }

    @Test
    public void testSaveEmployee() {
        new Expectations() {
            {
                mockedEmployeeService.save(mockedEmployee);
                returns(mockedEmployee);
            }
        };

        final EmployeeController controller = new EmployeeController(mockedEmployeeService);
        final Employee employee = controller.save(mockedEmployee);
        assertSame(mockedEmployee, employee);
    }

}
