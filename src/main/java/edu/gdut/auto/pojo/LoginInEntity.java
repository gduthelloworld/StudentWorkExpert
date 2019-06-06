package edu.gdut.auto.pojo;

import java.util.Date;

public class LoginInEntity {
    /*id*/
    private Long id;
    /*用户id*/
    private Long userId;
    /*登陆时间，数据库自动插入*/
    private Date loginDate;
    /*登陆的ip*/
    private String ip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public LoginInEntity() {
    }

    public LoginInEntity(Long id, Long userId, Date loginDate, String ip) {
        this.id = id;
        this.userId = userId;
        this.loginDate = loginDate;
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "LoginInEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", loginDate=" + loginDate +
                ", ip='" + ip + '\'' +
                '}';
    }
}