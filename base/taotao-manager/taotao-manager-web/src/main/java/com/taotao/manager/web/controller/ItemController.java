package com.taotao.manager.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.manager.entity.TbItem;
import com.taotao.manager.service.ItemService;

/**
 * 滔滔商品控制器
 * @author xiangzuotao
 * @date 2018年3月24日 下午10:32:39
 * @version 1.0.0
 */
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	
	/**
	 * 根据商品id获取商品
	 * @param id
	 * @return
	 */
	@GetMapping("/item/{id}")
	public TbItem getItemById(@PathVariable Long id) {
		TbItem tbItem = itemService.getItemById(id);
		return tbItem;
	}
}
