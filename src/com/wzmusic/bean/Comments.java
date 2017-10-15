package com.wzmusic.bean;

public class Comments {

	// 编号
	private int id;

	// 用户id
	private User user;

	// 音乐编号
	private Music music;

	// 评论
	private String words;

	// 点赞数量
	private int likeNumber;

	// 评论时间
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public int getLikeNumber() {
		return likeNumber;
	}

	public void setLikeNumber(int likeNumber) {
		this.likeNumber = likeNumber;
	}

	

}
