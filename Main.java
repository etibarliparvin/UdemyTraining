package CalssesAndObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aa = input.nextInt();
        Show kk = new Show();
        kk.sh(aa);
    }
}
class Enter{
    public static int integ(int n){
        return n;
    }
}
class Show{
    public void sh(int n){
        System.out.println(Enter.integ(n));
    }
}
