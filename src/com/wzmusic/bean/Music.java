package com.wzmusic.bean;

public class Music {

	// 音乐编号
	private int id;

	// 音乐姓名
	private String SongName;

	// 作家
	private String Artist;

	// 专辑
	private String Album;

	// 时长
	private String length;

	// 音乐路径
	private String path;

	// 音乐类型
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

	public String getSongName() {
		return SongName;
	}

	public void setSongName(String songName) {
		SongName = songName;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	public String getAlbum() {
		return Album;
	}

	public void setAlbum(String album) {
		Album = album;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Music [id=" + id + ", SongName=" + SongName + ", Artist=" + Artist + ", Album=" + Album + ", length="
				+ length + ", path=" + path + ", mucicType=" + mucicType + "]";
	}

	

}
