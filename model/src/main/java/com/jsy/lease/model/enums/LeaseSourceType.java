package com.jsy.lease.model.enums;

import java.io.Serializable;

public enum LeaseSourceType implements BaseEnum{

    NEW(1,"新签"),
    RENEW(2,"续约");
    private Integer code;
    private String name;
    LeaseSourceType(Integer code, String name) {
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
