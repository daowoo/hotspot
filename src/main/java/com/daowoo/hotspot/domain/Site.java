package com.daowoo.hotspot.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="t_site")
public class Site implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String site_name;
    private String ip;
    private String local_path;
    private double longitude;
    private double latitude;

    public Site() {
    }

    public Site(String site_name, String ip, String local_path, double longitude, double latitude) {
        this.site_name = site_name;
        this.ip = ip;
        this.local_path = local_path;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getIP() {
        return ip;
    }

    public void setIP(String ip) {
        this.ip = ip;
    }

    public String getLocal_path() {
        return local_path;
    }

    public void setLocal_path(String local_path) {
        this.local_path = local_path;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Site{" +
                "site_name='" + site_name + '\'' +
                ", ip='" + ip + '\'' +
                ", local_path='" + local_path + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
