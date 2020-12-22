package com.company;

public class Main {

    public static void main(String[] args) {
	Dochka dochka = new Dochka("Alena", "Gotovka");

	Chelovek chelovek = new Chelovek(5);
	Vnuchka vnuchka1 = new Vnuchka("Alexa", "Kuwat'", "BB", Colors.YELLOW, chelovek);
	Vnuchka vnuchka2 = new Vnuchka("Alla", "Gotovit'", "BB", Colors.BLACK, new Chelovek(6));

	dochka.cook("Ashlyanfu", 3);
	vnuchka1.cook("Plov", 4);
	vnuchka2.cook("Lagman");

	dochka.printStatistics();
	vnuchka1.printStatistics();
	vnuchka2.printStatistics();

    }

}
