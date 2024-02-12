package com.Emp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Emp.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
