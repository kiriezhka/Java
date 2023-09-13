package com.company.homework6;

import java.util.List;

public class ApartmentHouse extends House{
    private List<ApartmentFloor> apartmentFloors;

    public ApartmentHouse(String adress, Boolean openness, int countResidents, List<ApartmentFloor> apartmentFloors) {
        super(adress, openness, countResidents);
        this.apartmentFloors = apartmentFloors;
    }
    public ApartmentHouse(){

    }

    @Override
    public String toString() {
        return "ApartmentHouse{" +
                "apartmentFloors=" + apartmentFloors +
                ", countResidents=" + countResidents +
                ", adress='" + adress + '\'' +
                ", openness=" + openness +
                '}';
    }

    public ApartmentHouse configHouse(){
        ApartmentFloor apartmentFloor = new ApartmentFloor();
        return new ApartmentHouse("41Zh", false, 240, apartmentFloor.config());
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

    public List<ApartmentFloor> getApartmentFloors() {
        return apartmentFloors;
    }

    public void setApartmentFloors(List<ApartmentFloor> apartmentFloors) {
        this.apartmentFloors = apartmentFloors;
    }
}
