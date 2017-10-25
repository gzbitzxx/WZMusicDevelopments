package com.wzmusic.mapper;

import java.util.List;

import com.wzmusic.bean.MyMusicType;

/**
 * 我的音乐类型
 * @author TongZhou
 *
 */
public interface MyMusicTypeMapper {
	
	/**
	 * 查询我的音乐类型
	 * @param MyMusicType
	 * @return
	 * @throws Exception
	 */
    public MyMusicType queryMyMusicTypes(MyMusicType MyMusicType);
    
    /**
     * 获取我的音乐类型列表
     * @return
     * @throws Exception
     */
    public List<MyMusicType> getMyMusicTypes();
    
    /**
     * 添加我的音乐类型
     * @param MyMusicType
     * @throws Exception
     */
    public void addMyMusicType(MyMusicType MyMusicType) throws Exception;
    
    /**
     * 修改我的音乐类型
     * @param MyMusicType
     * @throws Exception
     */
    public void updateMyMusicType(MyMusicType MyMusicType) throws Exception;
    
    /**
     * 删除我的音乐类型
     * @param MyMusicType
     * @throws Exception
     */
    public void delectMyMusicType(MyMusicType MyMusicType) throws Exception;
    
    /**
     * 获取我的音乐类型
     * @param MyMusicType
     * @return
     * @throws Exception
     */
    public List<MyMusicType> queryMyselfMyMusicTypes(MyMusicType MyMusicType);
}
