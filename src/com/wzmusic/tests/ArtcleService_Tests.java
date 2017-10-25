package com.wzmusic.tests;

import java.util.Date;

import org.junit.Test;

import com.wzmusic.bean.Article;
import com.wzmusic.bean.Music;
import com.wzmusic.bean.Page;
import com.wzmusic.bean.User;
import com.wzmusic.service.ArtcleService;

/**
 * 文章的服务测试
 * @author TongZhou
 *
 */
public class ArtcleService_Tests {

	//定义 service 对象
	private ArtcleService artcleService=new ArtcleService();
	/**
	 * 查询文章
	 */
	@Test
	public void queryArticles() {
		Article article=new Article();
		article.setId(13);
		artcleService.queryArticles(article);
		
	}

	/**
	 *获取文章列表
	 */
	@Test
	public void getArticles() {
		System.out.println(artcleService.getArticles().toString());
	}

	/**
	 * 添加文章
	 */
	@Test
	public void addArticle() {
		Article article=new Article();
		article.setCreateTime(new Date());
		article.setTitle("2017年10月15日");
		article.setLikeNumber(15);
		
		
		Music music=new Music();
		music.setId(20);
		
		User user=new User();
		user.setId(19);
		
		article.setMusic(music);
		article.setUser(user);
		article.setWords(" 我在南通！");
		
		artcleService.addArticle(article);
	}

	/**
	 * 修改文章测试
	 */
	@Test
	public void updateArticle() {
		Article article=new Article();
		article.setId(61);
		article.setCreateTime(new Date());
		article.setTitle("2017年10月15日");
		article.setLikeNumber(15);
		
		
		Music music=new Music();
		music.setId(20);
		
		User user=new User();
		user.setId(19);
		
		article.setMusic(music);
		article.setUser(user);
		article.setWords(" 我在南通！HEELLO");
		
		artcleService.updateArticle(article);
	}

	/**
	 * 测试修改数控
	 */
	@Test
	public void delectArticle() {
		Article article=new Article();
		article.setId(61);
		artcleService.delectArticle(article);
		
	}

	/**
	 * 测试分页获取数据
	 */
	@Test
	public void getArticlePage() {
		Page page=new Page();
		page.setCurrentPage(2);
		page.setPageSize(10);
		artcleService.getArticlePage(page);
	}

	/**
	 * 分页获取文章
	 * @param Article
	 */
	@Test
	public void queryMyselfArticles() {
		Article article=new Article();
		
		User user=new User();
		user.setId(6);
		
		article.setUser(user);
		artcleService.queryMyselfArticles(article);
	}
	
}
