package com.company;

public class Griffindor extends Hogwarts{
    private int nobility;
    private int honour;
    private int bravery; // this

    public Griffindor(String name, int sorceryPower, int transgressDistance, int nobility, int honour, int bravery) {
        this.name = name;
        this.sorceryPower = sorceryPower;
        this.transgressDistance = transgressDistance;
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }
    public int getHonour() {
        return honour;
    }
    public int getBravery() {
        return bravery;
    }
    public int getSorceryPower() {
        return sorceryPower;
    }
    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public void setHonour(int honour) {
        this.honour = honour;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void setSorceryPower(int sorceryPower) {
        this.sorceryPower = sorceryPower;
    }
    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    @Override
    public String toString() {
        return "nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                ", sorceryPower=" + sorceryPower +
                ", transgressDistance=" + transgressDistance +
                '}';
    }

    public void getBetterStudent(Griffindor stud1, Griffindor stud2) {
        int stud1Power = stud1.getBravery() + stud1.getHonour() + stud1.getNobility();
        int stud2Power = stud2.getBravery() + stud2.getHonour() + stud2.getNobility();

        if (stud1Power > stud2Power) {
            System.out.println(stud1.name + " лучший Гриффиндорец, чем " + stud2.name);
        } else {
            System.out.println(stud2.name + " лучший Гриффиндорец, чем " + stud1.name);
        }
    }
}
