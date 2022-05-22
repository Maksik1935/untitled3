package com.company;

public class Puffenduy extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honor; // this

    public Puffenduy(String name, int sorceryPower, int trasgressDistance, int diligence, int loyalty, int honor) {
        this.name = name;
        this.sorceryPower = sorceryPower;
        this.transgressDistance = trasgressDistance;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getDiligence() {
        return diligence;
    }
    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getSorceryPower() {
        return sorceryPower;
    }
    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public void setSorceryPower(int sorceryPower) {
        this.sorceryPower = sorceryPower;
    }
    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    @Override
    public String toString() {
        return "sorceryPower=" + sorceryPower +
                ", transgressDistance=" + transgressDistance +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                '}';
    }

    public void getBetterStudent(Puffenduy stud1, Puffenduy stud2) {
        int stud1Power = stud1.getDiligence() + stud1.getLoyalty() + stud1.getHonor();
        int stud2Power = stud2.getDiligence() + stud2.getLoyalty() + stud2.getHonor();

        if (stud1Power > stud2Power) {
            System.out.println(stud1.name + " лучший Пуффендуец, чем " + stud2.name);
        } else {
            System.out.println(stud2.name + " лучший Пуффендуец, чем " + stud1.name);
        }
    }
}
