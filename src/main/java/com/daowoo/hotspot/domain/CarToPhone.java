package com.daowoo.hotspot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="t_car2phone")
public class CarToPhone implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String plateNumber;
    private long phoneNumber;
    private float probability;

    public CarToPhone() {
    }

    public CarToPhone(String plateNumber, long phoneNumber, float probability) {
        this.plateNumber = plateNumber;
        this.phoneNumber = phoneNumber;
        this.probability = probability;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "CarToPhone{" +
                "plateNumber='" + plateNumber + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", probability=" + probability +
                '}';
    }
}
