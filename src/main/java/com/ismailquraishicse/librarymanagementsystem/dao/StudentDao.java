package com.ismailquraishicse.librarymanagementsystem.dao;

import java.sql.*;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.ismailquraishicse.librarymanagementsystem.model.Student;

@Repository
public class StudentDao implements StudentDataAccessObject{
	
	List<Student> DB;


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub

		
		String query = "SELECT * FROM lstudents";
		
		try {
			
			DB = null;
			DB = new ArrayList<Student>();
			
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				Student s = new Student(resultSet.getInt("srollno"),resultSet.getString("sfname"),resultSet.getString("slname"),resultSet.getString("sdepartment"));
				DB.add(s);
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		
		return DB;

	}
	
	@Override
	public Optional<Student> getStudentByRollNo(int rollno) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM lstudents WHERE srollno="+rollno;
		Student s = new Student();

		try {
			
			DB = null;
			DB = new ArrayList<Student>();
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				s.setRollNo(resultSet.getInt("srollno")); 
				s.setFirstName(resultSet.getString("sfname"));		
				s.setLastName(resultSet.getString("slname")); 
				s.setDepartment(resultSet.getString("sdepartment"));
				DB.add(s);
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}

		/* confusing */
		return DB.stream().filter(student -> student.getRollNo()==rollno).findFirst();
	}



	@Override
	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		String query = "INSERT INTO lstudents values(?,?,?,?)";

		try {
			ConnectionDao connectionDao = new ConnectionDao();
			PreparedStatement preparedStatement = connectionDao.conn.prepareStatement(query);
			preparedStatement.setInt(1, student.getRollNo());
			preparedStatement.setString(2, student.getFirstName());
			preparedStatement.setString(3, student.getLastName());
			preparedStatement.setString(4, student.getDepartment());



			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return "Student successfully inserted";
	
	}

	@Override
	public String deleteAllStudents() {
		// TODO Auto-generated method stub
		String query = "DELETE FROM lstudents";
		
		try {
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			statement.executeUpdate(query);

			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		
		return "deleted";
	}

	@Override
	public Optional<Student> deleteStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		
		String query = "DELETE FROM lstudents WHERE srollno="+rollNo;
		
		try {
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			statement.executeUpdate(query);

			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public String updateStudent(int rollNo, Student student) {
		// TODO Auto-generated method stub
		return "student updated";
	}





}
