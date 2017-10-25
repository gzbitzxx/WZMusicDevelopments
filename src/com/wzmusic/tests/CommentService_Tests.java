package com.wzmusic.tests;


import org.junit.Test;

import com.wzmusic.bean.Comments;
import com.wzmusic.bean.Page;
import com.wzmusic.service.CommentsService;

/**
 * 评论的测试类
 * @author TongZhou
 *
 */
public class CommentService_Tests{

	//定义 service 对象
	private CommentsService commentsService=new CommentsService();
	
	/**
	 * 测试查询类
	 */
	@Test
	public void queryComments() {
		
		Comments comment=new Comments();
		comment.setId(3);
		System.out.println(commentsService.queryComments(comment));
		
	}

	/**
	 * 获取评论
	 */
	@Test
	public void getComments() {
	}

	/**
	 * 添加评论
	 */
	@Test
	public void addComment(Comments comment) {
		
	}

	/**
	 * 修改评论
	 */
	@Test
	public void updateComment(Comments comment) {
		
	}

	/**
	 * 删除评论
	 */
	@Test
	public void delectComment() {
		
		
	}

	/**
	 * 分页查询评论
	 */
	@Test
	public void getCommentPage(Page page) {
	}

}
