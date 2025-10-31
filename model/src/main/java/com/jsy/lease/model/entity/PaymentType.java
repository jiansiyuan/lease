package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 支付方式表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("payment_type")
    @Schema(name = "PaymentType", description = "支付方式表")
public class PaymentType extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 付款方式名称
            */
            @Schema(description = "付款方式名称")
            @TableField(value = "name")
        private String name;
            /**
            * 每次支付租期数
            */
            @Schema(description = "每次支付租期数")
            @TableField(value = "pay_month_count")
        private Integer payMonthCount;
            /**
            * 付费说明
            */
            @Schema(description = "付费说明")
            @TableField(value = "additional_info")
        private String additionalInfo;
}