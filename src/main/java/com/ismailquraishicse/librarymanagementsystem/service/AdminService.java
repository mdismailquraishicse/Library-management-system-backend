package com.ismailquraishicse.librarymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismailquraishicse.librarymanagementsystem.dao.AdminDao;
import com.ismailquraishicse.librarymanagementsystem.model.Admin;

@Service
public class AdminService {
	
	
	AdminDao admindao;
	
	@Autowired
	public AdminService(AdminDao admindao) {
		super();
		this.admindao = admindao;
	}
	
	
	public String saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return admindao.saveAdmin(admin);
	}

	
	public List<Admin> getAdmins() {
		// TODO Auto-generated method stub
		return admindao.getAdmins();
	}

	
	public int /* Optional<Admin> */ getAdminByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return admindao.getAdminByUsernameAndPassword(username,password);
	}

	
	public String deleteAdminByUserName(String username) {
		// TODO Auto-generated method stub
		return admindao.deleteAdminByUserName(username);
	}

	
	public String updateAdmin(String username, Admin admin) {
		// TODO Auto-generated method stub
		return admindao.updateAdmin(username, admin);
	}

	
	
}
