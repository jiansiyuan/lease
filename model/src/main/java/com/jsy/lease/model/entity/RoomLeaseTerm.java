package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 房间租期管理表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("room_lease_term")
    @Schema(name = "RoomLeaseTerm", description = "房间租期管理表")
public class RoomLeaseTerm extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 房间id
            */
            @Schema(description = "房间id")
            @TableField(value = "room_id")
        private Long roomId;
            /**
            * 租期id
            */
            @Schema(description = "租期id")
            @TableField(value = "lease_term_id")
        private Long leaseTermId;
}