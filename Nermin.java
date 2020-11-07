package Main;

public class Nermin {
    public static void main(String[] args) {
        User u = new User();
        User u2 = deyish(u);
        System.out.println(u.name);
        System.out.println(u2.name);
    }
    public static User deyish(User alma){
        alma.name = "deyishdim";
        return alma;
    }
}
