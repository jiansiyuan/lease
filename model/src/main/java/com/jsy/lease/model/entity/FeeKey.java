package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 杂项费用名称表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("fee_key")
    @Schema(name = "FeeKey", description = "杂项费用名称表")
public class FeeKey extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 付款项key
            */
            @Schema(description = "付款项key")
            @TableField(value = "name")
        private String name;
}