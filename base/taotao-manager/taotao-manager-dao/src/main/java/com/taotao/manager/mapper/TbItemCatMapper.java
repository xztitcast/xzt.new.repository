package com.taotao.manager.mapper;

import java.util.List;

import com.taotao.manager.entity.TbItemCat;
/**
 * 商品分类持久层dao
 * @author xiangzuotao
 * @date 2017年10月19日
 * @version 1.0
 */
public interface TbItemCatMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    List<TbItemCat> selectTbItemCatAll();
    
    /**
     * 根据父节点Id查询子节点列表
     * @param parentId
     * @return List<TbItemCat>
     */
    List<TbItemCat> selectTbItemCatByParentId(long parentId);

    TbItemCat selectByPrimaryKey(Long id);

    int updateByPrimaryKey(TbItemCat record);
}