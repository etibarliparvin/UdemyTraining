package Lesson3;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
