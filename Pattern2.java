package Lesson3;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){
                System.out.print("*");
                System.out.print((j != 2) ? " " : "  ");
            }
            System.out.println();
        }
    }
}
