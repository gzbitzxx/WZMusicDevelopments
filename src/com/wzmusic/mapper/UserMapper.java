package com.wzmusic.mapper;

import java.util.List;

import com.wzmusic.bean.Page;
import com.wzmusic.bean.User;

/**
 * 用户DAO
 * @author TongZhou
 *
 */
public interface UserMapper {
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
    public void addUser(User user);
    
    /**
     * 修改用户信息
     * @param user
     * @throws Exception
     */
    public void updateUser(User user)throws Exception;
    
    /**
     * 删除用户信息
     * @param user
     * @throws Exception
     */
    public void delectUser(User user);
    
    /**
     * 分页获取用户
     * @param page
     * @return
     * @throws Exception
     */
    public List<User> getUsersPage(Page page);
}
