package edu.gdut.auto.Exception;

import edu.gdut.auto.Result.ResultEnum;

public class MyException extends RuntimeException{

    /**
     * 异常代码
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String message;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
        this.message=resultEnum.getMsg();
    }

    public MyException(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}