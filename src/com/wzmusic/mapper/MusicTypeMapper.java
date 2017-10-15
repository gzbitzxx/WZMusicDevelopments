package com.wzmusic.mapper;

import java.util.List;

import com.wzmusic.bean.MusicType;
import com.wzmusic.bean.Page;


public interface MusicTypeMapper {
	/**
	 * 查询音乐类型
	 * @param MusicType
	 * @return
	 * @throws Exception
	 */
    public MusicType queryMusicTypes(MusicType MusicType);
    
    /**
     * 获取音乐列表
     * @return
     * @throws Exception
     */
    public List<MusicType> getMusicTypes();
    
    /**
     * 添加音乐类型
     * @param MusicType
     * @throws Exception
     */
    public void addMusicType(MusicType MusicType);
    
    /**
     * 修改音乐类型
     * @param MusicType
     * @throws Exception
     */
    public void updateMusicType(MusicType MusicType)throws Exception;
    
    /**
     * 删除音乐类型
     * @param MusicType
     * @throws Exception
     */
    public void delectMusicType(MusicType MusicType);
    
    /**
     * 分页获取音乐来那谢谢
     * @param page
     * @return
     * @throws Exception
     */
    public List<MusicType> getMusicTypePage(Page page);
}
