package com.wzmusic.iservice;

import java.util.List;

import com.wzmusic.bean.MyMusicType;

/**
 * IMyMusicTypeService
 * @author TongZhou
 *
 */
public interface IMyMusicTypeService {
	
	/**
	 * 查询我的音乐类型
	 * @param MyMusicType
	 * @return
	 * @throws Exception
	 */
    public MyMusicType queryMyMusicTypes(MyMusicType myMusicType);
    
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
    public void addMyMusicType(MyMusicType myMusicType);
    
    /**
     * 修改我的音乐类型
     * @param MyMusicType
     * @throws Exception
     */
    public void updateMyMusicType(MyMusicType myMusicType);
    
    /**
     * 删除我的音乐类型
     * @param MyMusicType
     * @throws Exception
     */
    public void delectMyMusicType(MyMusicType myMusicType);
    
    /**
     * 获取我的音乐类型
     * @param MyMusicType
     * @return
     * @throws Exception
     */
    public List<MyMusicType> queryMyselfMyMusicTypes(MyMusicType myMusicType);
}
