package edu.gdut.auto.Controller;

import edu.gdut.auto.Exception.MyException;
import edu.gdut.auto.Result.ResultEnum;
import edu.gdut.auto.Service.UserService;
import edu.gdut.auto.Uitls.IpUtils;
import edu.gdut.auto.Uitls.SessionUtils;
import edu.gdut.auto.Uitls.VerifyCodeUtils;
import edu.gdut.auto.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Controller
public class WebController {

    /**
     * log日志记录，使用原生的log4j
     */
    private static final Logger log= LoggerFactory.getLogger(WebController.class);
    /**
     * 常用变量存放在这里，免得以后出现什么奇奇怪怪的
     */
    //用户提交的ID
    private static final String USER_ID="id";
    //用户提交的密码
    private static final String USER_PWD="pwd";
    //用户提交的验证码
    private static final String CODE="code";
    //系统生成的验证码
    private static final String VER_CODE ="verCode";
    //验证码时间
    private static final String CODE_TIME ="codeTime";
    /**
     * 依赖自动注入
     */
    @Autowired
    UserService userService;

    /**
     * 登陆界面
     *
     * @return
     */
    @RequestMapping({"/", "/login"})
    public String login() {
        return "Login";
    }

    /**
     * 请求网页验证码
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @GetMapping(value = "/verCode")
    public void authImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        // 生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        // 存入会话session
        HttpSession session = request.getSession(true);
        // 删除以前的
        session.removeAttribute(VER_CODE);
        session.removeAttribute(CODE_TIME);
        session.setAttribute(VER_CODE, verifyCode.toLowerCase());
        session.setAttribute(CODE_TIME, LocalDateTime.now());
        // 生成图片
        int w = 100, h = 30;
        OutputStream out = response.getOutputStream();
        VerifyCodeUtils.outputImage(w, h, out, verifyCode);
    }

    /**
     * 检验验证码是否正确
     *
     * @param request
     * @param session
     * @return
     */
    @PostMapping(value = "/loginCheck")
    public String validImage(HttpServletRequest request,HttpSession session) {
        String id, pwd;
        //获取id
        if (request.getParameter(USER_ID) != null) {
            id = request.getParameter(USER_ID);
            if(id.trim()==""){
                throw new MyException(ResultEnum.ID_PARAMETER_ERROR);
            }
        } else {
            throw new MyException(ResultEnum.ID_PARAMETER_ERROR);
        }
        //获取密码
        if (request.getParameter(USER_PWD) != null) {
            pwd = request.getParameter(USER_PWD);
            if(pwd.trim()==""){
                throw new MyException(ResultEnum.PWD_PARAMETER_ERROR);
            }
        } else {
            throw new MyException(ResultEnum.PWD_PARAMETER_ERROR);
        }
        //获取验证码
        String code = request.getParameter(CODE);
        //获取session的验证码
        Object verCode = session.getAttribute(VER_CODE);
        if (null == verCode) {
            throw new MyException(ResultEnum.VERCODE_EXPIRED);
        }
        String verCodeStr = verCode.toString();
        LocalDateTime localDateTime = (LocalDateTime) session.getAttribute(CODE_TIME);
        long past = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long now = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        if (verCodeStr == null || code == null || code.isEmpty() || !verCodeStr.equalsIgnoreCase(code)) {
            throw new MyException(ResultEnum.VERCODE_ERROR);
        } else if ((now - past) / 1000 / 60 > 5) {
            throw new MyException(ResultEnum.VERCODE_EXPIRED);
        } else {
            String ip = IpUtils.getIp(request);
            //进行验证
            User user= userService.loginCheck(id, pwd, ip);
            //TODO 将登陆成功的session存在redis
            //验证成功，删除存储的验证码
            session.removeAttribute(VER_CODE);
            session.removeAttribute(CODE_TIME);
            SessionUtils.SetUser(session,user);
            log.info(user.toString());
            throw new MyException(ResultEnum.SUCCESS_LOGIN);
        }
    }

    /**
     * 退出网页，注销操作
     * @param session
     * @return
     */
    @RequestMapping("/logOut")
    public String logOut(HttpSession session){
        SessionUtils.DeleteUser(session);
        return "Login";
    }
    @RequestMapping("/swe")
    public String swe(){
        return "swe/swe";
    }
    @RequestMapping("/about")
    public String about(){
        return "swe/about";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "swe/contact";
    }


}
