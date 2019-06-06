package edu.gdut.auto.Service;


import edu.gdut.auto.pojo.User;

public interface UserService {

    User loginCheck(String id, String pwd, String ip);
   // boolean change_pwd(long id,String new_pwd);
}
