package Dersler;

import java.util.Scanner;

public class Calculyator {
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("a-ni daxil edin: ");
        double a = input.nextDouble();
        System.out.println("b-ni daxil edin: ");
        double b = input.nextDouble();
        System.out.println("Operatoru daxil edin: + 1, - 2, * 3, / 4");
        int operation = input.nextInt();
        double result = 0;
        if (operation == 1) {
            result = topla(a, b);
        } else if (operation == 2) {
            result = cix(a, b);
        } else if (operation == 3) {
            result = vur(a, b);
        } else if (operation == 4) {
            result = bol(a, b);
        } else {
            System.out.println("Operation is not valid!");
        }
        System.out.println("Result is :" + result);
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static double cix(double a, double b) {
        return a - b;
    }

    public static double vur(double a, double b) {
        return a * b;
    }

    public static double bol(double a, double b) {
        return a / b;
    }
}

