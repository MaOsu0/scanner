package Ćwiczenie2.App;

import Ćwiczenie2.Logic.Moneta;

import java.util.Scanner;

public class Rzut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moneta moneta = new Moneta();

        System.out.println("Wybierz jedną z dwóch opcji");
        System.out.println("1 - orzeł");
        System.out.println("0 - reszka");

        int a = scanner.nextInt();
        moneta.rzut(a);
    }
}
