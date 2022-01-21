package com.faith.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "visits")
public class Visit {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer visitId;
	private String custName;
	private String contactPerson;
	private String contactNumber;
	private String interestProduct;
	private String visitSubject;
	private String descrption;
	private Date visitDate;
	private Boolean is_disabled;
	private Boolean is_deleted;
	
	private Integer empId;
	
	@ManyToOne
	@JoinColumn(name = "empId",insertable = false,updatable = false)
	private Employee employee;

	public Visit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visit(Integer visitId, String custName, String contactPerson, String contactNumber, String interestProduct,
			String visitSubject, String descrption, Date visitDate, Boolean is_disabled, Boolean is_deleted,
			Integer empId, Employee employee) {
		super();
		this.visitId = visitId;
		this.custName = custName;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.interestProduct = interestProduct;
		this.visitSubject = visitSubject;
		this.descrption = descrption;
		this.visitDate = visitDate;
		this.is_disabled = is_disabled;
		this.is_deleted = is_deleted;
		this.empId = empId;
		this.employee = employee;
	}
	

	public Integer getVisitId() {
		return visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getInterestProduct() {
		return interestProduct;
	}

	public void setInterestProduct(String interestProduct) {
		this.interestProduct = interestProduct;
	}

	public String getVisitSubject() {
		return visitSubject;
	}

	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public Boolean getIs_disabled() {
		return is_disabled;
	}

	public void setIs_disabled(Boolean is_disabled) {
		this.is_disabled = is_disabled;
	}

	public Boolean getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(Boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@JsonBackReference
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
