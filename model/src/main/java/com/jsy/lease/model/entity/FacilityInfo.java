package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 配套信息表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("facility_info")
    @Schema(name = "FacilityInfo", description = "配套信息表")
public class FacilityInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 类型（1:公寓图片,2:房间图片）
            */
            @Schema(description = "类型（1:公寓图片,2:房间图片）")
            @TableField(value = "type")
        private Byte type;
            /**
            * 名称
            */
            @Schema(description = "名称")
            @TableField(value = "name")
        private String name;
            @TableField(value = "icon")
        private String icon;
}