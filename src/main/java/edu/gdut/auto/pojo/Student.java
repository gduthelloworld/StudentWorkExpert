package edu.gdut.auto.pojo;

import java.util.Date;

public class Student {
    private Long stuId;

    private String stuName;

    private Byte stuSex;

    private String stuCollege;

    private Integer stuCollegeId;

    private Short stuClassCode;

    private String stuClassName;

    private Short stuGrade;

    private Short stuProfession;

    private String stuPersonalId;

    private String stuPhone;

    private Byte stuPoor;

    private Date stuAddTime;
    /*
        数据库的记录，对应静态资源的照片链接
     */
    private String stuPic;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Byte getStuSex() {
        return stuSex;
    }

    public void setStuSex(Byte stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuCollege() {
        return stuCollege;
    }

    public void setStuCollege(String stuCollege) {
        this.stuCollege = stuCollege == null ? null : stuCollege.trim();
    }

    public Integer getStuCollegeId() {
        return stuCollegeId;
    }

    public void setStuCollegeId(Integer stuCollegeId) {
        this.stuCollegeId = stuCollegeId;
    }

    public Short getStuClassCode() {
        return stuClassCode;
    }

    public void setStuClassCode(Short stuClassCode) {
        this.stuClassCode = stuClassCode;
    }

    public String getStuClassName() {
        return stuClassName;
    }

    public void setStuClassName(String stuClassName) {
        this.stuClassName = stuClassName == null ? null : stuClassName.trim();
    }

    public Short getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(Short stuGrade) {
        this.stuGrade = stuGrade;
    }

    public Short getStuProfession() {
        return stuProfession;
    }

    public void setStuProfession(Short stuProfession) {
        this.stuProfession = stuProfession;
    }

    public String getStuPersonalId() {
        return stuPersonalId;
    }

    public void setStuPersonalId(String stuPersonalId) {
        this.stuPersonalId = stuPersonalId == null ? null : stuPersonalId.trim();
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }

    public Byte getStuPoor() {
        return stuPoor;
    }

    public void setStuPoor(Byte stuPoor) {
        this.stuPoor = stuPoor;
    }

    public Date getStuAddTime() {
        return stuAddTime;
    }

    public void setStuAddTime(Date stuAddTime) {
        this.stuAddTime = stuAddTime;
    }

    public String getStuPic() {
        return stuPic;
    }

    public void setStuPic(String stuPic) {
        this.stuPic = stuPic == null ? null : stuPic.trim();
    }
}