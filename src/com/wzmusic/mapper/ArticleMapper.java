package com.wzmusic.mapper;

import java.util.List;

import com.wzmusic.bean.Article;
import com.wzmusic.bean.Page;

/**
 * 文章DAO
 * @author TongZhou
 *
 */
public interface ArticleMapper {

	/**
	 * 查询文章
	 * @param Article 文章实体
	 * @return 文章实体
	 * @throws Exception
	 */
	public Article queryArticles(Article Article);

	/**
	 * 获取文章列表
	 * @return 文章列表
	 * @throws Exception
	 */
	public List<Article> getArticles();

	/**
	 * 添加文章
	 * @param Article 添加的文章实体
	 * @throws Exception
	 */
	public void addArticle(Article Article);

	/**
	 * 修改文章实体
	 * @param Article 文章实体类
	 * @throws Exception
	 */
	public void updateArticle(Article Article);

	/**
	 * 删除文章
	 * @param Article 文章实体
	 * @throws Exception
	 */
	public void delectArticle(Article Article);

	/**
	 * 分页获取文章
	 * @param page 分页信息
	 * @return 文章列表
	 * @throws Exception
	 */
	public List<Article> getArticlePage(Page page);

	/**
	 * 查询单个儿用户文章信息
	 * @param Article
	 * @return
	 * @throws Exception
	 */
	public List<Article> queryMyselfArticles(Article Article);
}
