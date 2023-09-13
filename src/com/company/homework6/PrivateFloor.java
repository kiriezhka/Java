package com.company.homework6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PrivateFloor extends Floor{
    private List<Room> roomList;

    public PrivateFloor(String name, List<Room> roomList) {
        super(name);
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "PrivateFloor{" +
                "roomList=" + roomList +
                ", name='" + name + '\'' +
                '}';
    }

    public PrivateFloor(){

    }
    public ArrayList<PrivateFloor> config(){
        ArrayList<PrivateFloor> floors = new ArrayList<PrivateFloor>();
        Room room = new Room();
        floors.add(new PrivateFloor("1th", room.config()));
        return floors;
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public List<Room> getRoomsList() {
        return roomList;
    }

    public void setRoomsList(List<Room> roomList) {
        this.roomList = roomList;
    }
}
