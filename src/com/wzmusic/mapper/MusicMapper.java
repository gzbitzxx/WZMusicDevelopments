package com.wzmusic.mapper;

import java.util.List;

import com.wzmusic.bean.Music;
import com.wzmusic.bean.Page;

/**
 * 音乐DAO
 * @author TongZhou
 *
 */

public interface MusicMapper {
	/**
	 * 查询音乐信息
	 * @param Music 音乐信息实体
	 * @return
	 * @throws Exception
	 */
    public Music queryMusics(Music Music);
    
    /**
     * 获取音乐列表
     * @return
     * @throws Exception
     */
    public List<Music> getMusics();
    
    /**
     * 添加音乐
     * @param Music
     * @throws Exception
     */
    public void addMusic(Music Music)  throws Exception;
    
    /**
     * 修改音乐
     * @param Music
     * @throws Exception
     */
    public void updateMusic(Music Music)  throws Exception;
    
    /**
     * 删除音乐
     * @param Music
     * @throws Exception
     */
    public void delectMusic(Music Music)  throws Exception;
    
    /**
     * 分页获取音乐
     * @param page
     * @return
     * @throws Exception
     */
    public List<Music> getMusicsPage(Page page);
}
