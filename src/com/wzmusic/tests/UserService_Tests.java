package com.wzmusic.tests;

import java.util.List;

import org.junit.Test;

import com.wzmusic.bean.Page;
import com.wzmusic.bean.User;
import com.wzmusic.service.UserService;

/**
 * 用户的测试类
 * @author TongZhou
 *
 */
public class UserService_Tests{

	//定义 Service 类
	UserService userService=new UserService();
	
	@Test
	public void queryUsers() {
		User user=new User();
		user.setId(24);
		System.out.println(userService.queryUsers(user));
	}

	@Test
	public void getUsers() {
		System.out.println(userService.getUsers());
		
	}

	@Test
	public void addUser() {
		User user=new User();
		
	}

	@Test
	public void updateUser() {
		User user=new User();
		
	}

	@Test
	public void delectUser() {
		User user=new User();
		user.setId(51);
		
	}

	@Test
	public void getUsersPage() {
		Page page=new Page();
		page.setCurrentPage(1);
		page.setPageSize(10);
		System.out.println(userService.getUsersPage(page));
	}

}
