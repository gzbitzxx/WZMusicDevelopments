package com.wzmusic.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzmusic.bean.Music;
import com.wzmusic.bean.Page;
import com.wzmusic.iservice.IMusicService;
import com.wzmusic.mapper.MusicMapper;
import com.wzmusic.utils.DBGetConnection;

/**
 * 音乐 Service
 * 
 * @author TongZhou
 *
 */
public class MusicService implements IMusicService {

	// 定义 SqlSession
	private SqlSession session = null;

	// 定义 Mapper 对象
	private MusicMapper musicMapper;

	/**
	 * 查询音乐信息
	 */
	@Override
	public Music queryMusics(Music music) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Music 对象
		musicMapper = session.getMapper(MusicMapper.class);

		// 建立 Music 对象
		Music result = musicMapper.queryMusics(music);

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

		// 返回结果
		return result;
	}

	/**
	 * 获取音乐列表
	 */
	@Override
	public List<Music> getMusics() {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Music 对象
		musicMapper = session.getMapper(MusicMapper.class);

		// 调用方法获取音乐
		List<Music> result = musicMapper.getMusics();

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

		// 返回结果
		return result;
	}

	/**
	 * 添加音乐
	 */
	@Override
	public boolean addMusic(Music music) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Music 对象
		musicMapper = session.getMapper(MusicMapper.class);
		
		//返回结果
				boolean result=false;

		// 调用 add 方法
		try {
			musicMapper.addMusic(music);
			
			result=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 // 提交事务
		session.commit();

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);
		
		return  result;
	}

	/**
	 * 修改音乐
	 */
	@Override
	public boolean updateMusic(Music music) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Music 对象
		musicMapper = session.getMapper(MusicMapper.class);
		
		//返回结果
				boolean result=false;

		// 调用修改方法
		try {
			musicMapper.updateMusic(music);
			
			result =true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 提交事务
		session.commit();
		
		// 关闭 资源
		DBGetConnection.closeSqlSession(session);
		
		return result;
		
	}

	/**
	 * 删除音乐
	 */
	@Override
	public boolean delectMusic(Music music) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Music 对象
		musicMapper = session.getMapper(MusicMapper.class);
		
		//返回结果
				boolean result=false;

		// 调用删除方法
		try {
			musicMapper.delectMusic(music);
			
			result=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 提交事务
		session.commit();
		
		// 关闭 资源
		DBGetConnection.closeSqlSession(session);
		
		return result;
	}

	/**
	 * 分页获取音乐
	 */
	@Override
	public List<Music> getMusicsPage(Page page) {

		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Music 对象
		musicMapper = session.getMapper(MusicMapper.class);

		// 调用分页方法
		List<Music> result = musicMapper.getMusicsPage(page);

		// 关闭 资源
		DBGetConnection.closeSqlSession(session);

		// 返回结果
		return result;
	}

}
