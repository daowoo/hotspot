package com.daowoo.hotspot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="t_car")
public class Car implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String plateNumber;
    private Timestamp time;
    private String siteName;

    public Car() {
    }

    public Car(String plateNumber, Timestamp time, String siteName) {
        this.plateNumber = plateNumber;
        this.time = time;
        this.siteName = siteName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", timeStamp=" + time +
                ", siteName='" + siteName + '\'' +
                '}';
    }
}
