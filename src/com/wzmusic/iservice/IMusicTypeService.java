package com.wzmusic.iservice;

import java.util.List;

import com.wzmusic.bean.MusicType;
import com.wzmusic.bean.Page;

/**
 * IMusicTypeService
 * @author TongZhou
 *
 */
public interface IMusicTypeService {
	/**
	 * 查询音乐类型
	 * @param MusicType
	 * @return
	 * @throws Exception
	 */
    public MusicType queryMusicTypes(MusicType musicType);
    
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
    public boolean addMusicType(MusicType musicType);
    
    /**
     * 修改音乐类型
     * @param MusicType
     * @throws Exception
     */
    public boolean updateMusicType(MusicType musicType);
    
    /**
     * 删除音乐类型
     * @param MusicType
     * @throws Exception
     */
    public boolean delectMusicType(MusicType musicType);
    
    /**
     * 分页获取音乐来那谢谢
     * @param page
     * @return
     * @throws Exception
     */
    public List<MusicType> getMusicTypePage(Page page);
}
