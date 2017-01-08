package creational.singleton;


public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {

    }

    public static synchronized Singleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

