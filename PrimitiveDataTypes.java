package Lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b1 = 127;
        short s1 = 236;
        int i1 = -234;
        long l1 = 10000000000l;
        long l2 = 123456789012L; // if the value more than int then we have to add L or l
        float f1 = 12.34f;
        float f2 = 123.23F; // we have to add f or F
        float f3 = 10; // here program understands it as an int
        double d1 = 12.34d;
        double d2 = 123.23D;
        double d3 = 12.34; //we may add d or D
        char c1 = 'a';
        char c2 = 'A';
        char c3 = 97;
        char c4 = '\u0097';
        System.out.println(c3);
        System.out.println(c4);
        boolean bool1 = true;
        boolean bool2 = false;
        int a1 = 60;
        int a2 = 0b111100; // 0b ikilik say sisteminde oldugunu gosterir
        int a3 = 0B111100; // 0B hemcinin
        System.out.println(a2);;
        System.out.println(a3);;
        int a4 = 074; // 0 8 lik say sisteminde oldugunu gosterir
        int a42 = 0_74;
        int a5 = 0x3C;
        int a6 = 0X3c; // 0x veya 0X onaltiliq say sistemini gosterir
        int a7 = 1_000_000; // _ iwaresi istifadeci rahatciligi ucundur
    }
}
