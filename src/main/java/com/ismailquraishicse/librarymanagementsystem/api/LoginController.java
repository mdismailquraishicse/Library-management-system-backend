package com.ismailquraishicse.librarymanagementsystem.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ismailquraishicse.librarymanagementsystem.model.Admin;
import com.ismailquraishicse.librarymanagementsystem.service.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/lms/validate")
@RestController
public class LoginController {

	private AdminService adminService;

	@Autowired
	public LoginController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@PostMapping()
	public int validateAdmin(@RequestBody Admin admin) {
	 
		return	this.adminService.getAdminByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		
	}

	
}
