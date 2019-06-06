package edu.gdut.auto.Controller;


import edu.gdut.auto.Exception.MyException;
import edu.gdut.auto.Result.Result;
import edu.gdut.auto.Result.ResultEnum;
import edu.gdut.auto.Result.ResultUtil;
import edu.gdut.auto.Service.CollegeAndClassService;
import edu.gdut.auto.Service.FileService;
import edu.gdut.auto.Uitls.MyFileUtils;
import edu.gdut.auto.Uitls.PicUtils;
import edu.gdut.auto.Uitls.RequestUtils;
import edu.gdut.auto.mappers.UserMapper;
import edu.gdut.auto.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/api")
public class ApiController {

    /**
     * log日志记录，使用原生的log4j
     */
    private static final Logger log = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    CollegeAndClassService collegeAndClassService;
    @Autowired
    FileService fileService;
    @Autowired
    UserMapper userMapper;


    /**
     * 常用变量存放在这里，免得以后出现什么奇奇怪怪的
     */
    private static final String COLLEGE_ID = "collegeId";

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        userMapper.updateUserType(new Long(1234), User.User_Manger);
        System.out.println(userMapper.selectByPrimaryKey(new Long(1234)));
        return "hello";
    }

    /**
     * 获取学院列表
     *
     * @return List
     */
    @GetMapping("/collegeList")
    @ResponseBody
    public Result collegeList() {
        return ResultUtil.success(collegeAndClassService.collegeList());
    }

    /**
     * 由路径的id查询学院信息
     *
     * @param collegeId
     * @return
     */
    @GetMapping("/collegeList/{collegeId}")
    @ResponseBody
    public Result getOneCollege(@PathVariable("collegeId") Integer collegeId) {
        return ResultUtil.success(collegeAndClassService.getOneCollege(collegeId));
    }

    /**
     * 新加学院
     *
     * @param collegeName
     * @return
     */
    @PostMapping("/collegeList")
    @ResponseBody
    public Result addCollege(@RequestParam(value = "collegeName") String collegeName) {
        return ResultUtil.success(collegeAndClassService.addCollege(collegeName));
    }

    @GetMapping("/classList")
    @ResponseBody
    public Result classList(HttpServletRequest request) {
        Integer collegeId_int = Integer.parseInt(RequestUtils.GetRequestParameter(request, COLLEGE_ID));
        return ResultUtil.success(collegeAndClassService.classList(collegeId_int));
    }

    /**
     * 更新用户照片
     *
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("/userPic")
    @ResponseBody
    public Result updateUserPic(@RequestParam(value = "userPic") MultipartFile file) throws IOException {
        return ResultUtil.success(fileService.addUserPic(file));
    }

    /**
     * //TODO 没解决文件上传功能，主要是路径问题，在服务器(解决了)，没解决下载问题
     *
     * @return
     */
    @PostMapping("/imageUpload")
    public String uploadFile(@RequestParam(value = "image") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }

        return "redirect:/admin/user";

    }


}
