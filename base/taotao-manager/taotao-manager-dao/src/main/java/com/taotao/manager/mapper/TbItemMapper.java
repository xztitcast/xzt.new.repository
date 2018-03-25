package com.taotao.manager.mapper;

import java.util.List;

import com.taotao.manager.entity.TbItem;


public interface TbItemMapper {

	/**
	 * 根据主键查询商品信息
	 * @param id 商品id
	 * @return ItemDto 商品对象
	 */
	public TbItem selectByPrimaryKey(Long id);
	
	/**
	 * 查询所有的商品信息
	 * @return List<ItemDto> 商品结果集
	 */
	public List<TbItem> selectItemDtoAll();
	
	/**
	 * 新增商品信息
	 * @param item 商品信息
	 * @return int 新增成功的次数
	 */
	public int insert(TbItem item);
	
	/**
	 * 根据主键更新
	 * @param item
	 * @return
	 */
	public int updateByPrimaryKey(TbItem item);
	
}
