package com.wzmusic.iservice;

import java.util.List;

import com.wzmusic.bean.Page;
import com.wzmusic.bean.User;

/**
 * 用户DAO
 * @author TongZhou
 *
 */
public interface IUserService {
	/**
	 * 查询单个用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
    public User queryUsers(User user);
    
    /**
     * 获取用户信息列表
     * @return
     * @throws Exception
     */
    public List<User> getUsers();
    
    /**
     * 添加用户信息
     * @param user
     * @throws Exception
     */
    public boolean addUser(User user);
    
    /**
     * 修改用户信息
     * @param user
     * @throws Exception
     */
    public boolean updateUser(User user);
    
    /**
     * 删除用户信息
     * @param user
     * @throws Exception
     */
    public boolean delectUser(User user);
    
    /**
     * 分页获取用户
     * @param page
     * @return
     * @throws Exception
     */
    public List<User> getUsersPage(Page page);
}
