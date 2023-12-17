package com.ohgiraffers.project.user.dto;

import java.sql.Date;
import java.sql.Time;

public class ReservationDTO {

    private int reservNo;

    private int code;

    private Date reservDate;

    private Time reservTime;

    private int reservPerson;

    private int reservTotalCost;

    private String reservStatus;

    private String reservCancelReason;

    private Date reservCancelDate;

    private Date reservRegistDate;

    private int roomNo;

    public ReservationDTO() {
    }

    public ReservationDTO(int reservNo, int code, Date reservDate, Time reservTime, int reservPerson, int reservTotalCost, String reservStatus, String reservCancelReason, Date reservCancelDate, Date reservRegistDate, int roomNo) {
        this.reservNo = reservNo;
        this.code = code;
        this.reservDate = reservDate;
        this.reservTime = reservTime;
        this.reservPerson = reservPerson;
        this.reservTotalCost = reservTotalCost;
        this.reservStatus = reservStatus;
        this.reservCancelReason = reservCancelReason;
        this.reservCancelDate = reservCancelDate;
        this.reservRegistDate = reservRegistDate;
        this.roomNo = roomNo;
    }

    public int getReservNo() {
        return reservNo;
    }

    public void setReservNo(int reservNo) {
        this.reservNo = reservNo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getReservDate() {
        return reservDate;
    }

    public void setReservDate(Date reservDate) {
        this.reservDate = reservDate;
    }

    public Time getReservTime() {
        return reservTime;
    }

    public void setReservTime(Time reservTime) {
        this.reservTime = reservTime;
    }

    public int getReservPerson() {
        return reservPerson;
    }

    public void setReservPerson(int reservPerson) {
        this.reservPerson = reservPerson;
    }

    public int getReservTotalCost() {
        return reservTotalCost;
    }

    public void setReservTotalCost(int reservTotalCost) {
        this.reservTotalCost = reservTotalCost;
    }

    public String getReservStatus() {
        return reservStatus;
    }

    public void setReservStatus(String reservStatus) {
        this.reservStatus = reservStatus;
    }

    public String getReservCancelReason() {
        return reservCancelReason;
    }

    public void setReservCancelReason(String reservCancelReason) {
        this.reservCancelReason = reservCancelReason;
    }

    public Date getReservCancelDate() {
        return reservCancelDate;
    }

    public void setReservCancelDate(Date reservCancelDate) {
        this.reservCancelDate = reservCancelDate;
    }

    public Date getReservRegistDate() {
        return reservRegistDate;
    }

    public void setReservRegistDate(Date reservRegistDate) {
        this.reservRegistDate = reservRegistDate;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "reservNo=" + reservNo +
                ", code=" + code +
                ", reservDate=" + reservDate +
                ", reservTime=" + reservTime +
                ", reservPerson=" + reservPerson +
                ", reservTotalCost=" + reservTotalCost +
                ", reservStatus='" + reservStatus + '\'' +
                ", reservCancelReason='" + reservCancelReason + '\'' +
                ", reservCancelDate=" + reservCancelDate +
                ", reservRegistDate=" + reservRegistDate +
                ", roomNo=" + roomNo +
                '}';
    }
}
