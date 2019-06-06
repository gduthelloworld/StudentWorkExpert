package edu.gdut.auto.pojo;

public class ClassEntity {
    private Short classCode;

    private String className;

    private Short classGrade;

    private String classProfession;

    private String classCollege;

    private Integer classCollegeId;

    private Short classNum;

    private Long classFdyId;

    private Long classLeaderId;

    private Byte classState;

    public Short getClassCode() {
        return classCode;
    }

    public void setClassCode(Short classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Short getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(Short classGrade) {
        this.classGrade = classGrade;
    }

    public String getClassProfession() {
        return classProfession;
    }

    public void setClassProfession(String classProfession) {
        this.classProfession = classProfession == null ? null : classProfession.trim();
    }

    public String getClassCollege() {
        return classCollege;
    }

    public void setClassCollege(String classCollege) {
        this.classCollege = classCollege == null ? null : classCollege.trim();
    }

    public Integer getClassCollegeId() {
        return classCollegeId;
    }

    public void setClassCollegeId(Integer classCollegeId) {
        this.classCollegeId = classCollegeId;
    }

    public Short getClassNum() {
        return classNum;
    }

    public void setClassNum(Short classNum) {
        this.classNum = classNum;
    }

    public Long getClassFdyId() {
        return classFdyId;
    }

    public void setClassFdyId(Long classFdyId) {
        this.classFdyId = classFdyId;
    }

    public Long getClassLeaderId() {
        return classLeaderId;
    }

    public void setClassLeaderId(Long classLeaderId) {
        this.classLeaderId = classLeaderId;
    }

    public Byte getClassState() {
        return classState;
    }

    public void setClassState(Byte classState) {
        this.classState = classState;
    }
}