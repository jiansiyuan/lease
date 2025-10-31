package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
* <p>
    * 房间信息表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("room_info")
    @Schema(name = "RoomInfo", description = "房间信息表")
public class RoomInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 房间号
            */
            @Schema(description = "房间号")
            @TableField(value = "room_number")
        private String roomNumber;
            /**
            * 租金（元/月）
            */
            @Schema(description = "租金（元/月）")
            @TableField(value = "rent")
        private BigDecimal rent;
            /**
            * 所属公寓id
            */
            @Schema(description = "所属公寓id")
            @TableField(value = "apartment_id")
        private Long apartmentId;
            /**
            * 是否发布
            */
            @Schema(description = "是否发布")
            @TableField(value = "is_release")
        private Byte isRelease;
}