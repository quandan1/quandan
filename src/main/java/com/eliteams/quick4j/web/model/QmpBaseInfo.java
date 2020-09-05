package com.eliteams.quick4j.web.model;

public class QmpBaseInfo {
    private Integer id;

    private String sectionLevel;

    private String ykh108;

    private String hlsz90;

    private String originalId;

    private String locProvince;

    private String locCity;

    private String locDistrict;

    private String czName;

    private String sectionName;

    private String basin;

    private String riverName;

    private String sectionSx;

    private String riverLevel;

    private String sksk;

    private String longitude;

    private String latitude;

    private String isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSectionLevel() {
        return sectionLevel;
    }

    public void setSectionLevel(String sectionLevel) {
        this.sectionLevel = sectionLevel == null ? null : sectionLevel.trim();
    }

    public String getYkh108() {
        return ykh108;
    }

    public void setYkh108(String ykh108) {
        this.ykh108 = ykh108 == null ? null : ykh108.trim();
    }

    public String getHlsz90() {
        return hlsz90;
    }

    public void setHlsz90(String hlsz90) {
        this.hlsz90 = hlsz90 == null ? null : hlsz90.trim();
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId == null ? null : originalId.trim();
    }

    public String getLocProvince() {
        return locProvince;
    }

    public void setLocProvince(String locProvince) {
        this.locProvince = locProvince == null ? null : locProvince.trim();
    }

    public String getLocCity() {
        return locCity;
    }

    public void setLocCity(String locCity) {
        this.locCity = locCity == null ? null : locCity.trim();
    }

    public String getLocDistrict() {
        return locDistrict;
    }

    public void setLocDistrict(String locDistrict) {
        this.locDistrict = locDistrict == null ? null : locDistrict.trim();
    }

    public String getCzName() {
        return czName;
    }

    public void setCzName(String czName) {
        this.czName = czName == null ? null : czName.trim();
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    public String getBasin() {
        return basin;
    }

    public void setBasin(String basin) {
        this.basin = basin == null ? null : basin.trim();
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName == null ? null : riverName.trim();
    }

    public String getSectionSx() {
        return sectionSx;
    }

    public void setSectionSx(String sectionSx) {
        this.sectionSx = sectionSx == null ? null : sectionSx.trim();
    }

    public String getRiverLevel() {
        return riverLevel;
    }

    public void setRiverLevel(String riverLevel) {
        this.riverLevel = riverLevel == null ? null : riverLevel.trim();
    }

    public String getSksk() {
        return sksk;
    }

    public void setSksk(String sksk) {
        this.sksk = sksk == null ? null : sksk.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}