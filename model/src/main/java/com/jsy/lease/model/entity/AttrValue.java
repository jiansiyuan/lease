package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 房间基本属性值表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("attr_value")
    @Schema(name = "AttrValue", description = "房间基本属性值表")
public class AttrValue extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 属性value
            */
            @Schema(description = "属性value")
            @TableField(value = "name")
        private String name;
            /**
            * 对应的属性key_id
            */
            @Schema(description = "对应的属性key_id")
            @TableField(value = "attr_key_id")
        private Long attrKeyId;
}