package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TeacherTable")
public class Teacher {
	@Id
	private int teacherId;
	@Column(name="FullName")
	private String teacherName;
	@Column(name="studentsCount")
	private int noofstudents;
	@Column(name="Subjects")
	private String subject;
	
	public Teacher() {
		
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getNoofstudents() {
		return noofstudents;
	}

	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
 
}
