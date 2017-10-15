package com.wzmusic.iservice;

import java.util.List;

import com.wzmusic.bean.Page;

/**
 * 基础的 service 接口
 * @author TongZhou
 *
 * @param <T>  传入的实体
 */
public interface IBaseService<T> {
	/**
	 * 查询泛型
	 * @param t 泛型实体
	 * @return 泛型
	 * @throws Exception
	 */
    public T query(T t);
    
    /**
     * 获取泛型
     * @return 泛型列表
     * @throws Exception
     */
    public List<T> getlist();
    
    /**
     * 添加泛型
     * @param Admin 添加管理实体
     * @throws Exception
     */
    public void add(T t);
    
    /**
     * 修改泛型
     * @param Admin 修改的泛型实体
     * @throws Exception
     */
    public void updateT(T t);
    
    /**
     * 删除泛型
     * @param admin 泛型实体
     * @throws Exception
     */
    public void delect(T t);
    
    /**
     * 分页获取泛型
     * @param page
     * @return
     * @throws Exception
     */
    public List<T> getListByPage(Page page);
}
