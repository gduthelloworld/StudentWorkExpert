package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.Notification;

public interface NotificationMapper {
    int deleteByPrimaryKey(Integer notificationId);

    int insert(Notification record);

    int insertSelective(Notification record);

    Notification selectByPrimaryKey(Integer notificationId);

    int updateByPrimaryKeySelective(Notification record);

    int updateByPrimaryKeyWithBLOBs(Notification record);

    int updateByPrimaryKey(Notification record);
}