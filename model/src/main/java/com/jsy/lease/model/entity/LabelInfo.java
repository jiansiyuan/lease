package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 标签信息表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("label_info")
    @Schema(name = "LabelInfo", description = "标签信息表")
public class LabelInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 类型（1:公寓标签,2:房间标签）
            */
            @Schema(description = "类型（1:公寓标签,2:房间标签）")
            @TableField(value = "type")
        private Byte type;
            /**
            * 标签名称
            */
            @Schema(description = "标签名称")
            @TableField(value = "name")
        private String name;
}