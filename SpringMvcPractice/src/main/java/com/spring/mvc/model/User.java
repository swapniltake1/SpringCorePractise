package com.spring.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "userEmail")
	private String userEmail;
	@Column(name = "userName")
	private String userName;
	@Column(name = "UserPassword")
	private String UserPassword;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userEmail, String userName, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		UserPassword = userPassword;
	}

	public User(int id, String userEmail, String userName, String userPassword) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.userName = userName;
		UserPassword = userPassword;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	
}
