package com.hibernate;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	private long  employeeId;
	private String employeeName;
	private String email;
	private Date doe;
	
	public Employee() {
		super();
	}

	public Employee(long employeeId, String employeeName, String email, Date doe) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.doe = doe;
	}
	
	@Id
	@Column(name="employee_id")
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name="employee_name")
	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Column(name="email")
	public String getemail() {
		return email;
	}


	public void setemail(String email) {
		this.email = email;
	}

	@Column(name="doe")
	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", doe="
				+ doe + "]";
	}
	

}
