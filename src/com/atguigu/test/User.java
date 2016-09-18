package com.atguigu.test;

public class User {
	
	private Integer UserId;
	private String name;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String name) {
		super();
		UserId = userId;
		this.name = name;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
