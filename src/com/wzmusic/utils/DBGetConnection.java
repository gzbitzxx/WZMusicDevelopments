package com.wzmusic.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 这是获取数据库链接和关闭的对象
 * @author TongZhou
 *
 */
public class DBGetConnection {
	/**
	 * 获取 SqlSession 对象
	 * @return SqlSession
	 */
	public static SqlSession getSqlSession(){
		
		//获取 WZMusicMapperConfig.xml 文件流
		InputStream inputStream = DBGetConnection.class.getClassLoader().getResourceAsStream("WZMusicMapperConfig.xml");
		
		//创建 SqlSessionFactory 工厂
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		//返回 SqlSession 对象
		return sessionFactory.openSession();
	}
	
	/**
	 * 关闭数据库链接
	 * @param session
	 */
	public static void closeSqlSession(SqlSession session){
		
		//关闭 session
		session.close();
	}
}
