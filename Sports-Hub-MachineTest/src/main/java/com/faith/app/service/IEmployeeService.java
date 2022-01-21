package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.Employee;

public interface IEmployeeService {
	
	public List<Employee>getAllEmployees();
	
	//get Employee by id
	public Optional<Employee>getEmployeeById(Integer empId);
	
	//insert
	public void addEmployee(Employee employee);
	
	//update
	public void updateEmployee(Employee employee);
	
	//delete
	public void deleteEmployee(Integer empId);

}
