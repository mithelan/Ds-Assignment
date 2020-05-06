package com.example.firealarm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Roomdetails {

    @Id
    @GeneratedValue
    private int id;
    private int floor;
    private int room;
    private int co2;
    private int smoke;
    private String status;

     public int getid(){return id;}
    public int getFloor() {
        return floor;
    }

    public int getRoom() {
        return room;
    }

    public int getCo2() {
        return co2;
    }

    public int getSmoke() {
        return smoke;
    }

    public String getStatus() {
        return status;
    }




}
