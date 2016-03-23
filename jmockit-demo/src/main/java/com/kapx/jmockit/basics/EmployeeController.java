package com.kapx.jmockit.basics;

public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(final EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public int getCount() {
		return employeeService.getCount();
	}
}
