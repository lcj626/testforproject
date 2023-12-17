package com.ohgiraffers.project.user.dto;

import java.sql.Date;

public class UserDTO {

    private int code;
    private String email;
    private String password;
    private String nickname;
    private String phone;
    private String sns;
    private String status;
    private String auth;
    private Date registDate;
    private Date updateDate;
    private int imageNo;
    private String profileImageOriginalName;
    private String profileImageChangedName;
    private String profileImageExt;
    private String profileImagePath;
    private Date profileImageRegistDate;
    private Date profileImageUpdateDate;
    private String profileImageStatus;


    public UserDTO() {
    }

    public UserDTO(int code, String email, String password, String nickname, String phone, String sns, String status, String auth, Date registDate, Date updateDate, int imageNo, String profileImageOriginalName, String profileImageChangedName, String profileImageExt, String profileImagePath, Date profileImageRegistDate, Date profileImageUpdateDate, String profileImageStatus) {
        this.code = code;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
        this.sns = sns;
        this.status = status;
        this.auth = auth;
        this.registDate = registDate;
        this.updateDate = updateDate;
        this.imageNo = imageNo;
        this.profileImageOriginalName = profileImageOriginalName;
        this.profileImageChangedName = profileImageChangedName;
        this.profileImageExt = profileImageExt;
        this.profileImagePath = profileImagePath;
        this.profileImageRegistDate = profileImageRegistDate;
        this.profileImageUpdateDate = profileImageUpdateDate;
        this.profileImageStatus = profileImageStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSns() {
        return sns;
    }

    public void setSns(String sns) {
        this.sns = sns;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getImageNo() {
        return imageNo;
    }

    public void setImageNo(int imageNo) {
        this.imageNo = imageNo;
    }

    public String getProfileImageOriginalName() {
        return profileImageOriginalName;
    }

    public void setProfileImageOriginalName(String profileImageOriginalName) {
        this.profileImageOriginalName = profileImageOriginalName;
    }

    public String getProfileImageChangedName() {
        return profileImageChangedName;
    }

    public void setProfileImageChangedName(String profileImageChangedName) {
        this.profileImageChangedName = profileImageChangedName;
    }

    public String getProfileImageExt() {
        return profileImageExt;
    }

    public void setProfileImageExt(String profileImageExt) {
        this.profileImageExt = profileImageExt;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }

    public void setProfileImagePath(String profileImagePath) {
        this.profileImagePath = profileImagePath;
    }

    public Date getProfileImageRegistDate() {
        return profileImageRegistDate;
    }

    public void setProfileImageRegistDate(Date profileImageRegistDate) {
        this.profileImageRegistDate = profileImageRegistDate;
    }

    public Date getProfileImageUpdateDate() {
        return profileImageUpdateDate;
    }

    public void setProfileImageUpdateDate(Date profileImageUpdateDate) {
        this.profileImageUpdateDate = profileImageUpdateDate;
    }

    public String getProfileImageStatus() {
        return profileImageStatus;
    }

    public void setProfileImageStatus(String profileImageStatus) {
        this.profileImageStatus = profileImageStatus;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "code=" + code +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", sns='" + sns + '\'' +
                ", status='" + status + '\'' +
                ", auth='" + auth + '\'' +
                ", registDate=" + registDate +
                ", updateDate=" + updateDate +
                ", imageNo=" + imageNo +
                ", profileImageOriginalName='" + profileImageOriginalName + '\'' +
                ", profileImageChangedName='" + profileImageChangedName + '\'' +
                ", profileImageExt='" + profileImageExt + '\'' +
                ", profileImagePath='" + profileImagePath + '\'' +
                ", profileImageRegistDate=" + profileImageRegistDate +
                ", profileImageUpdateDate=" + profileImageUpdateDate +
                ", profileImageStatus='" + profileImageStatus + '\'' +
                '}';
    }
}
