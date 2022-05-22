package com.company;

public class Kogtevran extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity; // this

    public Kogtevran(String name, int sorceryPower, int transgressDistance, int mind, int wisdom, int wit, int creativity) {
        this.name = name;
        this.sorceryPower = sorceryPower;
        this.transgressDistance = transgressDistance;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }
    public void setMind(int mind) {
        this.mind = mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }
    public int getCreativity() {
        return creativity;
    }
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void setSorceryPower(int sorceryPower) {
        this.sorceryPower = sorceryPower;
    }
    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }
    public int getSorceryPower() {
        return sorceryPower;
    }
    public int getTransgressDistance() {
        return transgressDistance;
    }

    @Override
    public String toString() {
        return "sorceryPower=" + sorceryPower +
                ", transgressDistance=" + transgressDistance +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public void getBetterStudent(Kogtevran stud1, Kogtevran stud2) {
        int stud1Power = stud1.getMind() + stud1.getWisdom() + stud1.getWit() + stud2.getCreativity();
        int stud2Power = stud2.getMind() + stud2.getWisdom() + stud2.getWit() + stud2.getCreativity();

        if (stud1Power > stud2Power) {
            System.out.println(stud1.name + " лучший Когтевранец, чем " + stud2.name);
        } else {
            System.out.println(stud2.name + " лучший Когтевранец, чем " + stud1.name);
        }
    }
}
