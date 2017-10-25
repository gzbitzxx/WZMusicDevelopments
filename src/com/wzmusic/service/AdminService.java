package com.wzmusic.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzmusic.bean.Admin;
import com.wzmusic.bean.Page;
import com.wzmusic.iservice.IAdminService;
import com.wzmusic.mapper.AdminMapper;
import com.wzmusic.utils.DBGetConnection;

/**
 * Admin服务层
 * 
 * @author TongZhou
 *
 */
public class AdminService implements IAdminService {

	//定义 SqlSession
	private SqlSession session = null;

	//定义 Mapper 对象
	private AdminMapper adminMapper = null;

	/**
	 * 返回管理员列表
	 * 
	 * @return 管理员list
	 */
	@Override
	public List<Admin> getAdmins() {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);

		// 调用 getAdmins
		List<Admin> admin = adminMapper.getAdmins();

		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		// 返回 List
		return admin;
	}

	@Override
	public boolean addAdmin(Admin Admin) {
		
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);
		
		// 返回结果
		boolean result=false;

		// 添加管理员
		try {
			adminMapper.addAdmin(Admin);
			result=true;
		} catch (Exception e) {
			e.printStackTrace();		}
		
		//提交事务
		session.commit();
		
		// 关闭连接
		DBGetConnection.closeSqlSession(session);
		
		return result;

	}

	@Override
	public boolean updateAdmin(Admin admin) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);

		// 返回结果
				boolean result=false;
		
		// 添加管理员
		try {
			adminMapper.updateAdmin(admin);
			
			result=true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		//提交事务
		session.commit();
		
		// 关闭连接
		DBGetConnection.closeSqlSession(session);
		
		return result;

	}

	@Override
	public boolean delectAdmin(Admin admin) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);
		
		// 返回结果
				boolean result=false;

		// 删除管理员
		try {
			adminMapper.delectAdmin(admin);
			
			result=true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//提交事务
		session.commit();
		
		// 关闭连接
		DBGetConnection.closeSqlSession(session);
		
		return result;

	}

	@Override
	public List<Admin> getAdminPage(Page page) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);

		// 查询管理员
		List<Admin> admins = adminMapper.getAdminPage(page);

		// 关闭连接
		DBGetConnection.closeSqlSession(session);
		
		return admins;
	}

	/**
	 * 查询管理员信息
	 * 
	 * @param admin
	 *            输入的管理员信息
	 */
	@Override
	public Admin queryAdmins(Admin admin) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);

		// 调用queryAdmins
		Admin reulet = adminMapper.queryAdmins(admin);

		// 关闭资源
		DBGetConnection.closeSqlSession(session);

		// 返回 Admin
		return reulet;
	}
}
