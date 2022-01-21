package com.faith.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "logins")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer logId;
	private String userName;
	private String password;
	private String userType;
	
	@OneToMany(mappedBy = "login",cascade = CascadeType.ALL)
	private List<Employee>employees;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(Integer logId, String userName, String password, String userType, List<Employee> employees) {
		super();
		this.logId = logId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.employees = employees;
	}
	

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@JsonManagedReference
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	

}
