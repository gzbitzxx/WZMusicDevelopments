package com.wzmusic.iservice;

import java.util.List;

import com.wzmusic.bean.Comments;
import com.wzmusic.bean.Page;


/**
 * ICommentsService
 * @author TongZhou
 *
 */
public interface ICommentsService {
	/**
	 * 查询评论信息
	 * @param Comment 评论实体
	 * @return 评论信息
	 * @throws Exception
	 */
    public Comments queryComments(Comments comment);
    
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
    public void addComment(Comments comment);
    
    /**
     * 修改评论
     * @param Comment 评论实体
     * @throws Exception
     */
    public void updateComment(Comments comment);
    
    /**
     * 删除评论
     * @param Comment 评论实体类
     * @throws Exception
     */
    public void delectComment(Comments comment);
    
    /**
     * 分页获取评论信息
     * @param page
     * @return
     * @throws Exception
     */
    public List<Comments> getCommentPage(Page page);
    
    
}
