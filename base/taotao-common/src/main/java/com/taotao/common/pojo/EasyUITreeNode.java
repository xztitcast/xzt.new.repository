package com.taotao.common.pojo;

import java.io.Serializable;

/**
 * 树形节点对象
 * @author xiangzuotao
 * @date 2017年12月29日 下午9:41:22
 * @version
 */
public class EasyUITreeNode implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String text;
	
	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
