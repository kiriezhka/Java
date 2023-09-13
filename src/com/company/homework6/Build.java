package com.company.homework6;

import java.util.ArrayList;

public class Build implements Adressable, Openable{

    protected String adress;
    protected Boolean openness;


    public Build(){

    }

    @Override
    public String toString() {
        return "Build{" +
                "adress='" + adress + '\'' +
                ", openness=" + openness +
                '}';
    }

    public ArrayList<Build> config(){
        ArrayList<Build> builds = new ArrayList<Build>();

        ApartmentHouse apartmentHouse = new ApartmentHouse();
        PrivateHouse privateHouse = new PrivateHouse();
        Shop shop = new Shop();
        School school = new School();
        builds.add(apartmentHouse.configHouse());
        builds.add(privateHouse.configHouse());
        builds.add(shop.configShop());
        builds.add(school.configSchool());
        return builds;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setOpenness(Boolean openness) {
        this.openness = openness;
    }



    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public void open() {
        openness = true;
    }

    @Override
    public void close() {
        openness = false;
    }

    public Build(String adress, Boolean openness) {

        this.adress = adress;
        this.openness = openness;
    }

    @Override
    public boolean isOpen() {
        if(openness){
            return true;
        }
        else{
            return false;
        }
    }
}
