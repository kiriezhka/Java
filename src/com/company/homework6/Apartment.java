package com.company.homework6;

import java.util.ArrayList;
import java.util.List;

public class Apartment implements Named {
    private String name;
    private List<Person> persons;
    private List<Room> roomList;

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Apartment(String name, List<Person> persons, List<Room> roomList) {
        this.name = name;
        this.persons = persons;
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", persons=" + persons +
                ", roomList=" + roomList +
                '}';
    }

    public Apartment(){

    }
    public ArrayList<Apartment> config(){
        ArrayList<Apartment> apartments = new ArrayList<Apartment>();
        Person person = new Person();
        Room room = new Room();
        apartments.add(new Apartment("1", person.config(), room.config()));
        apartments.add(new Apartment("2", person.config(), room.config()));
        apartments.add(new Apartment("3", person.config(), room.config()));
        apartments.add(new Apartment("4", person.config(), room.config()));
        apartments.add(new Apartment("5", person.config(), room.config()));
        return apartments;

    }
    public List<Room> getRoomsList() {
        return roomList;
    }

    public void setRoomsList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String getName() {
        return name;
    }
}
