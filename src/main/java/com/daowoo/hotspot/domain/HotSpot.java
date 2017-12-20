package com.daowoo.hotspot.domain;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;


/**
 * Created by apple on 09/11/2017.
 */
@Entity
@Table(name="t_phone")
public class HotSpot {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long phoneNumber;
    private String siteName;
    private Timestamp time;


    public HotSpot(Long phoneNumber, String siteName, Timestamp time) throws ParseException {
        this.phoneNumber = phoneNumber;
        this.siteName = siteName;
        this.time = time;
    }

    HotSpot(){}

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "HotSpot{" +
                "phoneNumber=" + phoneNumber +
                ", siteName='" + siteName + '\'' +
                ", time=" + time +
                '}';
    }
}

