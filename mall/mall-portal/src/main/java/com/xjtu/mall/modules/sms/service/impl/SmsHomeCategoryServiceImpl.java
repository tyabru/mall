package com.xjtu.mall.modules.sms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xjtu.mall.dto.HomeGoodsSaleDTO;
import com.xjtu.mall.modules.sms.mapper.SmsHomeCategoryMapper;
import com.xjtu.mall.modules.sms.model.SmsHomeCategory;
import com.xjtu.mall.modules.sms.service.SmsHomeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XuShu
 * @since 2021-03-16
 */
@Service
public class SmsHomeCategoryServiceImpl extends ServiceImpl<SmsHomeCategoryMapper, SmsHomeCategory> implements SmsHomeCategoryService {

    @Autowired
    SmsHomeCategoryMapper homeCategoryMapper;

    @Override
    public List<HomeGoodsSaleDTO> getGoodsSale() {
        return homeCategoryMapper.getHomeCategoryWithProduct();
    }
}
