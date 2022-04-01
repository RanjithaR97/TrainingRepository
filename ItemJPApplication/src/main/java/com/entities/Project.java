package com.entities;
import java.util.List;

import javax.persistence.*;
@Entity
public class Project {
	@Id
	private String projectId;
	private String projectDescription;
	@ManyToMany
	private List<Employee> employeelist;
	public Project() {
		
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public List<Employee> getEmployeelist() {
		return employeelist;
	}
	public void setEmployeelist(List<Employee> employeelist) {
		this.employeelist = employeelist;
	}
	

}
