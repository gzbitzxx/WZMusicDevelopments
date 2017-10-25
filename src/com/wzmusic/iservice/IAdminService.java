package com.wzmusic.iservice;

import java.util.List;

import com.wzmusic.bean.Admin;
import com.wzmusic.bean.Page;

/**
 * IAdminService
 * @author TongZhou
 *
 */
public interface IAdminService {
	/**
	 * 查询管理员
	 * @param Admin 管理员实体
	 * @return 管理员
	 * @throws Exception
	 */
    public Admin queryAdmins(Admin admin);
    
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
    public boolean addAdmin(Admin admin);
    
    /**
     * 修改管理员
     * @param Admin 修改的管理员实体
     * @throws Exception
     */
    public boolean updateAdmin(Admin admin);
    
    /**
     * 删除管理员
     * @param admin 管理员实体
     * @throws Exception
     */
    public boolean delectAdmin(Admin admin);
    
    /**
     * 分页获取管理员
     * @param page
     * @return
     * @throws Exception
     */
    public List<Admin> getAdminPage(Page page);
}
