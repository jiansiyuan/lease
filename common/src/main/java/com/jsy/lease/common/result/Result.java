package com.jsy.lease.common.result;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;
    public Result(){
    }

    public static <T> Result<T> build(T data){
        Result<T> result = new Result<>();
        if(data != null){
            result.setData(data);
        }
        return result;
    }
    public static <T> Result<T> build(T data,ResultCodeEnum resultCodeEnum){
        Result<T> result = build(data);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }
    public static <T> Result<T> ok(T data){
        return build(data,ResultCodeEnum.SUCCESS);
    }
    public static <T> Result<T> ok(){
        return ok(null);
    }
    public static <T> Result<T> fail(){
        return build(null,ResultCodeEnum.FAIL);
    }
    public static <T> Result<T> fail(int code,String message){
        Result<T> result = build(null);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }


}
