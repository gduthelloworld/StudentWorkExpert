package edu.gdut.auto.pojo;

import java.util.Date;

public class ActivityEntity {
    private Integer activityId;

    private Byte activityType;

    private Integer activityCollege;

    private Integer activityOrganization;

    private Byte activityState;

    private String activityLimit;

    private String activityTopic;

    private Integer activityNum;

    private Integer activityReady;

    private Date activityAddTime;

    private Long activityCreate;

    private Date activityUpdate;

    private Date activityClose;

    private String activityDetail;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Byte getActivityType() {
        return activityType;
    }

    public void setActivityType(Byte activityType) {
        this.activityType = activityType;
    }

    public Integer getActivityCollege() {
        return activityCollege;
    }

    public void setActivityCollege(Integer activityCollege) {
        this.activityCollege = activityCollege;
    }

    public Integer getActivityOrganization() {
        return activityOrganization;
    }

    public void setActivityOrganization(Integer activityOrganization) {
        this.activityOrganization = activityOrganization;
    }

    public Byte getActivityState() {
        return activityState;
    }

    public void setActivityState(Byte activityState) {
        this.activityState = activityState;
    }

    public String getActivityLimit() {
        return activityLimit;
    }

    public void setActivityLimit(String activityLimit) {
        this.activityLimit = activityLimit == null ? null : activityLimit.trim();
    }

    public String getActivityTopic() {
        return activityTopic;
    }

    public void setActivityTopic(String activityTopic) {
        this.activityTopic = activityTopic == null ? null : activityTopic.trim();
    }

    public Integer getActivityNum() {
        return activityNum;
    }

    public void setActivityNum(Integer activityNum) {
        this.activityNum = activityNum;
    }

    public Integer getActivityReady() {
        return activityReady;
    }

    public void setActivityReady(Integer activityReady) {
        this.activityReady = activityReady;
    }

    public Date getActivityAddTime() {
        return activityAddTime;
    }

    public void setActivityAddTime(Date activityAddTime) {
        this.activityAddTime = activityAddTime;
    }

    public Long getActivityCreate() {
        return activityCreate;
    }

    public void setActivityCreate(Long activityCreate) {
        this.activityCreate = activityCreate;
    }

    public Date getActivityUpdate() {
        return activityUpdate;
    }

    public void setActivityUpdate(Date activityUpdate) {
        this.activityUpdate = activityUpdate;
    }

    public Date getActivityClose() {
        return activityClose;
    }

    public void setActivityClose(Date activityClose) {
        this.activityClose = activityClose;
    }

    public String getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail == null ? null : activityDetail.trim();
    }
}