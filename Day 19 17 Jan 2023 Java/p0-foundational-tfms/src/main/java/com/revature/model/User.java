package com.revature.model;

public class User {
	private String loginId;
	private String password;
	private String lastModifiedDateTime;
	
	public User() {
		super();
	}
	public User(String loginId, String password, String lastModifiedDateTime) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.lastModifiedDateTime = lastModifiedDateTime;
	}
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}
	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}
	@Override
	public String toString() {
		return "Authentication [loginId=" + loginId + ", password=" + password + ", lastModifiedDateTime="
				+ lastModifiedDateTime + "]";
	}
}
