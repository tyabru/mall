package com.xjtu.mall.modules.pms.service;

import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xjtu.mall.dto.ProductConditionDTO;
import com.xjtu.mall.dto.ProductSaveParamsDTO;
import com.xjtu.mall.dto.ProductUpdateInitDTO;
import com.xjtu.mall.modules.pms.model.PmsProduct;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author XuShu
 * @since 2021-02-26
 */
public interface PmsProductService extends IService<PmsProduct> {

    Page list(ProductConditionDTO condition);

    /**
     * 更新 单个字段的公共方法
     * @param publishStatus
     * @param ids
     * @param getPublishStatus
     * @return
     */
    boolean updateStatus(Integer publishStatus, List<Long> ids, SFunction<PmsProduct, ?> getPublishStatus);

    boolean create(ProductSaveParamsDTO productSaveParamsDTO);

    ProductUpdateInitDTO getUpdateInfo(Long id);

    boolean update(ProductSaveParamsDTO productSaveParamsDTO);
}
