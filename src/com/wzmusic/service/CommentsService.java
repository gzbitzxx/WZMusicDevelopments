package com.wzmusic.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzmusic.bean.Comments;
import com.wzmusic.bean.Page;
import com.wzmusic.iservice.ICommentsService;
import com.wzmusic.mapper.CommentsMapper;
import com.wzmusic.utils.DBGetConnection;

/**
 * 评论的 service
 * 
 * @author TongZhou
 *
 */
public class CommentsService implements ICommentsService {

	// 定义 SqlSession
	private SqlSession session = null;

	// 定义 Mapper 对象
	private CommentsMapper commentsMapper = null;

	/**
	 * 查询管理员
	 */
	@Override
	public Comments queryComments(Comments comment) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);

		// 调用方法
		commentsMapper.queryComments(comment);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		return null;
	}

	/**
	 * 获取评论列表
	 */
	@Override
	public List<Comments> getComments() {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);

		// 调用方法
		commentsMapper.getComments();

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		return null;
	}

	/**
	 * 添加评论
	 */
	@Override
	public void addComment(Comments comment) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);

		// 调用方法
		commentsMapper.addComment(comment);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

	}

	/**
	 * 修改评论
	 */
	@Override
	public void updateComment(Comments comment) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);

		// 调用方法
		commentsMapper.updateComment(comment);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

	}

	/**
	 * 删除评论
	 */
	@Override
	public void delectComment(Comments comment) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);

		// 调用方法
		commentsMapper.delectComment(comment);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

	}

	/**
	 * 分页或显示
	 */
	@Override
	public List<Comments> getCommentPage(Page page) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);

		// 调用方法
		List<Comments> result=commentsMapper.getCommentPage(page);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		return result;
	}

}
