package Ćwiczenie1;

public class CalcMethods {

    public void calc(double a, double b, String operator) {
        switch (operator) {
            case "+":
                System.out.println("Wynik dodawania to " + (a + b));
                break;
            case "-":
                System.out.println("Wynik odejmowania to " + (a - b));
                break;
            case "*":
                System.out.println("Wynik mnożenia to " + (a * b));
                break;
            case "/":
                System.out.println("Wynik dzielenia to " + (a / b));
                break;
            default:
                System.out.println("Niepoprawny operator");
        }

    }

}




