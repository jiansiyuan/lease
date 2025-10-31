package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 房间&配套关联表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("room_facility")
    @Schema(name = "RoomFacility", description = "房间&配套关联表")
public class RoomFacility extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 房间id
            */
            @Schema(description = "房间id")
            @TableField(value = "room_id")
        private Long roomId;
            /**
            * 房间设施id
            */
            @Schema(description = "房间设施id")
            @TableField(value = "facility_id")
        private Long facilityId;
}