package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 公寓标签关联表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("apartment_label")
    @Schema(name = "ApartmentLabel", description = "公寓标签关联表")
public class ApartmentLabel extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 公寓id
            */
            @Schema(description = "公寓id")
            @TableField(value = "apartment_id")
        private Long apartmentId;
            /**
            * 标签id
            */
            @Schema(description = "标签id")
            @TableField(value = "label_id")
        private Long labelId;
}