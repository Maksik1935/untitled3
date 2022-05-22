package com.company;

public abstract class Hogwarts {
    protected int sorceryPower;
    protected int transgressDistance;
    protected String name; // this


    protected void getBetterStudent(Hogwarts stud1, Hogwarts stud2) {

    }

    public int getSorceryPower() {
        return sorceryPower;
    }
    public void setSorceryPower(int sorceryPower) {
        this.sorceryPower = sorceryPower;
    }
    public int getTransgressDistance() {
        return transgressDistance;
    }
    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

}
