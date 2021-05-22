package com.ismailquraishicse.librarymanagementsystem.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ismailquraishicse.librarymanagementsystem.dao.StudentDao;
import com.ismailquraishicse.librarymanagementsystem.model.Student;

@Service
public class StudentService {

	private StudentDao studentDao;
	@Autowired
	public StudentService(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Optional<Student> getStudentByRollNo(int rollNo) {
		return studentDao.getStudentByRollNo(rollNo);
	}
	
	
	public String saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	public String deleteAllStudents() {
		studentDao.deleteAllStudents();
		return "Successfully deleted";
	}
	
	public Optional<Student> deleteStudentByRollNo(int rollNo){
		return studentDao.deleteStudentByRollNo(rollNo);
	}
	
	public String updateStudent(int rollNo, Student student) {
		return studentDao.updateStudent(rollNo, student);
	}

	
}
