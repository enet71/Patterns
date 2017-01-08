package behavioral.observer;


public class Observer_1 implements Observer{
    private String information = "start text";

    @Override
    public void update(String observeInformation) {
        information = observeInformation;
    }

    @Override
    public String toString() {
        return "Observer_1{" +
                "information='" + information + '\'' +
                '}';
    }
}
