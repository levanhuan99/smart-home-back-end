package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "bed_room")
public class BedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "open_date")
    private String openDate;

    @Column(name = "close_date")
    private String close_date;

    @Column(name = "status")
    private int status;

    public BedRoom() {
    }

    public BedRoom(Integer id, String openDate, String close_date, int status) {
        this.id = id;
        this.openDate = openDate;
        this.close_date = close_date;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getClose_date() {
        return close_date;
    }

    public void setClose_date(String close_date) {
        this.close_date = close_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
