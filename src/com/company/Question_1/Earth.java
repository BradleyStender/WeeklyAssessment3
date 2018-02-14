package com.company.Question_1;

public class Earth extends Planets {

    protected int precantageOfWater;
    protected String distanceFromTheSun;

    public Earth() {
    }

    public Earth(int precantageOfWater, String distanceFromTheSun) {
        this.precantageOfWater = precantageOfWater;
        this.distanceFromTheSun = distanceFromTheSun;
    }

    public Earth(int mass, String name, int precantageOfWater, String distanceFromTheSun) {
        super(mass, name);
        this.precantageOfWater = precantageOfWater;
        this.distanceFromTheSun = distanceFromTheSun;
    }

    public int getPrecantageOfWater() {
        return precantageOfWater;
    }

    public void setPrecantageOfWater(int precantageOfWater) {
        this.precantageOfWater = precantageOfWater;
    }

    public String getDistanceFromTheSun() {
        return distanceFromTheSun;
    }

    public void setDistanceFromTheSun(String distanceFromTheSun) {
        this.distanceFromTheSun = distanceFromTheSun;
    }
}
