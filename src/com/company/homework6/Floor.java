package com.company.homework6;

import java.util.List;

public class Floor implements Named{
    protected String name;

    @Override
    public String toString() {
        return "Floor{" +
                "name='" + name + '\'' +
                '}';
    }

    public Floor(){

    }
    public void setName(String name) {
        this.name = name;
    }



    public Floor(String name) {
        this.name = name;

    }


    @Override
    public String getName() {
        return name;
    }
}
