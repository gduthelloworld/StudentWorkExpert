package edu.gdut.auto.Uitls;

import edu.gdut.auto.Exception.MyException;
import edu.gdut.auto.Result.ResultEnum;
import edu.gdut.auto.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSession;

public class SessionUtils {

    /**
     * log日志记录，使用原生的log4j
     */
    private static final Logger log = LoggerFactory.getLogger(SessionUtils.class);

    private static final String USER = "User_session";

    /**
     * 将用户存入session
     *
     * @param session
     * @param user
     * @return
     */
    public static boolean SetUser(HttpSession session, User user) {
        session.setAttribute(USER, user);
        log.info("【用户登陆】"+user.toString());
        return true;
    }

    /**
     * 获取用户的id
     *
     * @param session
     * @return
     */
    public static Long GetUserId(HttpSession session) {
        if (session.getAttribute(USER) != null) {
            User user = (User) session.getAttribute(USER);
            return user.getUserId();
        }
        log.error("【获取session的User出错】SESSION_FIND_NONE");
        throw new MyException(ResultEnum.SESSION_FIND_NONE);
    }

    /**
     * 获取班级代码
     *
     * @param session
     * @return
     */
    public static Short GetClassCode(HttpSession session) {
        if (session.getAttribute(USER) != null) {
            User user = (User) session.getAttribute(USER);
            return user.getUserClassCode();
        }
        log.error("【获取session的User出错】SESSION_FIND_NONE");
        throw new MyException(ResultEnum.SESSION_FIND_NONE);
    }

    /**
     * 获取session的User
     *
     * @param session
     * @return
     */
    public static User GetUser(HttpSession session) {
        if (session.getAttribute(USER) != null) {
            User user = (User) session.getAttribute(USER);
            return user;
        }
        log.error("【获取session的User出错】SESSION_FIND_NONE");
        throw new MyException(ResultEnum.SESSION_FIND_NONE);
    }

    /**
     * 获取session的User的Name;
     *
     * @param session
     * @return
     */
    public static String GetUserName(HttpSession session) {
        if (session.getAttribute(USER) != null) {
            User user = (User) session.getAttribute(USER);
            return user.getUserName();
        }
        log.error("【获取session的User出错】SESSION_FIND_NONE");
        throw new MyException(ResultEnum.SESSION_FIND_NONE);
    }

    /**
     * 注销时清除session
     *
     * @param session
     * @return
     */
    public static boolean DeleteUser(HttpSession session) {
        session.removeAttribute(USER);
        return true;
    }
}
