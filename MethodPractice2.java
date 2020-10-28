package Dersler;

public class MethodPractice2 {
    public static void main(String[] args) {
        String s = one1.method1("hello");
        one1.method1("salam");
        System.out.println(s);
    }
}
class one1{
    public static String method1(String s){
        System.out.println("method1 is :" + s);
        return "I have done";
    }
}
