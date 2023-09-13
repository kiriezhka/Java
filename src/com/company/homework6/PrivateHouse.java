package com.company.homework6;

import java.util.ArrayList;
import java.util.List;

public class PrivateHouse extends House{
    private List<PrivateFloor> privateFloors;

    public PrivateHouse(String adress, Boolean openness, int countResidents, List<PrivateFloor> privateFloors) {
        super(adress, openness, countResidents);
        this.privateFloors = privateFloors;
    }
    public PrivateHouse(){

    }

    @Override
    public String toString() {
        return "PrivateHouse{" +
                "privateFloors=" + privateFloors +
                ", countResidents=" + countResidents +
                ", adress='" + adress + '\'' +
                ", openness=" + openness +
                '}';
    }

    public PrivateHouse configHouse(){
        PrivateFloor floors = new PrivateFloor();
        return new PrivateHouse("88A", true, 3, floors.config());
    }
    public List<PrivateFloor> getPrivateFloors() {
        return privateFloors;
    }

    public void setPrivateFloors(List<PrivateFloor> privateFloors) {
        this.privateFloors = privateFloors;
    }


    @Override
    public void setAdress(String adress) {
        super.setAdress(adress);
    }

    @Override
    public void setOpenness(Boolean openness) {
        super.setOpenness(openness);
    }



    @Override
    public String getAdress() {
        return super.getAdress();
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public int getCountResidents() {
        return super.getCountResidents();
    }

    @Override
    public void setCountResidents(int countResidents) {
        super.setCountResidents(countResidents);
    }





    @Override
    public boolean isOpen() {
        return super.isOpen();
    }
}
