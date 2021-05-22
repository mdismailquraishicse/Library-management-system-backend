package com.ismailquraishicse.librarymanagementsystem.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.ismailquraishicse.librarymanagementsystem.model.Admin;

@Repository
public class AdminDao implements AdminDataAccessObject {

	private List<Admin> DB;
	@Override
	public String saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO ladmin values(?,?)";

		try {
			ConnectionDao connectionDao = new ConnectionDao();
			PreparedStatement preparedStatement = connectionDao.conn.prepareStatement(query);
			preparedStatement.setString(1, admin.getUsername());
			preparedStatement.setString(2, admin.getPassword());
		    preparedStatement.executeUpdate();
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return "The Admin is inserted successfully";

	}

	@Override
	public List<Admin> getAdmins() {
		// TODO Auto-generated method stub
		
		String query = "SELECT * FROM ladmin";
		
		try {
		      DB = null;
		      DB = new ArrayList<Admin>();
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				Admin a = new Admin(resultSet.getString("admin_username"),resultSet.getString("admin_password"));
				DB.add(a);
			
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return DB;
	}

	@Override
	public /* Optional<Admin> */ int getAdminByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		
		String query = "SELECT * FROM ladmin";
		Admin admin = new Admin();
		
		try {

			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				Admin a = new Admin(resultSet.getString(1),resultSet.getString(2));
				
				
				admin.setUsername(a.getUsername());
				admin.setPassword(a.getPassword());
				if(admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
					return 1;
				}
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		//return Optional.ofNullable(admin);
                	 return 0;
				
	}

	
	
	@Override
	public String deleteAdminByUserName(String username) {
		// TODO Auto-generated method stub
		return "admin deleted";
	}

	@Override
	public String updateAdmin(String username, Admin admin) {
		// TODO Auto-generated method stub
		return "admin updated";
	}

}
