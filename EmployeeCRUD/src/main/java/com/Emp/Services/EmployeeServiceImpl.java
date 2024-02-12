package com.Emp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emp.Entities.Employee;
import com.Emp.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository emprepo; 

	@Override
	public String addEmployee(Employee e) {
		emprepo.save(e);
		return "Employee is created and saved ";
	}

	@Override
	public Employee getEmployeeInfo(String empId) {
		Employee e=emprepo.findById(empId).get();
		return e;
	}

	@Override
	public List<Employee> getAllEmployeeInfo() {
		List<Employee> emplist=emprepo.findAll();
		return emplist;
	}

	@Override
	public String updateEmployee(Employee e) {
		emprepo.save(e);
		return "Employee object is updated";
	}

	@Override
	public String deleteEmployee(String empId) {
		emprepo.deleteById(empId);
		return "Employee object is deleted";
	}

}
