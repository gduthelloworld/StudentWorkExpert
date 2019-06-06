package edu.gdut.auto.Service.ServiceImpl;


import edu.gdut.auto.Exception.MyException;
import edu.gdut.auto.Result.ResultEnum;
import edu.gdut.auto.Service.UserService;

import edu.gdut.auto.mappers.UserMapper;
import edu.gdut.auto.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    /**
     * 登陆网页判断
     *
     * @param id
     * @param pwd
     * @return
     */
    @Override
    public User loginCheck(String id, String pwd, String ip) {
        long id_long = Long.valueOf(id);
        User userInfo = userMapper.selectByPrimaryKey(id_long);
        if (userInfo != null) {
            if (userInfo.getUserState() != 0) {
                if (userInfo.getUserError() < 3) {
                    //TODO 未加入状态的判断。用户删除和过期的逻辑检验
                    if (userInfo.getUserPwd().equals(pwd)) {
                        if (userInfo.getUserError() != 0) {
                            //登陆成功后清除错误次数
                            userMapper.updateUserError(userInfo.getUserId(), (byte) 0);
                        }
                        //TODO 插入登陆记录
                        //loginInListMapper.insertLoginin(id_long,ip);
                        return userInfo;
                    }
                    userMapper.updateUserError(userInfo.getUserId(), (byte) (userInfo.getUserError() + 1));
                    throw new MyException(ResultEnum.PWD_ERROR);
                }
                throw new MyException(ResultEnum.PWD_ERROR_MAX);
            }
            throw new MyException(ResultEnum.USER_DELETE_ERROR);
        }
        throw new MyException(ResultEnum.FIND_NONE_ERROR);
        //return true;
    }

    /**
     * 修改密码
     *
     * @param id
     * @param new_pwd
     * @return
     */
    /**
     @Override public boolean change_pwd(long id, String new_pwd) {
     UserInfo userInfo = userInfoMapper.selectUserByID(id);
     if (userInfo != null) {
     if (new_pwd.trim() != "") {
     userInfoMapper.updatePwd(id, new_pwd);
     return true;
     }
     throw new MyException(ResultEnum.PWD_PARAMETER_ERROR);
     }
     throw new MyException(ResultEnum.FIND_NONE_ERROR);
     }*/
}
