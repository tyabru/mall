package com.xjtu.mall.modules.pms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xjtu.mall.dto.ProductAttributeCateDTO;
import com.xjtu.mall.modules.pms.model.PmsProductAttributeCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author XuShu
 * @since 2021-02-26
 */
public interface PmsProductAttributeCategoryService extends IService<PmsProductAttributeCategory> {

    Page list(Integer pageNum, Integer pageSize);

    boolean add(PmsProductAttributeCategory productAttributeCategory);

    List<ProductAttributeCateDTO> getListWithAttr();
}
