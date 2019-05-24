package com.newbie.springbootdemo.domain;

import org.springframework.stereotype.Component;

@Component
public class ResponseResult<T> {
    private String code;
    private String message;
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
