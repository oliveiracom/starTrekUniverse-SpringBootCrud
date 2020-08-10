package com.oliveiracom.startrekuniverse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "people")
public class People {

    private long id;
    private String peopleName; // name of people
    private String peopleHome; // where this people live
    private String peoplePositionId; // are they neutral, ally or enemies
 
    public People() {
  
    }
 
    public People(String peopleName, String lastName, String emailId) {
         this.peopleName = peopleName;
         this.peopleHome = peopleHome;
         this.peoplePositionId = peoplePositionId;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "people_name", nullable = false)
    public String getPeopleName() {
        return peopleName;
    }
    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }
 
    @Column(name = "people_home", nullable = false)
    public String getPeopleHome() {
        return peopleHome;
    }
    public void setPeopleHome(String peopleHome) {
        this.peopleHome = peopleHome;
    }
 
    @Column(name = "people_position_id", nullable = false)
    public String getPeoplePositionId() {
        return peoplePositionId;
    }
    public void setPeoplePositionId(String peoplePositionId) {
        this.peoplePositionId = peoplePositionId;
    }

    @Override
    public String toString() {
        return "People [id=" + id + ", peopleName=" + peopleName + ", peopleHome=" + peopleHome + ", peoplePositionId=" + peoplePositionId
       + "]";
    }
 
}