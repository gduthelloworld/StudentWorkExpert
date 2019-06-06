package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.CollegeEntity;

import java.util.List;

public interface CollegeEntityMapper {
    int deleteByPrimaryKey(Integer collegeId);

    int insert(CollegeEntity record);

    int insertSelective(CollegeEntity record);

    CollegeEntity selectByPrimaryKey(Integer collegeId);

    int updateByPrimaryKeySelective(CollegeEntity record);

    int updateByPrimaryKey(CollegeEntity record);

    List<CollegeEntity> selectAll();
}