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
    @TableName("district_info")
    @Schema(name = "DistrictInfo", description = "")
public class DistrictInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 区域名称
            */
            @Schema(description = "区域名称")
            @TableField(value = "name")
        private String name;
            /**
            * 所属城市id
            */
            @Schema(description = "所属城市id")
            @TableField(value = "city_id")
        private Integer cityId;
}