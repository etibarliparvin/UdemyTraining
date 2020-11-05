package ClassAndObjects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nn = input.nextLine();
        User u = new User();
        u.a(nn);
        System.out.println(u.b());
    }
}
class User{
    private String name;
    public String surname;
    public  int age;
    public static String companyName;

    public void a(String name){
        this.name = name;
    }

    public String b(){
        if(name.isEmpty()){
            System.out.println("duz teyin edin!");
        }
        return this.name;
    }
}
