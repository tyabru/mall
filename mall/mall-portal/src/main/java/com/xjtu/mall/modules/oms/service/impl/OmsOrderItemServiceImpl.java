package com.xjtu.mall.modules.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xjtu.mall.modules.oms.mapper.OmsOrderItemMapper;
import com.xjtu.mall.modules.oms.model.OmsOrderItem;
import com.xjtu.mall.modules.oms.service.OmsOrderItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author XuShu
 * @since 2021-03-21
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService {

}
