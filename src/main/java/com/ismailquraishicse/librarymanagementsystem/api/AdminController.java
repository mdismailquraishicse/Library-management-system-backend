//package com.ismailquraishicse.librarymanagementsystem.api;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.ismailquraishicse.librarymanagementsystem.model.Admin;
//import com.ismailquraishicse.librarymanagementsystem.service.AdminService;
//
////@CrossOrigin(origins = "http://localhost:4200")
////@RequestMapping("api/v1/lms/admin")
//@RestController
//public class AdminController {
//
//	
//	private AdminService adminService;
//	
//	@Autowired
//	public AdminController(AdminService adminService) {
//		super();
//		this.adminService = adminService;
//	}
//	
//	@PostMapping()
//	public int validateAdmin(@RequestBody Admin admin) {
//	 
//		return	this.adminService.getAdminByUsernameAndPassword(admin.getUsername(), admin.getPassword());
//		
//	}
//	
//	@PostMapping
//	public String saveAdmin(@RequestBody Admin admin) {
//		return adminService.saveAdmin(admin);
//	}
//	
//	@GetMapping
//	public List<Admin> getAllAdmins(){
//		return adminService.getAdmins();
//	}
//	
////	@GetMapping(path = "{username}")
////	public Optional<Admin> getAdminByUsername(@PathVariable("username") String username, 
////											  @PathVariable ("password") String password) {
////		return adminService.getAdminByUsernameAndPassword(username,password);
////	}
//	
//	@DeleteMapping
//	public String deleteAdminByUsername(String username) {
//		return adminService.deleteAdminByUserName(username);
//	}
//	
//	@PutMapping
//	public String updateAdmin(String username, Admin admin) {
//		return adminService.updateAdmin(username, admin);
//	}
//	
//	
//	
//}
