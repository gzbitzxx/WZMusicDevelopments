package com.wzmusic.iservice;

import java.util.List;

import com.wzmusic.bean.Music;
import com.wzmusic.bean.Page;

/**
 * IMusicService
 * @author TongZhou
 *
 */

public interface IMusicService {
	/**
	 * 查询音乐信息
	 * @param Music 音乐信息实体
	 * @return
	 * @throws Exception
	 */
    public Music queryMusics(Music music);
    
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
    public boolean addMusic(Music music);
    
    /**
     * 修改音乐
     * @param Music
     * @throws Exception
     */
    public boolean updateMusic(Music music);
    
    /**
     * 删除音乐
     * @param Music
     * @throws Exception
     */
    public boolean delectMusic(Music music);
    
    /**
     * 分页获取音乐
     * @param page
     * @return
     * @throws Exception
     */
    public List<Music> getMusicsPage(Page page);
}
