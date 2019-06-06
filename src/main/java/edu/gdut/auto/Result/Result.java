package edu.gdut.auto.Result;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = 8960474786737581150L;

    /**错误码*/
    private Integer code;
    /**错误消息*/
    private String msg;
    /**具体内容*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}