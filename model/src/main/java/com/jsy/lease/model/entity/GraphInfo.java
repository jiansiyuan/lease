package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 图片信息表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("graph_info")
    @Schema(name = "GraphInfo", description = "图片信息表")
public class GraphInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 图片名称
            */
            @Schema(description = "图片名称")
            @TableField(value = "name")
        private String name;
            /**
            * 图片所属对象类型（1:apartment,2:room）
            */
            @Schema(description = "图片所属对象类型（1:apartment,2:room）")
            @TableField(value = "item_type")
        private Byte itemType;
            /**
            * 图片所有对象id
            */
            @Schema(description = "图片所有对象id")
            @TableField(value = "item_id")
        private Long itemId;
            /**
            * 图片地址
            */
            @Schema(description = "图片地址")
            @TableField(value = "url")
        private String url;
}