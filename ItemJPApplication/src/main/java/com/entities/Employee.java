package com.entities;
import java.util.List;

import javax.persistence.*;
@Entity
public class Employee {
	@Id
	private  int employeeId;
	private String employeeName;
	private String emailId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Task task;
	
	
	@ManyToOne
	private Department department;
	
	public Employee() {
		
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public Task getTask() {
		return task;
	}


	public void setTask(Task task) {
		this.task = task;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	
	
	
	

}
