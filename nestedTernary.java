package Lesson3;
import java.util.Scanner;
public class nestedTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c;
        c = (a > b) ? a : (a == b) ? b : 10; // nested ternary operation
        System.out.println(c);
    }
}
