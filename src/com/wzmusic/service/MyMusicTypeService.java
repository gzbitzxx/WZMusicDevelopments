package com.wzmusic.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzmusic.bean.MyMusicType;
import com.wzmusic.iservice.IMyMusicTypeService;
import com.wzmusic.mapper.MyMusicTypeMapper;
import com.wzmusic.utils.DBGetConnection;

/**
 * 我的音乐类型
 * 
 * @author TongZhou
 *
 */
public class MyMusicTypeService implements IMyMusicTypeService {

	// 定义 SqlSession
	private SqlSession session = null;

	// 定义 Mapper 对象
	private MyMusicTypeMapper myMusicTypeMapper = null;

	/**
	 * 查询我的音乐类型
	 */
	@Override
	public MyMusicType queryMyMusicTypes(MyMusicType myMusicType) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);

		// 调用方法
		MyMusicType result = myMusicTypeMapper.queryMyMusicTypes(myMusicType);

		// 提交事务
		session.commit();
		
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		return result;
	}

	/**
	 * 获取我的音乐类型列表
	 */
	@Override
	public List<MyMusicType> getMyMusicTypes() {
		

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);

		// 调用方法
		List<MyMusicType> result = myMusicTypeMapper.getMyMusicTypes();

		// 提交事务
		session.commit();
		
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		//返回结果
		return result;
	}

	/**
	 * 添加我的音乐类型
	 */
	@Override
	public void addMyMusicType(MyMusicType myMusicType) {
		

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);

		// 调用方法
		myMusicTypeMapper.addMyMusicType(myMusicType);

		// 提交事务
		session.commit();
		
		// 关闭资源
		DBGetConnection.closeSqlSession(session);


	}

	/**
	 * 修改我的音乐类型
	 */
	@Override
	public void updateMyMusicType(MyMusicType myMusicType) {
		

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);

		// 调用方法
		myMusicTypeMapper.updateMyMusicType(myMusicType);

		// 提交事务
		session.commit();
		
		// 关闭资源
		DBGetConnection.closeSqlSession(session);


	}

	/**
	 * 删除我的音乐类型
	 */
	@Override
	public void delectMyMusicType(MyMusicType myMusicType) {
		

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);

		// 调用方法
		myMusicTypeMapper.delectMyMusicType(myMusicType);

		// 提交事务
		session.commit();
		
		// 关闭资源
		DBGetConnection.closeSqlSession(session);


	}

	/**
	 * 分页获取我的音乐类型
	 */
	@Override
	public List<MyMusicType> queryMyselfMyMusicTypes(MyMusicType myMusicType) {
	

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);

		// 调用方法
		List<MyMusicType> result = myMusicTypeMapper.getMyMusicTypes();

		// 提交事务
		session.commit();
		
		// 关闭资源
		DBGetConnection.closeSqlSession(session);
		
		return result;
	}

}
