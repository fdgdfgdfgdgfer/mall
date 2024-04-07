package com.example.constant;

public enum ResponseCodeEnum {

    SUCCESS("0", "SUCCESS"),
    ERROR("101", "ERROR"),
    UNAUTHORIZED("401", "用户未授权"),
    USER_ALREADY_EXIST("1000002", "用户已存在"),
    USER_LOGIN_ERROR("1000001", "用户登录失败");

    ResponseCodeEnum(String respCode, String respMsg) {
        this.code = respCode;
        this.message = respMsg;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;



}
