package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.ActivityRecord;

public interface ActivityRecordMapper {
    int deleteByPrimaryKey(Integer acrId);

    int insert(ActivityRecord record);

    int insertSelective(ActivityRecord record);

    ActivityRecord selectByPrimaryKey(Integer acrId);

    int updateByPrimaryKeySelective(ActivityRecord record);

    int updateByPrimaryKey(ActivityRecord record);
}