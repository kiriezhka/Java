package com.company.homework6;

import java.util.List;

public class House extends Build{
    protected int countResidents;
    public House(){

    }


    @Override
    public String toString() {
        return "House{" +
                "countResidents=" + countResidents +
                ", adress='" + adress + '\'' +
                ", openness=" + openness +
                '}';
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

    public int getCountResidents() {
        return countResidents;
    }

    public void setCountResidents(int countResidents) {
        this.countResidents = countResidents;
    }



    public House(String adress, Boolean openness, int countResidents) {
        super(adress, openness);
        this.countResidents = countResidents;

    }

    @Override
    public boolean isOpen() {
        return super.isOpen();
    }
}
