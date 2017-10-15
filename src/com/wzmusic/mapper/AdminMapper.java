package com.wzmusic.mapper;

import java.util.List;

import com.wzmusic.bean.Admin;
import com.wzmusic.bean.Page;

/**
 * Admin Dao
 * @author TongZhou
 *
 */
public interface AdminMapper{
	/**
	 * 查询管理员
	 * @param Admin 管理员实体
	 * @return 管理员
	 * @throws Exception
	 */
    public Admin queryAdmins(Admin Admin);
    
    /**
     * 获取管理员
     * @return 管理员列表
     * @throws Exception
     */
    public List<Admin> getAdmins();
    
    /**
     * 添加管理员
     * @param Admin 添加管理实体
     * @throws Exception
     */
    public void addAdmin(Admin Admin);
    
    /**
     * 修改管理员
     * @param Admin 修改的管理员实体
     * @throws Exception
     */
    public void updateAdmin(Admin Admin);
    
    /**
     * 删除管理员
     * @param admin 管理员实体
     * @throws Exception
     */
    public void delectAdmin(Admin admin);
    
    /**
     * 分页获取管理员
     * @param page
     * @return
     * @throws Exception
     */
    public List<Admin> getAdminPage(Page page);
}
