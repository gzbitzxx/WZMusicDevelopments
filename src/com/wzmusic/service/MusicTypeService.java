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
	public void addMusicType(MusicType musicType) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		// 调用方法
		musicTypeMapper.addMusicType(musicType);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

	}

	/**
	 * 修改音乐类型
	 */
	@Override
	public void updateMusicType(MusicType musicType) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		// 调用方法
		musicTypeMapper.updateMusicType(musicType);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

	}

	/**
	 * 删除音乐类型
	 */
	@Override
	public void delectMusicType(MusicType musicType) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		musicTypeMapper = session.getMapper(MusicTypeMapper.class);

		// 调用方法
		musicTypeMapper.delectMusicType(musicType);

		// 提交事务
		session.commit();
		// 关闭资源
		DBGetConnection.closeSqlSession(session);

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
