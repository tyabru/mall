package com.xjtu.mall.modules.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xjtu.mall.modules.sms.model.SmsHomeCategory;
import com.xjtu.mall.dto.HomeGoodsSaleDTO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author XuShu
 * @since 2021-03-16
 */
public interface SmsHomeCategoryMapper extends BaseMapper<SmsHomeCategory> {

    List<HomeGoodsSaleDTO> getHomeCategoryWithProduct();
}
