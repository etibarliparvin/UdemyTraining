package Dersler;

public class MethodPractice {
    public static void main(String[] args) {
        boolean b = three.method3();
        System.out.println(b);
        if(b == true){
            one.method1();
            String s = two.method2();
            System.out.println(s);
            int a = 7;
            int k = 3;
            System.out.println(four.method4(a, k));
        }
    }
}
class one{
    public static void method1(){
        System.out.println("method1 is called");
        System.out.println("Salam");
    }
}
class two{
    public static String method2(){
        System.out.println("method2 is called");
        return "Necesen?";
    }
}
class three{
    public static boolean method3(){
        System.out.println("method3 is called");
        return true;
    }
}
class four{
    public static int method4(int a, int b){
        System.out.println("method4 is called");
        return a + b;
    }
}
