package com.subitshar18.growmoney.dto;

public class User {
	private int id;
	private String name;
	private String phoneNumber;
	private String email;
	private String password;
	
	private static int userId=100;
	
	public User(String name, String phoneNumber, String email, String password) {
		super();
		this.id=userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		userId++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
