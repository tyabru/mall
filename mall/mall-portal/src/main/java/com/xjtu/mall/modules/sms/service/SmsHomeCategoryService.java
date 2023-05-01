package com.xjtu.mall.modules.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xjtu.mall.dto.HomeGoodsSaleDTO;
import com.xjtu.mall.modules.sms.model.SmsHomeCategory;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XuShu
 * @since 2021-03-16
 */
public interface SmsHomeCategoryService extends IService<SmsHomeCategory> {

    List<HomeGoodsSaleDTO> getGoodsSale();
}
