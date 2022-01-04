package Ćwiczenie2.Logic;

import java.util.Random;

public class Moneta {
    //        System.out.println("1 - orzeł");
//        System.out.println("0 - reszka");
    Random random = new Random();

    public void rzut(int chosenCoin) {
        int throwedCoin = random.nextInt(2);
        if (throwedCoin == 0 && chosenCoin == 0) {
            System.out.println("wygrałeś, wybrałeś resztę i wypadła reszka");
        } else if (throwedCoin == 0 && chosenCoin <2) {
            System.out.println("przzegrywasz,wybrałeś orła i wypadła reszka");
        } else if (chosenCoin == 0) {
            System.out.println("przegrywasz, wybrałeś reszkę i  wypadł orzeł");
        } else if (throwedCoin == 1 && chosenCoin == 1) {
            System.out.println("wygrywasz, dałeś orła i wypadł orzeł");

        } else {
            System.out.println("Niepoprawny wybór");
        }

    }

}

