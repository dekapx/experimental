package com.kapx.jmockit.basics;

public class EmployeeController {
	private EmployeeService employeeService;

	public int getCount() {
		return employeeService.getCount();
	}
}
