package com.company;

public class Slitheryn extends Hogwarts{
    private int cunning;
    private int decisiveness;
    private int ambitious;
    private int resourcefulness;
    private int lustPower; // this

    public Slitheryn(String name, int sorceryPower, int transgressDistance, int cunning, int decisiveness, int ambitious, int resourcefulness, int lustPower) {
        this.name = name;
        this.sorceryPower = sorceryPower;
        this.transgressDistance = transgressDistance;
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambitious = ambitious;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }

    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getDecisiveness() {
        return decisiveness;
    }
    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }
    public int getAmbitious() {
        return ambitious;
    }
    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getLustPower() {
        return lustPower;
    }
    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }
    public int getSorceryPower() {
        return sorceryPower;
    }
    public int getTransgressDistance() {
        return transgressDistance;
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
                ", cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambitious=" + ambitious +
                ", resourcefulness=" + resourcefulness +
                ", lustPower=" + lustPower +
                '}';
    }

    public void getBetterStudent(Slitheryn stud1, Slitheryn stud2) {
        int stud1Power = stud1.getCunning() + stud1.getDecisiveness() + stud1.getAmbitious() + stud1.getResourcefulness() + stud1.getLustPower();
        int stud2Power = stud2.getCunning() + stud2.getDecisiveness() + stud2.getAmbitious() + stud2.getResourcefulness() + stud2.getLustPower();

        if (stud1Power > stud2Power) {
            System.out.println(stud1.name + " лучший Пуффендуец, чем " + stud2.name);
        } else {
            System.out.println(stud2.name + " лучший Пуффендуец, чем " + stud1.name);
        }
    }
}
