package com.jsy.lease.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BaseStatus implements BaseEnum {

    ENABLE(1,"正常"),
    DISABLE(0,"禁用");


    @EnumValue
    @JsonValue
    private Integer code;
    private String name;

    BaseStatus(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
    public Integer getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
}
