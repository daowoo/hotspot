package com.daowoo.hotspot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="t_phone2car")
public class PhoneToCar implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private long phoneNumber;
    private String plateNumber;
    private float probability;

    public PhoneToCar() {
    }

    public PhoneToCar(long phoneNumber, String plateNumber, float probability) {
        this.phoneNumber = phoneNumber;
        this.plateNumber = plateNumber;
        this.probability = probability;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public float getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "PhoneToCar{" +
                "phoneNumber=" + phoneNumber +
                ", plateNumber='" + plateNumber + '\'' +
                ", probability=" + probability +
                '}';
    }
}
