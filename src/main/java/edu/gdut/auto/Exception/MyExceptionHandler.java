package edu.gdut.auto.Exception;

import edu.gdut.auto.Result.Result;
import edu.gdut.auto.Result.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常统一捕获
 */
@ControllerAdvice
public class MyExceptionHandler {
    /**
     * log日志记录，使用原生的log4j
     */
    private static final Logger log = LoggerFactory.getLogger(MyExceptionHandler.class);

    /**
     * 抛出定义的异常，用于前后端逻辑的判断
     * @param e
     * @return
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Result handlerMyException(MyException e) {
        /*因为太麻烦了*/
        //log.error("【自定义异常】["+e.getCode()+"]"+e.getMessage());
        return ResultUtil.error(e.getCode(), e.getMessage());
    }

    /**
     * 当出现99代码的时候说明是系统出异常了
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handlerException(Exception e) {
        log.error("【异常捕获】["+e.getLocalizedMessage()+"]"+e.getMessage());
        return ResultUtil.error(99, "系统出现问题！请重新操作！");
    }


}