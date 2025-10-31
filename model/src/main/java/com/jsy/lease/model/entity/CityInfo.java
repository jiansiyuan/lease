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
    @TableName("city_info")
    @Schema(name = "CityInfo", description = "")
public class CityInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 城市名称
            */
            @Schema(description = "城市名称")
            @TableField(value = "name")
        private String name;
            /**
            * 所属省份id
            */
            @Schema(description = "所属省份id")
            @TableField(value = "province_id")
        private Integer provinceId;
}