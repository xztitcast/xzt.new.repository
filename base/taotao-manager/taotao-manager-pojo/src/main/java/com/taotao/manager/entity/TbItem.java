package com.taotao.manager.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_item")
public class TbItem implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String title;
	
	private String sellPoint;
	
	private Long price;
	
	private Integer num;
	
	private String barcode;
	
	private String image;
	
	private Long cid;
	
	private boolean status;
	
	private Date created;
	
	private Date updated;

	@Id
	@Column(name = "id", nullable = false, columnDefinition = "bigint(20) NOT NULL COMMENT '商品id，同时也是商品编号'")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "title", nullable = false, columnDefinition = "varchar(100) NOT NULL COMMENT '商品标题'")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "sell_point", columnDefinition = "varchar(500) DEFAULT NULL COMMENT '商品卖点'")
	public String getSellPoint() {
		return sellPoint;
	}

	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}

	@Column(name = "price", nullable = false, columnDefinition = "bigint(20) NOT NULL COMMENT '商品价格，单位为：分'")
	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Column(name = "num", nullable = false, columnDefinition = "int(10) NOT NULL COMMENT '库存数量'")
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Column(name = "barcode", columnDefinition = "varchar(30) DEFAULT NULL COMMENT '商品条形码'")
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	@Column(name = "image", columnDefinition = "varchar(500) DEFAULT NULL COMMENT '商品图片'")
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "cid", nullable = false, columnDefinition = "bigint(10) NOT NULL COMMENT '所属类目，叶子类目'")
	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	@Column(name = "status", nullable = false, columnDefinition = "tinyint(4) NOT NULL DEFAULT '1' COMMENT '商品状态，1-正常，2-下架，3-删除'")
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "created", nullable = false, columnDefinition = "datetime NOT NULL COMMENT '创建时间'")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT +8")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "updated", nullable = false, columnDefinition = "datetime NOT NULL COMMENT '更新时间'")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

}