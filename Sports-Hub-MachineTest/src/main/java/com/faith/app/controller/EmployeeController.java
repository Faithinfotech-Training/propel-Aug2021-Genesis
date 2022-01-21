package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Employee;
import com.faith.app.service.IEmployeeService;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	//get all employees
	@GetMapping("/employees")
	public List<Employee>getAllEmployees(){
		return employeeService.getAllEmployees();
		
	}
	
	//get employee by id
	@GetMapping("/employees/{empId}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer empId) {
		return employeeService.getEmployeeById(empId);
	}
	
	
	
	//inserting employee
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	//updating employee
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	//delete a Employee
	@DeleteMapping("/employees/{empId}")
	public void deleteEmployee(@PathVariable Integer empId) {
		employeeService.deleteEmployee(empId);
	}



}
