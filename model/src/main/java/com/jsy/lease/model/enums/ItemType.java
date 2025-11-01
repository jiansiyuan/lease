package com.jsy.lease.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ItemType implements BaseEnum {
    APARTMENT(1,"公寓"),
    ROOM(2,"房间");

    @JsonValue
    @EnumValue
    private Integer code;
    private String name;
    ItemType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return code;
    }
    @Override
    public String getName() {
        return name;
    }
}
