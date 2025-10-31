package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
* <p>
    * 预约看房信息表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("view_appointment")
    @Schema(name = "ViewAppointment", description = "预约看房信息表")
public class ViewAppointment extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 用户id
            */
            @Schema(description = "用户id")
            @TableField(value = "user_id")
        private Long userId;
            /**
            * 用户姓名
            */
            @Schema(description = "用户姓名")
            @TableField(value = "name")
        private String name;
            /**
            * 用户手机号码
            */
            @Schema(description = "用户手机号码")
            @TableField(value = "phone")
        private String phone;
            /**
            * 公寓id
            */
            @Schema(description = "公寓id")
            @TableField(value = "apartment_id")
        private Integer apartmentId;
            /**
            * 预约时间
            */
            @Schema(description = "预约时间")
            @TableField(value = "appointment_time")
        private LocalDateTime appointmentTime;
            /**
            * 备注信息
            */
            @Schema(description = "备注信息")
            @TableField(value = "additional_info")
        private String additionalInfo;
            /**
            * 预约状态（1:待看房，2:已取消，3已看房）
            */
            @Schema(description = "预约状态（1:待看房，2:已取消，3已看房）")
            @TableField(value = "appointment_status")
        private Byte appointmentStatus;
}