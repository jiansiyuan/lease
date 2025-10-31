package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 房间&支付方式关联表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("room_payment_type")
    @Schema(name = "RoomPaymentType", description = "房间&支付方式关联表")
public class RoomPaymentType extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 房间id
            */
            @Schema(description = "房间id")
            @TableField(value = "room_id")
        private Long roomId;
            /**
            * 支付类型id
            */
            @Schema(description = "支付类型id")
            @TableField(value = "payment_type_id")
        private Long paymentTypeId;
}