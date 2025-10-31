package com.jsy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
    * 用户信息表
    * </p>
*
* @author jsy
* @since 2025-10-31
*/
@Data
@EqualsAndHashCode(callSuper = true)
    @TableName("user_info")
    @Schema(name = "UserInfo", description = "用户信息表")
public class UserInfo extends BaseEntity {

private static final long serialVersionUID = 1L;
            /**
            * 手机号码（用做登录用户名）
            */
            @Schema(description = "手机号码（用做登录用户名）")
            @TableField(value = "phone")
        private String phone;
            /**
            * 密码
            */
            @Schema(description = "密码")
            @TableField(value = "password")
        private String password;
            /**
            * 头像url
            */
            @Schema(description = "头像url")
            @TableField(value = "avatar_url")
        private String avatarUrl;
            /**
            * 昵称
            */
            @Schema(description = "昵称")
            @TableField(value = "nickname")
        private String nickname;
            /**
            * 账号状态
            */
            @Schema(description = "账号状态")
            @TableField(value = "status")
        private Byte status;
}