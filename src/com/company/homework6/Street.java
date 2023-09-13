package com.company.homework6;

import java.util.ArrayList;
import java.util.List;

public class Street implements Named, Trafficable{
    private String name;
    private Boolean traffic;
    private List<Build> builds;
    public Street(){

    }
    public Street(String name, Boolean traffic, List<Build> builds) {
        this.name = name;
        this.traffic = traffic;
        this.builds = builds;
    }

    public List<Build> getBuilds() {
        return builds;
    }
    public void config(){
        this.name = "Sevastopolskaya";
        this.traffic = true;
        this.builds = new Build().config();




    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", traffic=" + traffic +
                ", builds=" + builds +
                '}';
    }

    public void setBuilds(List<Build> builds) {
        this.builds = builds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTraffic() {
        return traffic;
    }

    public void setTraffic(Boolean traffic) {
        this.traffic = traffic;
    }

    public Street(String name, Boolean traffic) {
        this.name = name;
        this.traffic = traffic;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void openTraffic() {
        traffic = true;
    }

    @Override
    public void closeTraffic() {
        traffic = false;
    }

    @Override
    public boolean isTrafficOpen() {
        if(traffic) {
            return true;
        }
        else{
            return false;
        }
    }
}
