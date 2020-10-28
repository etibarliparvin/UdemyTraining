package Dersler;
import java.util.Scanner;
public class MethodPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        toplama.plus(a, b);
    }
}
class toplama{
    public static double plus(double a, double b){ // double responsibility
        System.out.println("a + b = " + (a + b));
        return a + b;
    }
}
