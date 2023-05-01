package com.xjtu.mall.modules.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xjtu.mall.dto.OrderDetailDTO;
import com.xjtu.mall.dto.OrderListDTO;
import com.xjtu.mall.modules.oms.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author XuShu
 * @since 2021-03-21
 */
public interface OmsOrderMapper extends BaseMapper<OmsOrder> {

    OrderDetailDTO getOrderDetail(Long id);

    IPage<OrderListDTO> getMyOrders(Page<?> page, @Param("memberId") Long memberId);

}
