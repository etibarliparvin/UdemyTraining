package Main;

public class Main {

    public static void main(String[] args) {
        User armud = new User();
        System.out.println(armud.name);
        change(armud);
    }
    public static void change(User alma){
        alma.name = "Noruwka";
        Main m = new Main();
        m.foo(alma.name);
    }
    public void foo(String a){
        System.out.println(a);
    }
}
