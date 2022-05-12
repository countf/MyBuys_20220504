package com.neuedu.entity;

import java.util.Date;

public class LoaLogisticsAccount {
    private Integer loaId;

    private String logisticsCd;

    private String supin;

    private String sucode;

    private String warehouseCd;

    private String email;

    private String password;

    private String hirhcode;

    private String mobile;

    private String nickName;

    private String firstName;

    private String lastName;

    private Integer manId;

    private String createdBy;

    private Date creationDate;

    private String lastUpdateBy;

    private Date lastUpdateDate;

    private Integer callCnt;

    private String remark;

    private String stsCd;

    public Integer getLoaId() {
        return loaId;
    }

    public void setLoaId(Integer loaId) {
        this.loaId = loaId;
    }

    public String getLogisticsCd() {
        return logisticsCd;
    }

    public void setLogisticsCd(String logisticsCd) {
        this.logisticsCd = logisticsCd == null ? null : logisticsCd.trim();
    }

    public String getSupin() {
        return supin;
    }

    public void setSupin(String supin) {
        this.supin = supin == null ? null : supin.trim();
    }

    public String getSucode() {
        return sucode;
    }

    public void setSucode(String sucode) {
        this.sucode = sucode == null ? null : sucode.trim();
    }

    public String getWarehouseCd() {
        return warehouseCd;
    }

    public void setWarehouseCd(String warehouseCd) {
        this.warehouseCd = warehouseCd == null ? null : warehouseCd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHirhcode() {
        return hirhcode;
    }

    public void setHirhcode(String hirhcode) {
        this.hirhcode = hirhcode == null ? null : hirhcode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStsCd() {
        return stsCd;
    }

    public void setStsCd(String stsCd) {
        this.stsCd = stsCd == null ? null : stsCd.trim();
    }
}