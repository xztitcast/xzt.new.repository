package com.taotao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taotao.manager.dao.TbItemDao;
import com.taotao.manager.entity.TbItem;
import com.taotao.manager.service.ItemService;

/**
 * 滔滔商品逻辑服务实现类
 * @author xiangzuotao
 * @date 2018年3月24日 下午10:35:55
 * @version
 */
@Service("itemService")
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemDao tbItemDao;

	@Transactional(readOnly = true)
	@Override
	public TbItem getItemById(Long id) {
		TbItem tbItem = tbItemDao.findOne(id);
		return tbItem;
	}

}
