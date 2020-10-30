package Ders10;

import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        gonder.goster();
    }
}
class ters{
    public static boolean tersi(String s){
        for(int i = 0; i < s.length(); i++){
            char sol = s.charAt(i);
            char sag = s.charAt(s.length() - 1 - i);
            System.out.println("---------------------------");
            System.out.println("sol = " + sol);
            System.out.println("sag = " + sag);
            if(sol != sag){
                return false;
            }
        }
        System.out.println("Finished.");
        return true;
    }
}
class gonder{
    public static void goster(){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boolean bb = ters.tersi(s);
        System.out.println(bb);
    }
}
