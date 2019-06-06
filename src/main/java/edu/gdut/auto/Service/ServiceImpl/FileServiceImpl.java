package edu.gdut.auto.Service.ServiceImpl;

import edu.gdut.auto.Exception.MyException;
import edu.gdut.auto.Result.ResultEnum;
import edu.gdut.auto.Service.FileService;
import edu.gdut.auto.Uitls.PicUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    /**
     * log日志记录，使用原生的log4j
     */
    private static final Logger log = LoggerFactory.getLogger(FileServiceImpl.class);

    @Value("${file.rootPath}")
    private String rootPath;

    @Value("${file.userPicPath}")
    private String userPicPath;


    @Override
    public String addUserPic(MultipartFile file) {
        if (file.isEmpty()) {
            log.error("[上传用户图片]：图片参数为空");
            throw new MyException(ResultEnum.Upload_UserPic_Empty);
        }
        if (!PicUtils.isPic(file.getOriginalFilename())) {
            /**
             *  //TODO 此处好像不能封装成一个类？
             */
            // 后缀名
            String suffixName = PicUtils.getSuffixName(file.getOriginalFilename());
            // 上传后的路径,因为服务器用的是CentOs,所以没有盘符，需要些file:
            String saveFilePath = getJarRoot() + userPicPath;
            // 新文件名
            String fileName = UUID.randomUUID() + suffixName;
            //存放新文件
            File destFile = new File(saveFilePath + fileName);
            if (!destFile.getParentFile().exists()) {
                destFile.getParentFile().mkdirs();
            }
            //拷贝文件
            try {
                file.transferTo(destFile);
            } catch (IOException e) {
                log.error("[FileServiceImpl]：文件拷贝出现错误");
                e.printStackTrace();
            }
            return fileName;

        }
        ;
        log.error("[上传用户图片]：上传图片格式不对");
        throw new MyException(ResultEnum.IsNot_Pic_Error);

    }

    /**
     * 获取jar所在目录
     *
     * ! ! ! ! 注意本次服务器，配置在file:/root/jar/
     *
     * @return
     */
    public String getJarRoot() {
        ApplicationHome home = new ApplicationHome(getClass());
        File jarFile = home.getSource();
        return jarFile.getParentFile().getPath();
    }
}
