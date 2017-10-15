package com.wzmusic.bean;

import java.util.Date;

public class Article {

	//标题
	private String title;
	
	// 编号
	private int id;

	// 用户id
	private User user;

	// 音乐编号id
	private Music music;

	// 文章内容
	private String words;

	// 点赞数量
	private int likeNumber;
	
	//创建的时间
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	@Override
	public String toString() {
		return "Article [title=" + title + ", id=" + id + ", user=" + user + ", music=" + music + ", words=" + words
				+ ", likeNumber=" + likeNumber + ", createTime=" + createTime + "]";
	}
	
	
}
