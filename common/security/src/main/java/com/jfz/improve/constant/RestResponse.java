package com.jfz.improve.constant;

import lombok.Data;

@Data
public class RestResponse<T> {

    private String statusCode;
    private String statusMessage;
    private T data;

    public RestResponse() {
    }

    public RestResponse(ResponseCodeEnum resp) {
        this.statusCode = resp.getCode();
        this.statusMessage = resp.getMessage();
    }

    public RestResponse(ResponseCodeEnum resp, T data) {
        this.statusCode = resp.getCode();
        this.statusMessage = resp.getMessage();
        this.data = data;
    }


    public static RestResponse success() {
        return new RestResponse(ResponseCodeEnum.SUCCESS);
    }

    public static RestResponse success(Object object) {
        return new RestResponse(ResponseCodeEnum.SUCCESS, object);
    }
}
