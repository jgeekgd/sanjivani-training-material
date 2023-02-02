package com.bnymellon.lnd.jdbc.model;

public class User {

	private String userLogin;
	private String userPass;
	private String role;

	public User(String userLogin, String userPass, String role) {
		super();
		this.userLogin = userLogin;
		this.userPass = userPass;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [userLogin=" + userLogin + ", userPass=" + userPass + ", role=" + role + "]";
	}

}
