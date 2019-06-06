package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.LoginInEntity;

public interface LoginInEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginInEntity record);

    int insertSelective(LoginInEntity record);

    LoginInEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginInEntity record);

    int updateByPrimaryKey(LoginInEntity record);
}