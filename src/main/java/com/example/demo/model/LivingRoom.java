package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="LivingRoom")
public class LivingRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date openDoorTime;
    private Date closeDoorTime;

    public LivingRoom() {
    }
    public LivingRoom(Integer id, Date openDoorTime, Date closeDoorTime) {
        this.id = id;
        this.openDoorTime = openDoorTime;
        this.closeDoorTime = closeDoorTime;
    }

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOpenDoorTime() {
        return openDoorTime;
    }

    public void setOpenDoorTime(Date openDoorTime) {
        this.openDoorTime = openDoorTime;
    }

    public Date getCloseDoorTime() {
        return closeDoorTime;
    }

    public void setCloseDoorTime(Date closeDoorTime) {
        this.closeDoorTime = closeDoorTime;
    }
}
