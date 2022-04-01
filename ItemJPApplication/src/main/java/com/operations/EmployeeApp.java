package com.operations;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import com.entities.*;


public class EmployeeApp {

	public static void main(String[] args) {
		EntityManagerFactory efac=Persistence.createEntityManagerFactory("ItemPU");
		EntityManager emanager=efac.createEntityManager();
		emanager.getTransaction().begin();
		Employee e=new Employee();
		e.setEmployeeId(1);
		e.setEmployeeName("Peter jonas");
		e.setEmailId("Peter@gmail.com");
		
		Employee e1=new Employee();
		e1.setEmployeeId(2);
		e1.setEmployeeName("Steffi");
		e1.setEmailId("Steffi@gmail.com");
		
		Employee e2=new Employee();
		e2.setEmployeeId(3);
		e2.setEmployeeName("Ranjitha");
		e2.setEmailId("Ranji1009@gmail.com");
		
		Department department=new Department();
		department.setDepartmentName("Training");
		List<Employee> employeelist= new ArrayList();
		employeelist.add(e);
		employeelist.add(e1);
		employeelist.add(e2);
		department.setEmployeelist(employeelist);
		
		Task task=new Task();
		task.setTaskId(1);
		task.setTaskName("pocessing chemical");
		task.setTaskDescription("checking chemicals dor preservatives");
		task.setEmployee(e);
		task.setEmployee(e1);
		e.setTask(task);
		e.setDepartment(department);
		e1.setDepartment(department);
		e2.setDepartment(department);
	
		Project project1=new Project();
		project1.setProjectId("P001");
		project1.setProjectDescription("Cofee reasearch");
		
		Project project2=new Project();
		project1.setProjectId("P002");
		project1.setProjectDescription("Chemical reasearch");
		
		List<Project>projectList=new ArrayList<Project>();
		projectList.add(project1);
		projectList.add(project2);
		
				
		emanager.persist(e);
		emanager.persist(e1);
		emanager.persist(e2);
		emanager.persist(department);
		emanager.flush();
		emanager.getTransaction().commit();
		

	}

}
