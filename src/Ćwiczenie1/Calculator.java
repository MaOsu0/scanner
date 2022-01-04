package Ćwiczenie1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcMethods calcMethods = new CalcMethods();

        System.out.println("Wprowadź A");
        double a = scanner.nextDouble();
        System.out.println("Wprowadź B");
        double b = scanner.nextDouble();
        System.out.println("Wprowadź operator: +,-,*,/");
        scanner.nextLine();
        String operator = scanner.nextLine();
        scanner.close();

        calcMethods.calc(a,b,operator);


    }
}
