package com.st.spring.beans.tx;

public class User {
	
	private long id;
	private String name;
	private int age;
	private String username;
	private String pin;
	private String sex;
	private String idcard;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", username=" + username + ", pin=" + pin
				+ ", sex=" + sex + ", idcard=" + idcard + "]";
	}
	
	

}
