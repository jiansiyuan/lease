package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 杂项费用值表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("fee_value")
    @Schema(name = "FeeValue", description = "杂项费用值表")
public class FeeValue extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 费用value
            */
            @Schema(description = "费用value")
            @TableField(value = "name")
        private String name;
            /**
            * 收费单位
            */
            @Schema(description = "收费单位")
            @TableField(value = "unit")
        private String unit;
            /**
            * 费用所对的fee_key
            */
            @Schema(description = "费用所对的fee_key")
            @TableField(value = "fee_key_id")
        private Long feeKeyId;
}