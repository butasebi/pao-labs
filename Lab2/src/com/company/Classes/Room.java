package com.company.Classes;

public class Room {
    int number;
    String type;
    int floor;

    public Room() {
        number = 0;
        type = "";
        floor = 0;
    }

    public Room(int number, String type, int floor) {
        this.number = number;
        this.type = type;
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
