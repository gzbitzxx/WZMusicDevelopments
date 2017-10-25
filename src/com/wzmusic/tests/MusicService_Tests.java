package com.wzmusic.tests;


import org.junit.Test;
import com.wzmusic.bean.Music;
import com.wzmusic.bean.MusicType;
import com.wzmusic.bean.Page;
import com.wzmusic.service.MusicService;

/**
 * 音乐服务类
 * @author TongZhou
 *
 */
public class MusicService_Tests{
	
	// 定义 service 对象
	MusicService musicService=new MusicService();

	/**
	 * 测试查询
	 */
	@Test
	public void queryMusics() {
		Music music=new Music();
		music.setId(44);
		System.out.println(musicService.queryMusics(music));
	}

	/**
	 * 测试获取音乐
	 */
	@Test
	public void getMusics() {
		System.out.println(musicService.getMusics());
	}

	/**
	 * 测试添加音乐
	 */
	@Test
	public void addMusic() {
		
		MusicType mucicType=new MusicType();
		mucicType.setId(14);
		
		Music music=new Music();
		music.setSongName("尴尬1232");
		music.setPath("c//12341234");
		music.setArtist("ggg1234124");
		music.setMucicType(mucicType);
		music.setLength("12234");
		music.setAlbum("tqwrqwr12");
		System.out.println(musicService.addMusic(music));
		
	}

	/**
	 * 测试修改音乐
	 */
	@Test
	public void updateMusic() {
		MusicType mucicType=new MusicType();
		mucicType.setId(14);
		
		Music music=new Music();
		music.setId(49);
		music.setSongName("尴尬1232zxxx");
		music.setPath("c//12341234");
		music.setArtist("ggg1234124");
		music.setMucicType(mucicType);
		music.setLength("12234");
		music.setAlbum("tqwrqwr12");
		System.out.println(musicService.updateMusic(music));
		
	}

	/**
	 * 测试删除音乐
	 */
	@Test
	public void delectMusic() {
		Music music=new Music();
		music.setId(50);
		System.out.println(musicService.delectMusic(music));
	}

	/**
	 * 分页获取音乐
	 */
	@Test
	public void getMusicsPage() {
		Page page=new Page();
		page.setCurrentPage(1);
		page.setPageSize(10);
		System.out.println(musicService.getMusicsPage(page));
	}

}
