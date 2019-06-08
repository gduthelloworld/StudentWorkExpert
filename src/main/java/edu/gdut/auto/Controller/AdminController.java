package edu.gdut.auto.Controller;


import edu.gdut.auto.Service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    /**
     * log日志记录，使用原生的log4j
     */
    private static final Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    StudentService studentService;

    @RequestMapping("/index")
    public String index(){
        return "admin/index";
    }

    @RequestMapping("/logInMsg")
    public String logInMsg(Model model){
        return "admin/logInMsg";
    }

    @RequestMapping("/search")
    public String search(@RequestParam("search_bar")String search, Model model){
        if(search.trim()!=""){
            //TODO 没有对搜索的字眼进行处理和记录
            log.info("【管理员搜索】"+search);
            model.addAttribute("search",studentService.findStudent(search));
        }
        return "admin/search";
    }

    @RequestMapping("/user")
    public String user(){
        return "admin/user";
    }

    @RequestMapping("/evaluation")
    public String evaluation(){
        return "admin/evaluation";
    }
}
