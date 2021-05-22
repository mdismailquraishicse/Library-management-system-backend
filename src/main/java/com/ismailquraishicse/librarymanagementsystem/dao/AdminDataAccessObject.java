package com.ismailquraishicse.librarymanagementsystem.dao;

import java.util.List;
import java.util.Optional;

import com.ismailquraishicse.librarymanagementsystem.model.Admin;

public interface AdminDataAccessObject {

	public String saveAdmin(Admin admin);
	
	public List<Admin> getAdmins();
	
	public int /* Optional<Admin> */ getAdminByUsernameAndPassword(String username, String password);
	
	public String deleteAdminByUserName(String username);
	
	public String updateAdmin(String  username, Admin admin);

}
