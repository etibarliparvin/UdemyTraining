package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double d = in.nextDouble();
		String s = String.format("%.2f", d);
		System.out.println(s);
		d = Double.parseDouble(s);
		System.out.println(d);
	}
}
