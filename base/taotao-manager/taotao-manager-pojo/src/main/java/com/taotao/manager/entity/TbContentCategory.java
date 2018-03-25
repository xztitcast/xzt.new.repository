package com.taotao.manager.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 内容分类管理对象
 * @author xiangzuotao
 * @date 2017年12月29日 下午9:57:58
 * @version
 */
@Entity
@Table(name = "tb_content_category")
public class TbContentCategory implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Date created;

    private Date updated;

    @Id
    @Column(name = "id", nullable = false, columnDefinition = "bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "parent_id", columnDefinition = "bigint(20) DEFAULT NULL COMMENT '父类目ID=0时，代表的是一级的类目'")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Column(name = "name", columnDefinition = "varchar(50) DEFAULT NULL COMMENT '分类名称'")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Column(name = "status", columnDefinition = "int(1) DEFAULT '1' COMMENT '状态。可选值:1(正常),2(删除)'")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "sort_order", columnDefinition = "int(4) DEFAULT NULL COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数'")
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Column(name = "is_parent", nullable = false, columnDefinition = "tinyint(1) DEFAULT '1' COMMENT '该类目是否为父类目，1为true，0为false'")
    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    @Column(name = "created", columnDefinition = "datetime DEFAULT NULL COMMENT '创建时间'")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name = "updated", columnDefinition = "datetime DEFAULT NULL COMMENT '创建时间'")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}