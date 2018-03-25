package com.taotao.manager.mapper;


import java.util.List;

import com.taotao.manager.entity.TbItemDesc;

public interface TbItemDescMapper {

    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDesc record);
    
    List<TbItemDesc> selectItemDescDtoAll();

    TbItemDesc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKey(TbItemDesc record);
}