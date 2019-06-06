package edu.gdut.auto.Uitls;

import edu.gdut.auto.Exception.MyException;
import edu.gdut.auto.Result.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {

    /**
     * log日志记录，使用原生的log4j
     */
    private static final Logger log = LoggerFactory.getLogger(RequestUtils.class);

    /**
     * 获取request的参数
     *
     * @param request
     * @param ParameterName
     * @return
     */
    public static String GetRequestParameter(HttpServletRequest request, String ParameterName) {
        String i = request.getParameter(ParameterName);
        if (i != null) {
            if (i.trim() != "") {
                return i.trim();
            }
            log.info("【Request请求参数为空】"+ParameterName);
            throw new MyException(ResultEnum.REQUEST_PARAMETER_EMPTY);
        }
        log.info("【Request请求参数不存在】"+ParameterName);
        throw new MyException(ResultEnum.REQUEST_PARAMETER_ERROR);
    }
}
