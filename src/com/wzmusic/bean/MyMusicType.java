package com.wzmusic.bean;

public class MyMusicType {
	//编号
	private int id;
	
	//我的音乐类型名
	private String name;
	
	
	//用户实体
	private User user;
	
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
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "MyMusicType [id=" + id + ", name=" + name + ", user=" + user + "]";
	}
	
	
	
	

	
	
}
