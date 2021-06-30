package com.liuyanzhao.ssm.blog.service;

import com.liuyanzhao.ssm.blog.BaseTest;
import org.apache.bcel.generic.BASTORE;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.PipedReader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml", "classpath:spring/spring-mvc.xml", "classpath:mybatis/mybatis-config.xml"})
public class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void testCategory(){
        Integer countCategory = categoryService.countCategory();
        System.out.println(countCategory);
    }

}
