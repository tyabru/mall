package com.xjtu.mall.modules.oms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xjtu.mall.dto.OrderDetailDTO;
import com.xjtu.mall.dto.OrderListDTO;
import com.xjtu.mall.dto.OrderParamDTO;
import com.xjtu.mall.dto.ConfirmOrderDTO;
import com.xjtu.mall.modules.oms.model.OmsOrder;

import java.util.List;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author XuShu
 * @since 2021-03-21
 */
public interface OmsOrderService extends IService<OmsOrder> {

    /**
     * 初始化确认订单的商品和收货地址信息
     * @param ids
     * @return
     */
    ConfirmOrderDTO generateConfirmOrder(List<Long> ids);

    /**
     * 下单
     * @param paramDTO
     * @return
     */
    OmsOrder generateOrder(OrderParamDTO paramDTO);

    /**
     * 读取下单成功订单详情
     * @param id
     * @return
     */
    OrderDetailDTO getOrderDetail(Long id);

    void cancelOverTimeOrder();

    IPage<OrderListDTO> getMyOrders(Integer pageSize, Integer pageNum);

    /**
     * 支付成功回调
     * @param orderId
     * @param payType
     */
    void paySuccess(Long orderId, Integer payType);
}
