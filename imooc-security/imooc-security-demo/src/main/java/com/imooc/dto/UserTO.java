package com.imooc.dto;

public class UserTO {
	
	private String userName;
	private String password;
	public UserTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
