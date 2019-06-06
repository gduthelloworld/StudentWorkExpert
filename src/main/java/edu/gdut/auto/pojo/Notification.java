package edu.gdut.auto.pojo;

import java.util.Date;

public class Notification {
    private Integer notificationId;

    private Byte notificationType;

    private Byte notificationState;

    private Integer notificationCollege;

    private Long notificationSender;

    private String notificationTitle;

    private String notificationTopic;

    private Date notificationAddTime;

    private Date notificationUpdate;

    private Date notificationClose;

    private String notificationRange;

    private String notificationDetail;

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Byte getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(Byte notificationType) {
        this.notificationType = notificationType;
    }

    public Byte getNotificationState() {
        return notificationState;
    }

    public void setNotificationState(Byte notificationState) {
        this.notificationState = notificationState;
    }

    public Integer getNotificationCollege() {
        return notificationCollege;
    }

    public void setNotificationCollege(Integer notificationCollege) {
        this.notificationCollege = notificationCollege;
    }

    public Long getNotificationSender() {
        return notificationSender;
    }

    public void setNotificationSender(Long notificationSender) {
        this.notificationSender = notificationSender;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle == null ? null : notificationTitle.trim();
    }

    public String getNotificationTopic() {
        return notificationTopic;
    }

    public void setNotificationTopic(String notificationTopic) {
        this.notificationTopic = notificationTopic == null ? null : notificationTopic.trim();
    }

    public Date getNotificationAddTime() {
        return notificationAddTime;
    }

    public void setNotificationAddTime(Date notificationAddTime) {
        this.notificationAddTime = notificationAddTime;
    }

    public Date getNotificationUpdate() {
        return notificationUpdate;
    }

    public void setNotificationUpdate(Date notificationUpdate) {
        this.notificationUpdate = notificationUpdate;
    }

    public Date getNotificationClose() {
        return notificationClose;
    }

    public void setNotificationClose(Date notificationClose) {
        this.notificationClose = notificationClose;
    }

    public String getNotificationRange() {
        return notificationRange;
    }

    public void setNotificationRange(String notificationRange) {
        this.notificationRange = notificationRange == null ? null : notificationRange.trim();
    }

    public String getNotificationDetail() {
        return notificationDetail;
    }

    public void setNotificationDetail(String notificationDetail) {
        this.notificationDetail = notificationDetail == null ? null : notificationDetail.trim();
    }
}