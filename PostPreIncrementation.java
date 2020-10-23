package Lesson3;

public class PostPreIncrementation {
    public static void main(String[] args) {
        int a = 6;
        int b = a++; // post incrimentation. b = 6, but a = 7;
        int c = ++a; // pre incrementation. c = 8, but a = 8;
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
    }
}
