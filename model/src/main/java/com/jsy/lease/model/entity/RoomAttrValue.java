package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 房间&基本属性值关联表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("room_attr_value")
    @Schema(name = "RoomAttrValue", description = "房间&基本属性值关联表")
public class RoomAttrValue extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 房间id
            */
            @Schema(description = "房间id")
            @TableField(value = "room_id")
        private Long roomId;
            /**
            * 属性值id
            */
            @Schema(description = "属性值id")
            @TableField(value = "attr_value_id")
        private Long attrValueId;
}