package com.jsy.lease.common.result;

import lombok.Getter;

@Getter
public enum ResultCodeEnum  {
    // ==================== 成功 ====================
    SUCCESS(0, "成功"),

    // ==================== 通用业务错误 1000-1999 ====================
    FAIL(1001, "操作失败"),
    PARAM_ERROR(1002, "请求参数错误"),
    ILLEGAL_REQUEST(1003, "非法请求"),
    REPEAT_SUBMIT(1004, "重复提交"),
    UNSUPPORTED_OPERATION(1005, "不支持的操作"),

    // ==================== 认证授权错误 2000-2999 ====================
    UNAUTHORIZED(2001, "未登录"),
    FORBIDDEN(2002, "无访问权限"),
    TOKEN_EXPIRED(2003, "登录已过期"),
    TOKEN_INVALID(2004, "Token无效"),
    CAPTCHA_ERROR(2005, "验证码错误"),
    CAPTCHA_EXPIRED(2006, "验证码已过期"),
    CAPTCHA_REQUIRED(2007, "请输入验证码"),
    LOGIN_FAILED(2008, "登录失败"),
    ACCOUNT_DISABLED(2009, "账号已被禁用"),

    // ==================== 用户相关错误 3000-3999 ====================
    USER_NOT_EXIST(3001, "用户不存在"),
    USER_ALREADY_EXIST(3002, "用户已存在"),
    USER_PASSWORD_ERROR(3003, "密码错误"),
    USER_PHONE_EMPTY(3004, "手机号不能为空"),
    USER_PHONE_INVALID(3005, "手机号格式错误"),
    SMS_SEND_TOO_OFTEN(3006, "验证码发送过于频繁"),

    // ==================== 数据操作错误 4000-4999 ====================
    DATA_NOT_FOUND(4001, "数据不存在"),
    DATA_ALREADY_EXIST(4002, "数据已存在"),
    DATA_VALIDATION_ERROR(4003, "数据验证失败"),
    DELETE_WITH_RELATIONS(4004, "请先删除关联数据"),
    UPDATE_CONFLICT(4005, "数据更新冲突"),
    DATA_ACCESS_DENIED(4006, "无数据访问权限"),

    // ==================== 系统服务错误 5000-5999 ====================
    SERVICE_UNAVAILABLE(5001, "服务暂不可用"),
    REMOTE_SERVICE_ERROR(5002, "远程服务调用失败"),
    DATABASE_ERROR(5003, "数据库操作异常"),
    FILE_UPLOAD_ERROR(5004, "文件上传失败"),
    NETWORK_ERROR(5005, "网络连接异常");

    private int code;
    private String message;
    ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}
