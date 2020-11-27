package Main;

import java.util.Scanner;

public class Main {

    public static User[] users = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        double d = Double.parseDouble(s);
        s = String.format("%.2f", d);
        d = Double.parseDouble(s);
        System.out.println(d);
    }
}
