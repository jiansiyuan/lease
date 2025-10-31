package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 岗位信息表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("system_post")
    @Schema(name = "SystemPost", description = "岗位信息表")
public class SystemPost extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 岗位编码
            */
            @Schema(description = "岗位编码")
            @TableField(value = "code")
        private String code;
            /**
            * 岗位名称
            */
            @Schema(description = "岗位名称")
            @TableField(value = "name")
        private String name;
            /**
            * 描述
            */
            @Schema(description = "描述")
            @TableField(value = "description")
        private String description;
            /**
            * 状态（1正常 0停用）
            */
            @Schema(description = "状态（1正常 0停用）")
            @TableField(value = "status")
        private Boolean status;
}