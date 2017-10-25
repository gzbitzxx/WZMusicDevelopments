package com.wzmusic.tests;


import java.net.MalformedURLException;

import org.junit.Test;

import com.wzmusic.bean.MusicType;
import com.wzmusic.bean.Page;
import com.wzmusic.service.MusicTypeService;

public class MusicTypeService_Tests{

	// 定义 service 服务
	MusicTypeService musicTypeService=new MusicTypeService();
	
	@Test
	public void queryMusicTypes() {
		MusicType musicType=new MusicType();
		musicType.setId(14);
		System.out.println(musicTypeService.queryMusicTypes(musicType));
	}

	@Test
	public void getMusicTypes() {
		System.out.println(musicTypeService.getMusicTypes());
	}

	@Test
	public void addMusicType() {
		MusicType musicType1=new MusicType();
		musicType1.setTypeName("Test");
		musicType1.setOrderNumber(5);
		System.out.println(musicTypeService.addMusicType(musicType1));
		
	}

	@Test
	public void updateMusicType() {
		MusicType musicType1=new MusicType();
		musicType1.setTypeName("Testxx");
		musicType1.setOrderNumber(5);
		musicType1.setId(18);
		System.out.println(musicTypeService.updateMusicType(musicType1));
	}

	@Test
	public void delectMusicType() {
		MusicType musicType=new MusicType();
		musicType.setId(18);
		System.out.println(musicTypeService.delectMusicType(musicType));
	}

	
	public void getMusicTypePage(Page page) {
		
	}

}
