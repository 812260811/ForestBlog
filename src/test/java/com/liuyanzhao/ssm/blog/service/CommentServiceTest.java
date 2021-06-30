package com.liuyanzhao.ssm.blog.service;

import com.liuyanzhao.ssm.blog.BaseTest;
import com.liuyanzhao.ssm.blog.entity.Comment;
import com.liuyanzhao.ssm.blog.mapper.CommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml", "classpath:spring/spring-mvc.xml", "classpath:mybatis/mybatis-config.xml"})
public class CommentServiceTest {

    @Autowired
    private CommentService commentService;

    @Test
    public void testComment(){

        /*List<Comment> list = commentService.getCommentByUserId(3);
        list.get(1).setCommentAuthorAvatar("/uploads/2021\\6/计算机1.jpg");
        list.get(2).setCommentAuthorAvatar("/uploads/2021\\6/推文1.jpeg");
        int i = commentService.updateBatchComment(list);
        System.out.println(i);*/
    }

}
