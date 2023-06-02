package com.xjtu.mall.modules.oms.mapper;


import com.xjtu.mall.modules.oms.model.OmsOrderReturnApply;
import com.xjtu.mall.modules.oms.model.OmsOrderReturnApplyResult;
import com.xjtu.mall.modules.oms.model.OmsReturnApplyQueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单退货申请自定义Dao
 * Created on 2018/10/18.
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
