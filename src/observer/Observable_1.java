package observer;


import java.util.ArrayList;
import java.util.List;

public class Observable_1 implements Observable {
    private List<Observer> observerList = new ArrayList<>();
    private String observeInformation;

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void inform() {
        for (Observer observer : observerList) {
            observer.update(observeInformation);
        }
    }

    public void setObserveInformation(String observeInformation){
        this.observeInformation = observeInformation;
        inform();
    }
}
