package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 租期
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("lease_term")
    @Schema(name = "LeaseTerm", description = "租期")
public class LeaseTerm extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 租期
            */
            @Schema(description = "租期")
            @TableField(value = "month_count")
        private Integer monthCount;
            /**
            * 租期单位
            */
            @Schema(description = "租期单位")
            @TableField(value = "unit")
        private String unit;
}