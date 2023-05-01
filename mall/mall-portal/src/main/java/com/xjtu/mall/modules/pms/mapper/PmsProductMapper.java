package com.xjtu.mall.modules.pms.mapper;

import com.xjtu.mall.modules.pms.model.PmsProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xjtu.mall.dto.ProductDetailDTO;

/**
 * <p>
 * 商品信息 Mapper 接口
 * </p>
 *
 * @author XuShu
 * @since 2021-03-14
 */
public interface PmsProductMapper extends BaseMapper<PmsProduct> {

    ProductDetailDTO getProductDetail(Long id);
}
