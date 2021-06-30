package com.liuyanzhao.ssm.blog.mapper;

import com.liuyanzhao.ssm.blog.BaseTest;
import com.liuyanzhao.ssm.blog.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml", "classpath:spring/spring-mvc.xml", "classpath:mybatis/mybatis-config.xml"})
public class CommentMapperTest {
    
    @Autowired
    private CommentMapper commentMapper;
    
    @Test
    public void testComment01(){
        List<Comment> list = commentMapper.getCommentByUserId(3);
        for (Comment l : list) {
            System.out.println(l);
        }
    }

    @Test
    public void testComment02(){

        /*List<Comment> list = commentMapper.getCommentByUserId(3);
        list.get(1).setCommentAuthorAvatar("/uploads/2021\\6/zhenjianzhao(1).jpg");
        int i = commentMapper.updateBatchComment(list);
        System.out.println(i);*/

    }
    
}
