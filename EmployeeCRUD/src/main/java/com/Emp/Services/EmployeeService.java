package com.Emp.Services;

import java.util.List;

import com.Emp.Entities.Employee;

public interface EmployeeService {
	
	String addEmployee(Employee e);
	
	Employee getEmployeeInfo(String empId);
	
	List<Employee> getAllEmployeeInfo();
	
	String updateEmployee(Employee e);
	
	String deleteEmployee(String empId);

}
