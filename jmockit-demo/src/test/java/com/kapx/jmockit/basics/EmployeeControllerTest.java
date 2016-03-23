package com.kapx.jmockit.basics;

import org.junit.Test;

import mockit.Mock;
import mockit.MockUp;

public class EmployeeControllerTest {

	@Test
	public void testGetCount() {
		new MockUp<EmployeeService>() {
			@Mock
			public int getCount() {
				return 5;
			}
		};

		EmployeeController controller = new EmployeeController();
		int count = controller.getCount();
		System.out.println(count);
	}

}
