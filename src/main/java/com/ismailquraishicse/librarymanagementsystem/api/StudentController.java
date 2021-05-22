package com.ismailquraishicse.librarymanagementsystem.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ismailquraishicse.librarymanagementsystem.model.Student;
import com.ismailquraishicse.librarymanagementsystem.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/lms/student")
@RestController
public class StudentController {

private StudentService studentService;
    
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	
	
	// STUDENT'S FUNCTIONS
	@GetMapping
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
		
	}
	

	@GetMapping(path ="{rollno}")
	public Student  getStudentByRollNo(@PathVariable("rollno") int rollNo) {
		return studentService.getStudentByRollNo(rollNo).orElse(null);
	}
	
	@PostMapping
	public String saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@DeleteMapping
	public String deleteAllStudents() {
		return studentService.deleteAllStudents();
	}
	
	@DeleteMapping(path ="{rollno}")
	public String deleteStudentByRollNo(@PathVariable("rollno") int rollNo) {
		
		
		studentService.deleteStudentByRollNo(rollNo);
		return "deleted successfully";
		
	}
	
	
	@PutMapping(path ="{rollno}")
	public String updateStudent(@PathVariable ("rollno") int rollNo, @RequestBody Student student) {
		
		return studentService.updateStudent(rollNo, student);
	}
	
	

}
