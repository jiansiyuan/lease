package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("province_info")
    @Schema(name = "ProvinceInfo", description = "")
public class ProvinceInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 省份名称
            */
            @Schema(description = "省份名称")
            @TableField(value = "name")
        private String name;
}