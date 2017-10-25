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
		Comments result=commentsMapper.queryComments(comment);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		return result;
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
	public boolean addComment(Comments comment) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);
		
		// 返回结果
		boolean result=false;

		// 调用方法
		try {
			commentsMapper.addComment(comment);
			
			result=true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);
		
		return result;
	}

	/**
	 * 修改评论
	 */
	@Override
	public boolean updateComment(Comments comment) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);

		// 返回结果
				boolean result=false;
				
		// 调用方法
		try {
			commentsMapper.updateComment(comment);
			
			result=true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);
		
		return result;
	}

	/**
	 * 删除评论
	 */
	@Override
	public boolean delectComment(Comments comment) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		commentsMapper = session.getMapper(CommentsMapper.class);

		// 返回结果
				boolean result=false;
		
		// 调用方法
		try {
			commentsMapper.delectComment(comment);
			
			result=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 提交事务
		session.commit();
		
		// 关闭资源
		DBGetConnection.closeSqlSession(session);
		
		return result;

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
