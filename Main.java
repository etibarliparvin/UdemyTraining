package Lesson3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String msj = ((x & 1) == 1) ? "The number is odd" : "The number is even"; // Ternary operation
        System.out.println(msj);
    }
}
