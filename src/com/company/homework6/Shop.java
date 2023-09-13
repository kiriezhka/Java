package com.company.homework6;

public class Shop extends  Build{
    private String name;
    private String type;


    public Shop(String name, String adress, Boolean openness, String type) {
        super(adress, openness);
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", adress='" + adress + '\'' +
                ", openness=" + openness +
                '}';
    }

    public Shop(){

    }

    public Shop configShop(){
        return new Shop("Silpo", "47", false, "Produktoviy");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAdress(String adress) {
        super.setAdress(adress);
    }

    @Override
    public void setOpenness(Boolean openness) {
        super.setOpenness(openness);
    }


    public String getName() {
        return name;
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
    public boolean isOpen() {
        return super.isOpen();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
