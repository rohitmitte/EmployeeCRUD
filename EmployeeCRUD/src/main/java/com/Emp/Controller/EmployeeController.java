package com.Emp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Emp.Entities.Employee;
import com.Emp.Services.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService empserv;
	
	@PostMapping
	public String addEmployee(@RequestBody Employee e) {
		String msg=empserv.addEmployee(e);
		return msg;
	}
	
	@GetMapping(value="{empid}")
	public Employee getEmployeeInfo(@PathVariable String empId) {
		Employee e=empserv.getEmployeeInfo(empId);
		return e;
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		List<Employee> empListObjects=empserv.getAllEmployeeInfo();
		return empListObjects;
		
	}
	
	@PutMapping(value="{empId}")
	public String updateEmployee(@RequestParam Employee e) {
		String msg = empserv.updateEmployee(e);
		return msg;
		
	}
	
	@DeleteMapping(value="{empId}")
	public String deleteEmployee(@PathVariable String empId) {
		String msg=empserv.deleteEmployee(empId);
		return msg;
	}
	
	

}
