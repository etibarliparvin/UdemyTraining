package ClassAndObjects;

public class Main {

    public static void main(String[] args) {
        Parvin.Narmin();
	    User.umumi = "Salam";
	    User.foo();
        System.out.println(User.umumi);
        User.age = 18;
        System.out.println(User.age);
        User u = new User();
        User u2 = new User();
        u.foo2();
        u.name = "Parvin";
        System.out.println(u.name);
        u2.name = "Nermin";
        System.out.println(u2.name);
        u2.foo2();
        Test.change();
        Parvin.Narmin();
        System.out.println(User.umumi);
    }
}
