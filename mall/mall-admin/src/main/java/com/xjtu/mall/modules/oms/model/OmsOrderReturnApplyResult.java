package com.xjtu.mall.modules.oms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * Created on 2018/10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
