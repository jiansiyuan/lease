package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 房间基本属性表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("attr_key")
    @Schema(name = "AttrKey", description = "房间基本属性表")
public class AttrKey extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 属性key
            */
            @Schema(description = "属性key")
            @TableField(value = "name")
        private String name;
}