package edu.gdut.auto.pojo;

import java.util.Date;

public class ActivityRecord {
    private Integer acrId;

    private Integer acrActivityId;

    private Long acrStuId;

    private Byte acrState;

    private String acrReason;

    private Date acrAddTime;

    private Date acrUpdate;

    private String acrReply;

    private Byte acrCheck;

    public Integer getAcrId() {
        return acrId;
    }

    public void setAcrId(Integer acrId) {
        this.acrId = acrId;
    }

    public Integer getAcrActivityId() {
        return acrActivityId;
    }

    public void setAcrActivityId(Integer acrActivityId) {
        this.acrActivityId = acrActivityId;
    }

    public Long getAcrStuId() {
        return acrStuId;
    }

    public void setAcrStuId(Long acrStuId) {
        this.acrStuId = acrStuId;
    }

    public Byte getAcrState() {
        return acrState;
    }

    public void setAcrState(Byte acrState) {
        this.acrState = acrState;
    }

    public String getAcrReason() {
        return acrReason;
    }

    public void setAcrReason(String acrReason) {
        this.acrReason = acrReason == null ? null : acrReason.trim();
    }

    public Date getAcrAddTime() {
        return acrAddTime;
    }

    public void setAcrAddTime(Date acrAddTime) {
        this.acrAddTime = acrAddTime;
    }

    public Date getAcrUpdate() {
        return acrUpdate;
    }

    public void setAcrUpdate(Date acrUpdate) {
        this.acrUpdate = acrUpdate;
    }

    public String getAcrReply() {
        return acrReply;
    }

    public void setAcrReply(String acrReply) {
        this.acrReply = acrReply == null ? null : acrReply.trim();
    }

    public Byte getAcrCheck() {
        return acrCheck;
    }

    public void setAcrCheck(Byte acrCheck) {
        this.acrCheck = acrCheck;
    }
}