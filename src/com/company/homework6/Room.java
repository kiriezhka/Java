package com.company.homework6;

import java.util.ArrayList;

public class Room implements Named {
    private String name;
    private Integer size;
    @Override
    public String getName() {
        return name;
    }

    public Room(String name, Integer size) {
        this.name = name;
        this.size = size;
    }
    public Room(){

    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Room> config(){
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room("Kitchen", 25));
        rooms.add(new Room("Sleep", 30));
        rooms.add(new Room("Bathroom", 15));
        return rooms;
    }
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
