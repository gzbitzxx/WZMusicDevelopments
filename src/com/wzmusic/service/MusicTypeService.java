package com.wzmusic.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzmusic.bean.MusicType;
import com.wzmusic.bean.Page;
import com.wzmusic.iservice.IMusicTypeService;
import com.wzmusic.mapper.MusicTypeMapper;
import com.wzmusic.utils.DBGetConnection;

/**
 * 音乐类型服务
 * 
 * @author TongZhou
 *
 */
public class MusicTypeService implements IMusicTypeService {

	// 定义 SqlSession
	private SqlSession session = null;

	// 定义 Mapper 对象
	private MusicTypeMapper musicTypeMapper = null;

	/**
	 * 查询音乐类型
	 */
	@Override
	public MusicType queryMusicTypes(MusicType musicType) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		// 调用方法
		MusicType result = musicTypeMapper.queryMusicTypes(musicType);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		return result;
	}

	/**
	 * 获取音乐类型列表
	 */
	@Override
	public List<MusicType> getMusicTypes() {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		// 调用方法
		List<MusicType> result = musicTypeMapper.getMusicTypes();

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);
		
		//返回结果
		return result;
	}

	/**
	 * 添加音乐类型
	 */
	@Override
	public boolean addMusicType(MusicType musicType) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		//返回结果
				boolean result=false;
		
		// 调用方法
		try {
			musicTypeMapper.addMusicType(musicType);
			
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
	 * 修改音乐类型
	 */
	@Override
	public boolean updateMusicType(MusicType musicType) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		//返回结果
				boolean result=false;
		
		// 调用方法
		try {
			musicTypeMapper.updateMusicType(musicType);
			
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
	 * 删除音乐类型
	 */
	@Override
	public boolean delectMusicType(MusicType musicType) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		//返回结果
				boolean result=false;
		
		// 调用方法
		try {
			musicTypeMapper.delectMusicType(musicType);
			
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
	 * 分页获取分页音乐类型信息+
	 */
	@Override
	public List<MusicType> getMusicTypePage(Page page) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		// 调用方法
		List<MusicType> result = musicTypeMapper.getMusicTypePage(page);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);
		
		//返回结果
		return result;
	}

}
