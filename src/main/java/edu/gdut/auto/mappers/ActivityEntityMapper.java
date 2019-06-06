package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.ActivityEntity;

public interface ActivityEntityMapper {
    int deleteByPrimaryKey(Integer activityId);

    int insert(ActivityEntity record);

    int insertSelective(ActivityEntity record);

    ActivityEntity selectByPrimaryKey(Integer activityId);

    int updateByPrimaryKeySelective(ActivityEntity record);

    int updateByPrimaryKeyWithBLOBs(ActivityEntity record);

    int updateByPrimaryKey(ActivityEntity record);
}