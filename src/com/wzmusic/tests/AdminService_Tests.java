package com.wzmusic.tests;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.wzmusic.bean.Admin;
import com.wzmusic.bean.Page;
import com.wzmusic.iservice.IAdminService;
import com.wzmusic.iservice.IArticleService;
import com.wzmusic.mapper.AdminMapper;
import com.wzmusic.service.AdminService;
import com.wzmusic.utils.DBGetConnection;

/**
 * 这是 Admin 的测试类
 * @author TongZhou
 *
 */
public class AdminService_Tests{
	
	//定义 service 对象
	private AdminService adminService =new AdminService();
	
	
	/**
	 * 测试获取管理员
	 * @throws Exception
	 */
	@Test
	public void getAdmin_test(){
		System.out.println(adminService.getAdmins());
	}
	
	/**
	 *  查询管理员信息
	 */
	@Test
	public void queryAdmin_test() {
		Admin admin=new Admin();
		admin.setId(1);
		Admin reulet=adminService.queryAdmins(admin);
		System.out.println(reulet.toString());
	}

	

	/**
	 * 测试添加管理员
	 */
	@Test
	public void addAdmin_test() {
		
		Admin admin=new Admin();
		admin.setAccoutNumber("HELLO");
		String IP=null;
		try {
			IP =  InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		admin.setLoginIP(IP);
		admin.setPassword("Hello");
		admin.setRealName("HEOO");
		adminService.addAdmin(admin);
		System.out.println(adminService.getAdmins().toString());
		
	}

	/**
	 * 测试修改管理
	 */
	@Test
	public void updateAdmin_test() {
		Admin admin=new Admin();
		admin.setId(12);
		admin.setRealName("周兴兴");
		admin.setAccoutNumber("Hello1111");
		admin.setPassword("1244255");
		admin.setLoginIP("127.2.2.2");
		adminService.updateAdmin(admin);
		
	}

	/**
	 *  测试删除管理员
	 */
	@Test
	public void delectAdmin_test() {
		Admin admin=new Admin();
		admin.setId(17);
		adminService.delectAdmin(admin);
		
	}

	/**
	 * 测试分页获取管理员
	 */
	@Test
	public void getAdminPage_test() {
		Page page=new Page();
		page.setCurrentPage(1);
		page.setPageSize(5);
		System.out.println(adminService.getAdminPage(page).toString());
	}
	
	
}
