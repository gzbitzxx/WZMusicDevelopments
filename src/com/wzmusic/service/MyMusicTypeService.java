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
	public boolean addMyMusicType(MyMusicType myMusicType) {
		

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);

		//返回结果
				boolean result=false;
		
		// 调用方法
		try {
			myMusicTypeMapper.addMyMusicType(myMusicType);
			
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
	 * 修改我的音乐类型
	 */
	@Override
	public boolean updateMyMusicType(MyMusicType myMusicType) {
		

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);

		//返回结果
				boolean result=false;
		
		// 调用方法
		try {
			myMusicTypeMapper.updateMyMusicType(myMusicType);
			
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
	 * 删除我的音乐类型
	 */
	@Override
	public boolean delectMyMusicType(MyMusicType myMusicType) {
		

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		myMusicTypeMapper = session.getMapper(MyMusicTypeMapper.class);
		
		//返回结果
				boolean result=false;

		// 调用方法
		try {
			myMusicTypeMapper.delectMyMusicType(myMusicType);
			
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
