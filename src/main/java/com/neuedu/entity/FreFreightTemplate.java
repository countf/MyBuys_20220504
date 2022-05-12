package com.neuedu.entity;

import java.math.BigDecimal;

public class FreFreightTemplate {
    private Integer freId;

    private String freCompany;

    private Integer warId;

    private String desCountry;

    private String desCountryId;

    private String desProvince;

    private String desProvinceId;

    private BigDecimal freFee;

    private String stsCd;

    public Integer getFreId() {
        return freId;
    }

    public void setFreId(Integer freId) {
        this.freId = freId;
    }

    public String getFreCompany() {
        return freCompany;
    }

    public void setFreCompany(String freCompany) {
        this.freCompany = freCompany == null ? null : freCompany.trim();
    }

    public Integer getWarId() {
        return warId;
    }

    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    public String getDesCountry() {
        return desCountry;
    }

    public void setDesCountry(String desCountry) {
        this.desCountry = desCountry == null ? null : desCountry.trim();
    }

    public String getDesCountryId() {
        return desCountryId;
    }

    public void setDesCountryId(String desCountryId) {
        this.desCountryId = desCountryId == null ? null : desCountryId.trim();
    }

    public String getDesProvince() {
        return desProvince;
    }

    public void setDesProvince(String desProvince) {
        this.desProvince = desProvince == null ? null : desProvince.trim();
    }

    public String getDesProvinceId() {
        return desProvinceId;
    }

    public void setDesProvinceId(String desProvinceId) {
        this.desProvinceId = desProvinceId == null ? null : desProvinceId.trim();
    }

    public BigDecimal getFreFee() {
        return freFee;
    }

    public void setFreFee(BigDecimal freFee) {
        this.freFee = freFee;
    }

    public String getStsCd() {
        return stsCd;
    }

    public void setStsCd(String stsCd) {
        this.stsCd = stsCd == null ? null : stsCd.trim();
    }
}