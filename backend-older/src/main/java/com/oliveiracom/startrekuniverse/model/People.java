package com.oliveiracom.startrekuniverse.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "people")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String peopleName; // name of people
    private String peopleHome; // where this people live
    private String peoplePositionId; // are they neutral, ally or enemies
 
    public People() {
  
    }

    public People(long id, String peopleName, String peopleHome, String peoplePositionId) {
        this.id = id;
        this.peopleName = peopleName;
        this.peopleHome = peopleHome;
        this.peoplePositionId = peoplePositionId;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPeopleName() {
        return this.peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getPeopleHome() {
        return this.peopleHome;
    }

    public void setPeopleHome(String peopleHome) {
        this.peopleHome = peopleHome;
    }

    public String getPeoplePositionId() {
        return this.peoplePositionId;
    }

    public void setPeoplePositionId(String peoplePositionId) {
        this.peoplePositionId = peoplePositionId;
    }

    public People id(long id) {
        this.id = id;
        return this;
    }

    public People peopleName(String peopleName) {
        this.peopleName = peopleName;
        return this;
    }

    public People peopleHome(String peopleHome) {
        this.peopleHome = peopleHome;
        return this;
    }

    public People peoplePositionId(String peoplePositionId) {
        this.peoplePositionId = peoplePositionId;
        return this;
    }

    @Override
    public String toString() {
        return "People [id=" + id + ", peopleName=" + peopleName + ", peopleHome=" + peopleHome + ", peoplePositionId=" + peoplePositionId
       + "]";
    }
 
}