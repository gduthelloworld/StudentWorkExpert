package edu.gdut.auto.Result;

public class ResultUtil {

    public static Result success(Object o) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功SUCCESS_By_ResultUtil");
        if (o == null) {
            result.setData(true);
        } else {
            result.setData(o);
        }
        return result;
    }

    public static Result success() {
        return success(true);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }
}
