package Lesson3;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner xxx = new Scanner(System.in);
        int i = xxx.nextInt();
        System.out.println(i++); // post incrementation
        System.out.println(++i); // pre incrementation
    }
}
