package com.xjtu.mall.modules.pms.mapper;

import com.xjtu.mall.dto.RelationAttrInfoDTO;
import com.xjtu.mall.modules.pms.model.PmsProductAttribute;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品属性参数表 Mapper 接口
 * </p>
 *
 * @author XuShu
 * @since 2021-02-26
 */
public interface PmsProductAttributeMapper extends BaseMapper<PmsProductAttribute> {

    List<RelationAttrInfoDTO> getRelationAttrInfoByCid(Long cId);
}
