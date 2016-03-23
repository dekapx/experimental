package com.kapx.jmockit.basics;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class EmployeeControllerTest {

	@Mocked
	EmployeeService employeeService;

	@Test
	public void testGetCount() {
		new Expectations() {
			{
				employeeService.getCount();
				returns(7);
			}
		};

		EmployeeController controller = new EmployeeController(employeeService);
		int count = controller.getCount();
		System.out.println(count);
	}

}
