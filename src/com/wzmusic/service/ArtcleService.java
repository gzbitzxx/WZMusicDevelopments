package com.wzmusic.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzmusic.bean.Article;
import com.wzmusic.bean.Page;
import com.wzmusic.iservice.IArticleService;
import com.wzmusic.mapper.AdminMapper;
import com.wzmusic.mapper.ArticleMapper;
import com.wzmusic.utils.DBGetConnection;

/**
 * 文章的SERVICE
 * 
 * @author TongZhou
 *
 */
public class ArtcleService implements IArticleService {

	// 定义 SqlSession
	private SqlSession session = null;

	// 定义 Mapper 对象
	private ArticleMapper articleMapper = null;

	/**
	 * 查询文章
	 */
	@Override
	public Article queryArticles(Article article) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper 类
		articleMapper = session.getMapper(ArticleMapper.class);

		// 建立 Arctile 对象
		Article result = articleMapper.queryArticles(article);

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

		// 返回 Article
		return result;
	}

	/**
	 * 获取文章列表
	 */
	@Override
	public List<Article> getArticles() {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper 类
		articleMapper = session.getMapper(ArticleMapper.class);

		// 获取文章 List
		List<Article> articles = articleMapper.getArticles();

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

		// 返回结果
		return articles;
	}

	/**
	 * 添加文章
	 */
	@Override
	public void addArticle(Article article) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper 类
		articleMapper = session.getMapper(ArticleMapper.class);

		// 调用添加方法
		articleMapper.addArticle(article);

		// 提交事务
		session.commit();

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

	}

	/**
	 * 修改文章
	 */
	@Override
	public void updateArticle(Article article) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper 类
		articleMapper = session.getMapper(ArticleMapper.class);

		// 调用修改方法
		articleMapper.updateArticle(article);

		// 提交事务
		session.commit();

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

	}

	/**
	 * 删除文章
	 */
	@Override
	public void delectArticle(Article article) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper 类
		articleMapper = session.getMapper(ArticleMapper.class);

		// 调用删除方法
		articleMapper.delectArticle(article);

		// 提交事务
		session.commit();
		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

	}

	/**
	 * 分页获取文章
	 */
	@Override
	public List<Article> getArticlePage(Page page) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper 类
		articleMapper = session.getMapper(ArticleMapper.class);

		// 获取文章 List
		List<Article> articles = articleMapper.getArticlePage(page);

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

		// 返回结果
		return articles;
	}

	/**
	 * 获取自己的文章
	 */
	@Override
	public List<Article> queryMyselfArticles(Article Article) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper 类
		articleMapper = session.getMapper(ArticleMapper.class);

		// 获取文章 List
		List<Article> articles = articleMapper.queryMyselfArticles(Article);

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

		// 返回结果
		return articles;
	}
}
