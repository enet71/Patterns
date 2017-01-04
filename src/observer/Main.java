package observer;


public class Main {
    public static void main(String[] args) {
        Observable_1 observable = new Observable_1();

        Observer observer_1 = new Observer_1();
        Observer observer_2 = new Observer_2();

        observable.add(observer_1);
        observable.add(observer_2);

        System.out.println(observer_1);
        System.out.println(observer_2);

        observable.setObserveInformation("new text");

        System.out.println(observer_1);
        System.out.println(observer_2);
    }
}
