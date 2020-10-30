package Ders10;

public class Arrays6 {
    public static void main(String[] args) {
        boolean bb = ters.tersi("nan");
        System.out.println(bb);
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
