package com.eight.glyxyxt.utils;

/**
 * @Author Kele-Bing
 * @Create 2021/8/12 18:11
 * @Version 1.0
 * 
 * 返回前端前，封装状态码和状态信息
 */
public enum EnMsgType {
    CUSTOM(0,"自定义信息"),  //自定义状态码和信息
    FAIL(99999, "服务器内部开了点小差，请重试。。。。。"), 
    SUCCESS(88888, "请求处理成功"),  //特殊
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10000, "未知错误"),

    
    ;

    private int code;
    private String msg;
     EnMsgType(int code, String msg) {
        this.code  = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
