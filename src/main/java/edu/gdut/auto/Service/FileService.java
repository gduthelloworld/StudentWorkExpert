package edu.gdut.auto.Service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    String addUserPic(MultipartFile file,String stuId);

}
