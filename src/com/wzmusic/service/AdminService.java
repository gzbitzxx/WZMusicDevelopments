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
	public void addAdmin(Admin Admin) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);

		// 添加管理员
		adminMapper.addAdmin(Admin);
		
		//提交事务
		session.commit();
		
		// 关闭连接
		DBGetConnection.closeSqlSession(session);

	}

	@Override
	public void updateAdmin(Admin admin) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);

		// 添加管理员
		adminMapper.updateAdmin(admin);

		//提交事务
		session.commit();
		
		// 关闭连接
		DBGetConnection.closeSqlSession(session);

	}

	@Override
	public void delectAdmin(Admin admin) {
		// 获取 SqlSession
		session = DBGetConnection.getSqlSession();

		// 加载 Mapper
		adminMapper = session.getMapper(AdminMapper.class);

		// 删除管理员
		adminMapper.delectAdmin(admin);
		
		//提交事务
		session.commit();
		// 关闭连接
		DBGetConnection.closeSqlSession(session);

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
