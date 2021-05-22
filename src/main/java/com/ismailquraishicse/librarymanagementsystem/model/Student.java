package com.ismailquraishicse.librarymanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

	int rollNo;
	String firstName;
	String lastName;
	String department;
	
	public Student() {
		
	}
	public Student(@JsonProperty ("rollno") int rollNo,
			@JsonProperty ("firstname")String firstName,
			@JsonProperty ("lastname")String lastName,
			@JsonProperty ("department")String department) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
