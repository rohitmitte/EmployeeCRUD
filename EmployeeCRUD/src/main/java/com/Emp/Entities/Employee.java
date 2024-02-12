package com.Emp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	String empId;
	String name;
	int age;
	String role;
	float salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empId, String name, int age, String role, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.role = role;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", role=" + role + ", salary=" + salary
				+ "]";
	}
	
	
	

}
