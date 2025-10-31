package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 公寓&杂费关联表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("apartment_fee_value")
    @Schema(name = "ApartmentFeeValue", description = "公寓&杂费关联表")
public class ApartmentFeeValue extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 公寓id
            */
            @Schema(description = "公寓id")
            @TableField(value = "apartment_id")
        private Long apartmentId;
            /**
            * 收费项value_id
            */
            @Schema(description = "收费项value_id")
            @TableField(value = "fee_value_id")
        private Long feeValueId;
}