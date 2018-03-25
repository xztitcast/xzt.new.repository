package com.taotao.manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taotao.manager.entity.TbItem;

/**
 * 滔滔商品持久dao接口
 * @author xiangzuotao
 * @date 2018年3月24日 下午10:38:25
 * @version 1.0.0
 */
public interface TbItemDao extends JpaRepository<TbItem, Long> {

}
