package com.entities;
import java.util.List;

import javax.persistence.*;

@Entity
public class Department {
	@Id
	private String departmentName;
	@OneToMany(mappedBy="employeeId")
	List<Employee> employeelist;
	public Department() {
		
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Employee> getEmployeelist() {
		return employeelist;
	}
	public void setEmployeelist(List<Employee> employeelist) {
		this.employeelist = employeelist;
	}
	

}
