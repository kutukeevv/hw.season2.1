package com.company;

public final class Vnuchka extends Dochka {
    private String Sadik;
    private Colors colors;
    private Chelovek chelovek;

    public Chelovek getChelovek() {
        return chelovek;
    }

    public Vnuchka(String name, String hobby, String sadik, Colors colors, Chelovek chelovek) {
        super(name, hobby);
        Sadik = sadik;
        this.colors = colors;
        this.chelovek = chelovek;
    }

    public String getSadik() {
        return Sadik;
    }

    public Colors getColors() {
        return colors;
    }

    @Override
    public void cook(String nameOf, int kolichestvo) {
        System.out.println("Blyudo ot vnuchki: " + nameOf + " Porcii" +kolichestvo);
    }

    @Override
    public void printStatistics() {
        super.printStatistics();
        System.out.println("Sadik " + getSadik() + " Colors " + getColors() + "Chelovek" + getChelovek().getAge());
    }
}
