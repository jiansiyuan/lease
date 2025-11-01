package com.jsy.lease.model.enums;

public enum ReleaseStatus implements BaseEnum {
    RELEASED(1,"已发布"),
    NOT_RELEASED(0,"未发布");
    
    private Integer code;
    private String name;
    ReleaseStatus(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
    @Override
    public Integer getCode(){
        return code;
    }
    @Override
    public String getName() {
        return name;
    }
}
