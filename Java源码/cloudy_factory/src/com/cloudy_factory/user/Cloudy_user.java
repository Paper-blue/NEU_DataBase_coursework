package com.cloudy_factory.user;

public class Cloudy_user {
	private String login_name;
	private String password;
	private String user_name;
	private String mobile;
	private int USER_ROLEID;
	private String factoryname;
	private String introduction;
	public Cloudy_user(String login_name, String password, String user_name, String mobile, int uSER_ROLEID,
			String factoryname, String introduction) {
		super();
		this.login_name = login_name;
		this.password = password;
		this.user_name = user_name;
		this.mobile = mobile;
		USER_ROLEID = uSER_ROLEID;
		this.factoryname = factoryname;
		this.introduction = introduction;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getUSER_ROLEID() {
		return USER_ROLEID;
	}
	public void setUSER_ROLEID(int uSER_ROLEID) {
		USER_ROLEID = uSER_ROLEID;
	}
	public String getFactoryname() {
		return factoryname;
	}
	public void setFactoryname(String factoryname) {
		this.factoryname = factoryname;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
}