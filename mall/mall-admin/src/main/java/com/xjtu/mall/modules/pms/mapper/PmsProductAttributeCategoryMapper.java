package com.xjtu.mall.modules.pms.mapper;

import com.xjtu.mall.dto.ProductAttributeCateDTO;
import com.xjtu.mall.modules.pms.model.PmsProductAttributeCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


/**
 * <p>
 * 产品属性分类表 Mapper 接口
 * </p>
 *
 * @author XuShu
 * @since 2021-02-26
 */
public interface PmsProductAttributeCategoryMapper extends BaseMapper<PmsProductAttributeCategory> {

    List<ProductAttributeCateDTO> getListWithAttr();
}
