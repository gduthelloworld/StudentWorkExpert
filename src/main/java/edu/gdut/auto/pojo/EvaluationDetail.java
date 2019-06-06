package edu.gdut.auto.pojo;

import java.util.Date;

public class EvaluationDetail {
    private Long ceId;

    private Byte ceYear;

    private Integer ceCollegeId;

    private Short ceStuClassCode;

    private Byte ceType;

    private Byte ceLevel;

    private Byte ceState;

    private String ceName;

    private String ceUnit;

    private Date ceTime;

    private Byte ceIsProve;

    private Date ceAddTime;

    private Date ceUpdateTime;

    private Long ceAddPersonId;

    private String ceRemark;

    private Byte ceDegree;

    private Double cePoint;

    private Long ceStuId;

    private Long ceCheckId;

    private String ceReply;

    public Long getCeId() {
        return ceId;
    }

    public void setCeId(Long ceId) {
        this.ceId = ceId;
    }

    public Byte getCeYear() {
        return ceYear;
    }

    public void setCeYear(Byte ceYear) {
        this.ceYear = ceYear;
    }

    public Integer getCeCollegeId() {
        return ceCollegeId;
    }

    public void setCeCollegeId(Integer ceCollegeId) {
        this.ceCollegeId = ceCollegeId;
    }

    public Short getCeStuClassCode() {
        return ceStuClassCode;
    }

    public void setCeStuClassCode(Short ceStuClassCode) {
        this.ceStuClassCode = ceStuClassCode;
    }

    public Byte getCeType() {
        return ceType;
    }

    public void setCeType(Byte ceType) {
        this.ceType = ceType;
    }

    public Byte getCeLevel() {
        return ceLevel;
    }

    public void setCeLevel(Byte ceLevel) {
        this.ceLevel = ceLevel;
    }

    public Byte getCeState() {
        return ceState;
    }

    public void setCeState(Byte ceState) {
        this.ceState = ceState;
    }

    public String getCeName() {
        return ceName;
    }

    public void setCeName(String ceName) {
        this.ceName = ceName == null ? null : ceName.trim();
    }

    public String getCeUnit() {
        return ceUnit;
    }

    public void setCeUnit(String ceUnit) {
        this.ceUnit = ceUnit == null ? null : ceUnit.trim();
    }

    public Date getCeTime() {
        return ceTime;
    }

    public void setCeTime(Date ceTime) {
        this.ceTime = ceTime;
    }

    public Byte getCeIsProve() {
        return ceIsProve;
    }

    public void setCeIsProve(Byte ceIsProve) {
        this.ceIsProve = ceIsProve;
    }

    public Date getCeAddTime() {
        return ceAddTime;
    }

    public void setCeAddTime(Date ceAddTime) {
        this.ceAddTime = ceAddTime;
    }

    public Date getCeUpdateTime() {
        return ceUpdateTime;
    }

    public void setCeUpdateTime(Date ceUpdateTime) {
        this.ceUpdateTime = ceUpdateTime;
    }

    public Long getCeAddPersonId() {
        return ceAddPersonId;
    }

    public void setCeAddPersonId(Long ceAddPersonId) {
        this.ceAddPersonId = ceAddPersonId;
    }

    public String getCeRemark() {
        return ceRemark;
    }

    public void setCeRemark(String ceRemark) {
        this.ceRemark = ceRemark == null ? null : ceRemark.trim();
    }

    public Byte getCeDegree() {
        return ceDegree;
    }

    public void setCeDegree(Byte ceDegree) {
        this.ceDegree = ceDegree;
    }

    public Double getCePoint() {
        return cePoint;
    }

    public void setCePoint(Double cePoint) {
        this.cePoint = cePoint;
    }

    public Long getCeStuId() {
        return ceStuId;
    }

    public void setCeStuId(Long ceStuId) {
        this.ceStuId = ceStuId;
    }

    public Long getCeCheckId() {
        return ceCheckId;
    }

    public void setCeCheckId(Long ceCheckId) {
        this.ceCheckId = ceCheckId;
    }

    public String getCeReply() {
        return ceReply;
    }

    public void setCeReply(String ceReply) {
        this.ceReply = ceReply == null ? null : ceReply.trim();
    }
}