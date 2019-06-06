package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.ClassEntity;

import java.util.List;

public interface ClassEntityMapper {
    int deleteByPrimaryKey(Short classCode);

    int insert(ClassEntity record);

    int insertSelective(ClassEntity record);

    ClassEntity selectByPrimaryKey(Short classCode);

    int updateByPrimaryKeySelective(ClassEntity record);

    int updateByPrimaryKey(ClassEntity record);

    List<ClassEntity> selectByCollegeId(Integer collegeId);
}