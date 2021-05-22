package com.ismailquraishicse.librarymanagementsystem.dao;

import java.util.List;
import java.util.Optional;

import com.ismailquraishicse.librarymanagementsystem.model.Student;

public interface StudentDataAccessObject {

	public List<Student> getAllStudents();
	
	Optional<Student> getStudentByRollNo(int rollno);
	
	public String saveStudent(Student student);
	
	public String deleteAllStudents();
	
	Optional<Student> deleteStudentByRollNo(int rollNo);
	
	public String updateStudent(int rollNo,Student student);
}
