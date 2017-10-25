package com.wzmusic.mapper;

import java.util.List;

import com.wzmusic.bean.Comments;
import com.wzmusic.bean.Page;


/**
 * 评论DAO
 * @author TongZhou
 *
 */
public interface CommentsMapper {
	/**
	 * 查询评论信息
	 * @param Comment 评论实体
	 * @return 评论信息
	 * @throws Exception
	 */
    public Comments queryComments(Comments Comment);
    
    /**
     * 获取跑路列表
     * @return 评论的列表
     * @throws Exception
     */
    public List<Comments> getComments();
    
    /**
     * 添加评论
     * @param Comment 评论实体
     * @throws Exception
     */
    public void addComment(Comments Comment) throws Exception;
    
    /**
     * 修改评论
     * @param Comment 评论实体
     * @throws Exception
     */
    public void updateComment(Comments Comment)  throws Exception;
    
    /**
     * 删除评论
     * @param Comment 评论实体类
     * @throws Exception
     */
    public void delectComment(Comments Comment)  throws Exception;
    
    /**
     * 分页获取评论信息
     * @param page
     * @return
     * @throws Exception
     */
    public List<Comments> getCommentPage(Page page);
    
    
}
