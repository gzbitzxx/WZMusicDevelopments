package com.wzmusic.bean;

public class Music{

	// 音乐编号
	private int id;

	// 歌手名字
	private String singer;

	// 音乐名称
	private String musicName;
	
	//音乐路径
	private String path;
	
	//音乐类型
	private MusicType mucicType;

	public MusicType getMucicType() {
		return mucicType;
	}

	public void setMucicType(MusicType mucicType) {
		this.mucicType = mucicType;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	@Override
	public String toString() {
		return "Music [id=" + id + ", singer=" + singer + ", musicName=" + musicName + ", path=" + path + ", mucicType="
				+ mucicType + "]";
	}

	
}
