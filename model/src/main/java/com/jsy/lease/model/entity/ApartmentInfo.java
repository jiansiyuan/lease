package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 公寓信息表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("apartment_info")
    @Schema(name = "ApartmentInfo", description = "公寓信息表")
public class ApartmentInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 公寓名称
            */
            @Schema(description = "公寓名称")
            @TableField(value = "name")
        private String name;
            /**
            * 公寓介绍
            */
            @Schema(description = "公寓介绍")
            @TableField(value = "introduction")
        private String introduction;
            /**
            * 所处区域id
            */
            @Schema(description = "所处区域id")
            @TableField(value = "district_id")
        private Long districtId;
            /**
            * 区域名称
            */
            @Schema(description = "区域名称")
            @TableField(value = "district_name")
        private String districtName;
            /**
            * 所处城市id
            */
            @Schema(description = "所处城市id")
            @TableField(value = "city_id")
        private Long cityId;
            /**
            * 城市名称
            */
            @Schema(description = "城市名称")
            @TableField(value = "city_name")
        private String cityName;
            /**
            * 所处省份id
            */
            @Schema(description = "所处省份id")
            @TableField(value = "province_id")
        private Long provinceId;
            /**
            * 省份名称
            */
            @Schema(description = "省份名称")
            @TableField(value = "province_name")
        private String provinceName;
            /**
            * 详细地址
            */
            @Schema(description = "详细地址")
            @TableField(value = "address_detail")
        private String addressDetail;
            /**
            * 经度
            */
            @Schema(description = "经度")
            @TableField(value = "latitude")
        private String latitude;
            /**
            * 纬度
            */
            @Schema(description = "纬度")
            @TableField(value = "longitude")
        private String longitude;
            /**
            * 公寓前台电话
            */
            @Schema(description = "公寓前台电话")
            @TableField(value = "phone")
        private String phone;
            /**
            * 是否发布（1:发布，0:未发布）
            */
            @Schema(description = "是否发布（1:发布，0:未发布）")
            @TableField(value = "is_release")
        private Byte isRelease;
}