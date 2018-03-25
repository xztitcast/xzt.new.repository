package com.taotao.manager.service;

import com.taotao.manager.entity.TbItem;

/**
 * 滔滔商品逻辑服务接口
 * @author xiangzuotao
 * @date 2018年3月24日 下午10:34:06
 * @version 1.0.0
 */
public interface ItemService {

	/**
	 * 根据商品id获取商品
	 * @param id
	 * @return
	 */
	public TbItem getItemById(Long id);
}
