package com.xjtu.mall.modules.pms.mapper;

import com.xjtu.mall.modules.pms.model.PmsProductCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xjtu.mall.dto.HomeMenusDTO;

import java.util.List;

/**
 * <p>
 * 产品分类 Mapper 接口
 * </p>
 *
 * @author XuShu
 * @since 2021-03-14
 */
public interface PmsProductCategoryMapper extends BaseMapper<PmsProductCategory> {

    List<HomeMenusDTO> getProductWithCategory();
}
