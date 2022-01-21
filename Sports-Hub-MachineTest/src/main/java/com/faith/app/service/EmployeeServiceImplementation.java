package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Employee;
import com.faith.app.repository.IEmployeeRepository;
@Service
public class EmployeeServiceImplementation implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepository employeeRepositoy;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepositoy.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		return employeeRepositoy.findById(empId);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepositoy.save(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepositoy.save(employee);
		
	}

	@Override
	public void deleteEmployee(Integer empId) {
		employeeRepositoy.deleteById(empId);
		
	}

}
