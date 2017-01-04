package singleton;


public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton_Enum.INSTANCE);
        Singleton_Enum.INSTANCE.setText("new text");
        System.out.println(Singleton_Enum.INSTANCE);


    }
}
