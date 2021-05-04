
public class SingletonClass {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        singleton1.s = singleton1.s.toLowerCase();

        System.out.println(singleton1.s);
        System.out.println(singleton2.s);
        System.out.println(singleton3.s);

        singleton3.s = singleton3.s.toUpperCase();

        System.out.println(singleton1.s);
        System.out.println(singleton2.s);
        System.out.println(singleton3.s);

    }

}

class Singleton {

    private static Singleton singleton = null;
    public String s;

    private Singleton() {
        s = "HELLO";
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }
}
