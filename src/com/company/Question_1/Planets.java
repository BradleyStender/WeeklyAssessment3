package com.company.Question_1;

public class Planets {

    protected int mass;
    protected String name;


    public Planets() {
    }

    public Planets(int mass, String name) {
        this.mass = mass;
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
