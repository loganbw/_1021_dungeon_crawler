package com.logan;

public class Floor {
    public Floor() {

    }

    private int floorLevel = 1;
    private int maxFloor = 10;

    public Floor(int floorLevel) {
        this.floorLevel = floorLevel;
    }

    public void advanced(){
        floorLevel++;
    }

}
