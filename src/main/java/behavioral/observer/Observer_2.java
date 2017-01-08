package behavioral.observer;


public class Observer_2 implements Observer{
    private String information = "start text";

    @Override
    public void update(String observeInformation) {
        information = observeInformation;
    }

    @Override
    public String toString() {
        return "Observer_2{" +
                "information='" + information + '\'' +
                '}';
    }
}
