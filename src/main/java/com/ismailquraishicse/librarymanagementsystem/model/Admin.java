package com.ismailquraishicse.librarymanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Admin {

	String username;
	String password;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(@JsonProperty ("username") String username,
				 @JsonProperty ("password") String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
