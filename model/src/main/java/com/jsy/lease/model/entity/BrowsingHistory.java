package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
* <p>
    * 浏览历史
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("browsing_history")
    @Schema(name = "BrowsingHistory", description = "浏览历史")
public class BrowsingHistory extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 用户id
            */
            @Schema(description = "用户id")
            @TableField(value = "user_id")
        private Long userId;
            /**
            * 浏览房间id
            */
            @Schema(description = "浏览房间id")
            @TableField(value = "room_id")
        private Long roomId;
            @TableField(value = "browse_time")
        private LocalDateTime browseTime;
}