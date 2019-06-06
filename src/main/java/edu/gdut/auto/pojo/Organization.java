package edu.gdut.auto.pojo;

import java.util.Date;

public class Organization {
    private Integer orgId;

    private String orgName;

    private Byte orgType;

    private String orgCollege;

    private Long orgLeaderId;

    private Integer orgNum;

    private Date orgAddTime;

    private Byte orgState;

    private String orgDetail;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Byte getOrgType() {
        return orgType;
    }

    public void setOrgType(Byte orgType) {
        this.orgType = orgType;
    }

    public String getOrgCollege() {
        return orgCollege;
    }

    public void setOrgCollege(String orgCollege) {
        this.orgCollege = orgCollege == null ? null : orgCollege.trim();
    }

    public Long getOrgLeaderId() {
        return orgLeaderId;
    }

    public void setOrgLeaderId(Long orgLeaderId) {
        this.orgLeaderId = orgLeaderId;
    }

    public Integer getOrgNum() {
        return orgNum;
    }

    public void setOrgNum(Integer orgNum) {
        this.orgNum = orgNum;
    }

    public Date getOrgAddTime() {
        return orgAddTime;
    }

    public void setOrgAddTime(Date orgAddTime) {
        this.orgAddTime = orgAddTime;
    }

    public Byte getOrgState() {
        return orgState;
    }

    public void setOrgState(Byte orgState) {
        this.orgState = orgState;
    }

    public String getOrgDetail() {
        return orgDetail;
    }

    public void setOrgDetail(String orgDetail) {
        this.orgDetail = orgDetail == null ? null : orgDetail.trim();
    }
}