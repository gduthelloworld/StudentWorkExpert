package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateUserError(Long userId,Byte userError);

    int updateUserType(Long userId,Byte userType);
}