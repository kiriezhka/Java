package com.company.homework6;

import java.util.ArrayList;
import java.util.List;

public class ApartmentFloor extends Floor{
    private List<Apartment> apartments;

    public ApartmentFloor(String name, List<Apartment> apartments) {
        super(name);
        this.apartments = apartments;
    }
    public ApartmentFloor(){

    }

    @Override
    public String toString() {
        return "ApartmentFloor{" +
                "apartments=" + apartments +
                ", name='" + name + '\'' +
                '}';
    }

    public ArrayList<ApartmentFloor> config(){
        ArrayList<ApartmentFloor> apartmentFloors = new ArrayList<ApartmentFloor>();
        Apartment apartment = new Apartment();
        apartmentFloors.add(new ApartmentFloor("1th", apartment.config()));
        apartmentFloors.add(new ApartmentFloor("2th", apartment.config()));
        apartmentFloors.add(new ApartmentFloor("3th", apartment.config()));
        apartmentFloors.add(new ApartmentFloor("4th", apartment.config()));
        apartmentFloors.add(new ApartmentFloor("5th", apartment.config()));
        return apartmentFloors;
    }
    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public ApartmentFloor(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
