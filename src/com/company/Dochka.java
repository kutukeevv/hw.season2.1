package com.company;

public class Dochka extends Babushka {
    private String hobby;

    public Dochka(String name, String hobby) {
        super(name);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void cook(String nameOf, int kolichestvo){
        System.out.println("Blyudo: " + nameOf + " Porcii" + kolichestvo);
    }

    public final void cook(String nameOf){
        System.out.println("Blyudo: " + nameOf );
    }

    public void printStatistics(){
        System.out.println("Hobby" + hobby);
    }
}
