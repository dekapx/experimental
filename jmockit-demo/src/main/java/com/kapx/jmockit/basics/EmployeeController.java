package com.kapx.jmockit.basics;

public final class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(final EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public int getCount() {
		return employeeService.getCount();
	}

	public Employee save(final Employee employee) {
		return employeeService.save(employee);
	}
}
