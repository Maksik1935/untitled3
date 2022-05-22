package com.company;

public class Main {

    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 56, 63, 91, 48, 12);
        Griffindor germionaGranger = new Griffindor("Germiona Granger", 39, 02, 86, 42, 96);
        Griffindor ronaldWisley = new Griffindor("Ronald Wisley" , 12, 99, 25, 81, 64);

        Kogtevran czouCzang = new Kogtevran("Czou Czang", 56, 12, 85, 63, 54, 89);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 74, 01, 96, 02, 78, 11);
        Kogtevran marqueseBelby = new Kogtevran("Marquese Belby", 11, 86, 56, 32, 03, 46);

        Puffenduy zachariaSmith = new Puffenduy("Zacharia Smith", 45, 12, 69, 56, 32);
        Puffenduy selryckDiggary = new Puffenduy("Selryck Diggary", 81, 99, 86, 63, 12);
        Puffenduy justinFilch = new Puffenduy("Justin Filch", 86, 12, 45, 02, 31);

        Slitheryn drakoMalfoy = new Slitheryn("Drako Malfoy", 26, 01, 06, 89, 46, 93, 100);
        Slitheryn grahamMontegry = new Slitheryn("Graham Montegry", 56, 64, 12, 86, 36, 78, 93);
        Slitheryn gregoryGoyle = new Slitheryn("Gregory Goyle", 13, 93, 33, 84, 23, 72, 67);

    }
    public void getBetterStudentWithSorceryPowerAndTransgressDistance(Hogwarts stud1, Hogwarts stud2) {
        if(stud1.getSorceryPower() > stud2.getSorceryPower()) {
            System.out.println(stud1.getName() + "обладает большей мощностью магии, чем " + stud2.getName());
        } else {
            System.out.println(stud2.getName() + "обладает большей мощностью магии, чем " + stud1.getName());
        }
        if(stud1.getTransgressDistance() > stud2.getTransgressDistance()) {
            System.out.println(stud1.getName() + "может дальше трансгрессировать, чем " + stud2.getName());
        } else {
            System.out.println(stud2.getName() + "может дальше трансгрессировать, чем " + stud1.getName());
        }
    }
}
