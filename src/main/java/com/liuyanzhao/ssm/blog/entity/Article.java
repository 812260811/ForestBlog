package com.liuyanzhao.ssm.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author liuyanzhao
 */
@Data
public class Article implements Serializable{

    //实现Serializable接口的目的是为类可持久化，比如在网络传输或本地存储，为系统的分布和异构部署提供先决条件。
    //若没有序列化，现在我们所熟悉的远程调用，对象数据库都不可能存在。
    /**
     * 序列化操作时会把系统当前类的serialVersionUID写入到序列化文件中，当反序列化时系统会自动检测文件中的serialVersionUID，判断它是否与当前类中的serialVersionUID一致。
     * 如果一致说明序列化文件的版本与当前类的版本是一样的，可以反序列化成功，否则就失败；
     */
    private static final long serialVersionUID = 5207865247400761539L;

    private Integer articleId;

    private Integer articleUserId;

    private String articleTitle;

    private Integer articleViewCount;

    private Integer articleCommentCount;

    private Integer articleLikeCount;

    private Date articleCreateTime;

    private Date articleUpdateTime;

    private Integer articleIsComment;

    private Integer articleStatus;

    private Integer articleOrder;

    private String articleContent;

    private String articleSummary;

    private String articleThumbnail;

    private User user;

    //文章包含的标签
    private List<Tag> tagList;

    //文章的分类
    private List<Category> categoryList;

}