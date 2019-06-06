package edu.gdut.auto.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * User type
     */
    public static final Byte User_Admin=1;
    public static final Byte User_Student=2;
    public static final Byte User_Teacher=3;
    public static final Byte User_Manger=4;
    /**
     * User State
     */
    public static final Byte User_Delete=0;
    public static final Byte User_Normal=1;
    public static final Byte User_Lock=2;
    public static final Byte User_Finsh=3;


    private Long userId;

    private Byte userType;

    private Byte userState;

    private String userName;

    private Byte userError;

    private String userPwd;

    private String userRemark;

    private Short userClassCode;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Byte getUserState() {
        return userState;
    }

    public void setUserState(Byte userState) {
        this.userState = userState;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getUserError() {
        return userError;
    }

    public void setUserError(Byte userError) {
        this.userError = userError;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }

    public Short getUserClassCode() {
        return userClassCode;
    }

    public void setUserClassCode(Short userClassCode) {
        this.userClassCode = userClassCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userType=" + userType +
                ", userState=" + userState +
                ", userName='" + userName + '\'' +
                ", userError=" + userError +
                ", userPwd='" + userPwd + '\'' +
                ", userRemark='" + userRemark + '\'' +
                ", userClassCode=" + userClassCode +
                '}';
    }
}