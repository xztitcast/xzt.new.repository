package com.taotao.manager.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 内容管理对象
 * @author xiangzuotao
 * @date 2017年12月29日 下午9:57:38
 * @version
 */
@Entity
@Table(name = "tb_content")
public class TbContent implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;

    private Long categoryId;

    private String title;

    private String subTitle;

    private String titleDesc;

    private String url;

    private String pic;

    private String pic2;

    private Date created;

    private Date updated;

    private String content;

    @Id
    @Column(name = "id", nullable = false, columnDefinition = "bigint(20) NOT NULL AUTO_INCREMENT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "category_id", nullable = false, columnDefinition = "bigint(20) NOT NULL COMMENT '内容类目ID'")
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "title", columnDefinition = "varchar(200) DEFAULT NULL COMMENT '内容标题'")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    
    @Column(name = "sub_title", columnDefinition = "varchar(100) DEFAULT NULL COMMENT '子标题'")
    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    @Column(name = "title_desc", columnDefinition = "varchar(500) DEFAULT NULL COMMENT '标题描述'")
    public String getTitleDesc() {
        return titleDesc;
    }

    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc == null ? null : titleDesc.trim();
    }

    @Column(name = "url", columnDefinition = "varchar(500) DEFAULT NULL COMMENT '链接'")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Column(name = "pic", columnDefinition = "varchar(300) DEFAULT NULL COMMENT '图片绝对路径'")
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    @Column(name = "pic2", columnDefinition = "varchar(300) DEFAULT NULL COMMENT '图片2'")
    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    @Column(name = "created", columnDefinition = "datetime DEFAULT NULL")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name = "updated", columnDefinition = "datetime DEFAULT NULL")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Column(name = "content", columnDefinition = "text COMMENT '内容'")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}