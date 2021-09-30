package com.example.demo.model;

public class LivingRoomRequest {
    private  long openTime;
    private  long closeTime;

    public LivingRoomRequest(long openTime, long closeTime) {
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public LivingRoomRequest() {
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }
}
