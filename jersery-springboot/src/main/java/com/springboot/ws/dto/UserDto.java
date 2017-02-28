package com.springboot.ws.dto;

import java.util.Set;

/**
 * Created by zbz on 2017/2/28.
 */
public class UserDto {
    private String userName;
    private String userDisplayName;
    private String mobilePhone;
    private String email;

    private String userGroup;
    private String phone;
    private String contact;
    private Set<String> authorities;
    private Boolean isOnline;//用户状态
    private Integer restRecordTimes;//剩余预录次数

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<String> authorities) {
        this.authorities = authorities;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Integer getRestRecordTimes() {
        return restRecordTimes;
    }

    public void setRestRecordTimes(Integer restRecordTimes) {
        this.restRecordTimes = restRecordTimes;
    }
}
