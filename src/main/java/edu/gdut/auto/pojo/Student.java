package edu.gdut.auto.pojo;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    /*
        学号
     */
    private Long stuId;
    /*
        学生名字
     */
    private String stuName;
    /*
        学生性别，1男，0女
     */
    private Byte stuSex;
    /*
        所在学院名字
     */
    private String stuCollege;
    /*
        学院Id
     */
    private Integer stuCollegeId;
    /*
        学生班级代号
     */
    private Short stuClassCode;
    /*
        学生班级名字
     */
    private String stuClassName;
    /*
        所在年级
     */
    private Short stuGrade;
    /*
        学生专业代号
     */
    private Short stuProfession;
    /*
        学生身份证
     */
    private String stuPersonalId;
    /*
        学生手机号码
     */
    private String stuPhone;
    /*
        学生贫困标志，0不贫困，123，一般，比较，特殊
     */
    private Byte stuPoor;
    /*
        添加时间
     */
    private Date stuAddTime;
    /*
        学生照片
     */
    private Long stuPic;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public Long getStuPic() {
        return stuPic;
    }

    public void setStuPic(Long stuPic) {
        this.stuPic = stuPic;
    }
}