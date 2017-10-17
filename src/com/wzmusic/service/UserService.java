package com.wzmusic.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzmusic.bean.Page;
import com.wzmusic.bean.User;
import com.wzmusic.iservice.IUserService;
import com.wzmusic.mapper.UserMapper;
import com.wzmusic.utils.DBGetConnection;

/**
 * 用户服务
 * 
 * @author TongZhou
 *
 */
public class UserService implements IUserService {
	// 定义 SqlSession
	private SqlSession session = null;

	// 定义 Mapper 对象
	private UserMapper userMapper = null;

	/**
	 * 查询用户
	 */
	@Override
	public User queryUsers(User user) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载Mapper
		userMapper = session.getMapper(UserMapper.class);

		// 调用方法
		User result = userMapper.queryUsers(user);

		// 提交事务
		session.commit();

		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		// 返回结果
		return result;
	}

	@Override
	public List<User> getUsers() {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载Mapper
		userMapper = session.getMapper(UserMapper.class);

		// 调用方法
		List<User> result = userMapper.getUsers();

		// 提交事务
		session.commit();

		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		//返回结果
		return result;
	}

	@Override
	public void addUser(User user) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载Mapper
		userMapper = session.getMapper(UserMapper.class);

		// 调用方法
		userMapper.addUser(user);;

		// 提交事务
		session.commit();

		// 关闭资源
		DBGetConnection.closeSqlSession(session);
	}

	@Override
	public void updateUser(User user) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载Mapper
		userMapper = session.getMapper(UserMapper.class);

		// 调用方法
		userMapper.updateUser(user);

		// 提交事务
		session.commit();

		// 关闭资源
		DBGetConnection.closeSqlSession(session);
	}

	@Override
	public void delectUser(User user) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载Mapper
		userMapper = session.getMapper(UserMapper.class);

		// 调用方法
		userMapper.delectUser(user);

		// 提交事务
		session.commit();

		// 关闭资源
		DBGetConnection.closeSqlSession(session);
	}

	@Override
	public List<User> getUsersPage(Page page) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载Mapper
		userMapper = session.getMapper(UserMapper.class);

		// 调用方法
		List<User> result = userMapper.getUsersPage(page);

		// 提交事务
		session.commit();

		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		return result;
	}

}
