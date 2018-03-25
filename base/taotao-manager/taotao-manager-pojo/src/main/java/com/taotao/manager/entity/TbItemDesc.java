package com.taotao.manager.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_item_desc")
public class TbItemDesc implements Serializable{
  
	private static final long serialVersionUID = 1L;

	private Long id;

    private Date created;

    private Date updated;

    private String itemDesc;

    @Id
    @Column(name = "id", nullable = false, columnDefinition = "bigint(20) NOT NULL COMMENT '商品ID'")
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "created", columnDefinition = "datetime DEFAULT NULL COMMENT '创建时间'")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name = "updated", columnDefinition = "datetime DEFAULT NULL COMMENT '更新时间'")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Column(name = "item_desc", columnDefinition = "text COMMENT '商品描述'")
    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}