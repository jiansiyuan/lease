package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 房间&标签关联表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("room_label")
    @Schema(name = "RoomLabel", description = "房间&标签关联表")
public class RoomLabel extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 房间id
            */
            @Schema(description = "房间id")
            @TableField(value = "room_id")
        private Long roomId;
            /**
            * 标签id
            */
            @Schema(description = "标签id")
            @TableField(value = "label_id")
        private Long labelId;
}