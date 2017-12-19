package com.daowoo.hotspot.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;


/**
 * Created by apple on 09/11/2017.
 */
@Entity
@Table(name="t_hotspot")
public class HotSpot {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long IMSI;
    private String location;
    private String moduleName;
    private String referredNumber;
    private String city;
    private String communicationType;
    private Date collectTime;

    @Transient
    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


    public HotSpot(Long IMSI, String location, String moduleName, String referredNumber, String stateLocation, String communicationType, String collectTime) throws ParseException {
        this.IMSI = IMSI;
        this.location = location;
        this.moduleName = moduleName;
        this.referredNumber = referredNumber;
        this.city = stateLocation;
        this.communicationType = communicationType;
        this.collectTime = format.parse(collectTime);
    }

    HotSpot(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIMSI() {
        return IMSI;
    }

    public void setIMSI(Long IMSI) {
        this.IMSI = IMSI;
    }

    public String getSiteLocation() {
        return location;
    }

    public void setSiteLocation(String location) {
        this.location = location;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getReferredNumber() {
        return referredNumber;
    }

    public void setReferredNumber(String referredNumber) {
        this.referredNumber = referredNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunicationType() {
        return communicationType;
    }

    public void setCommunicationType(String communicationType) {
        this.communicationType = communicationType;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date timestamp) {
        this.collectTime = timestamp;
    }

    @Override
    public String toString() {
        return "SpotEntry{" +
                "IMSI=" + IMSI +
                ", location='" + location + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", referredNumber='" + referredNumber + '\'' +
                ", city='" + city + '\'' +
                ", communicationType='" + communicationType + '\'' +
                ", collectTime=" + collectTime +
                '}';
    }
}

