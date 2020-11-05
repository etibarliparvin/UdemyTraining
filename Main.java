package Main;

public class Main {

    public static void main(String[] args) {
        int alma = 0;
        System.out.println(alma);
        topla(alma);
        System.out.println(topla(alma));

    }

    public void foo(){

    }

    public static int topla(int a){
        a += 5;
        return a;
    }
}
