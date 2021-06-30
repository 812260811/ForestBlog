package com.liuyanzhao.ssm.blog.mapper;


import com.liuyanzhao.ssm.blog.BaseTest;
import com.liuyanzhao.ssm.blog.entity.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryMapperTest extends BaseTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testCategory(){
        Category category = categoryMapper.getCategoryById(10);
        System.out.println(category);
    }

}
