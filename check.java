package Dersler;
import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        showing.show(a, b);
    }
}
class sum{
    public static double plus(double a, double b){
        return a + b;
    }
}
class showing{
    public static void show(double a, double b){
        System.out.println(sum.plus(a, b));
    }
}
