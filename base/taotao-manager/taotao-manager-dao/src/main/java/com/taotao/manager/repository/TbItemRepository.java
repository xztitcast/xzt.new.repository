package com.taotao.manager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.taotao.manager.entity.TbItem;

/**
 * Mongodb
 * @author xiangzuotao
 * @date 2018年3月25日 下午10:23:54
 * @version
 */
public interface TbItemRepository extends MongoRepository<TbItem, Long> {

}
