package com.example.myapplication;

public class Ship {
    private String orientation;
    private long lenght;
    private long health;

    public Ship(String orientation, long lenght) {
        this.orientation = orientation;
        this.lenght = lenght;
        this.health=lenght;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public long getLenght() {
        return lenght;
    }

    public void setLenght(long lenght) {
        this.lenght = lenght;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }
}
