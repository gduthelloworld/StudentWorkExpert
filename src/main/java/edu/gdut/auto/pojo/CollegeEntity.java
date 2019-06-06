package edu.gdut.auto.pojo;

public class CollegeEntity {
    /**
     * 学院状态
     */
    public static final Byte College_Normal =1;
    public static final Byte College_Delete =0;


    private Integer collegeId;

    private String collegeName;

    private Long collegeLeaderId;

    private Byte collegeClassNum;

    private Byte collegeState;

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public Long getCollegeLeaderId() {
        return collegeLeaderId;
    }

    public void setCollegeLeaderId(Long collegeLeaderId) {
        this.collegeLeaderId = collegeLeaderId;
    }

    public Byte getCollegeClassNum() {
        return collegeClassNum;
    }

    public void setCollegeClassNum(Byte collegeClassNum) {
        this.collegeClassNum = collegeClassNum;
    }

    public Byte getCollegeState() {
        return collegeState;
    }

    public void setCollegeState(Byte collegeState) {
        this.collegeState = collegeState;
    }
}