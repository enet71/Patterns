import behavioral.mediator.Button_1;
import behavioral.mediator.Button_2;
import behavioral.mediator.Button_3;
import behavioral.mediator.Mediator;
import behavioral.observer.Observable_1;
import behavioral.observer.Observer;
import behavioral.observer.Observer_1;
import behavioral.observer.Observer_2;
import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.factories.AudiFactory;
import creational.abstractFactory.factories.MercedesFactory;
import creational.singleton.Singleton_Enum;
import org.junit.Test;
import structural.adapter.Adapter;
import structural.adapter.AdapterComposition;
import structural.adapter.Playable;
import structural.bridge.Car;
import structural.bridge.NormalDoor;
import structural.bridge.OffRoadWheel;
import structural.bridge.PickUp;

public class MainTest {
    @Test
    public void testAdapter(){
        Playable playable = new Adapter();
        playable.play();

        Playable playable2 = new AdapterComposition();
        playable2.play();
    }

    @Test
    public void testObserver(){
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

    @Test
    public void testSingleton(){
        System.out.println(Singleton_Enum.INSTANCE);
        Singleton_Enum.INSTANCE.setText("new text");
        System.out.println(Singleton_Enum.INSTANCE);
    }

    @Test
    public void testAbstractFactory(){
        AbstractFactory factory = new AudiFactory();
        factory.createDoor().print();
        factory.createSeat().print();
        factory.createWheel().print();

        AbstractFactory factory_2 = new MercedesFactory();
        factory_2.createDoor().print();
        factory_2.createSeat().print();
        factory_2.createWheel().print();
    }

    @Test
    public void testBridge(){
        Car car = new PickUp(new NormalDoor(), new OffRoadWheel(),300,5000);
        System.out.println(car);
    }

    @Test
    public void testMediator(){
        Mediator mediator = new Mediator();

        Button_1 button_1 = new Button_1(mediator,"button 1");
        Button_2 button_2 = new Button_2(mediator,"button 2");
        Button_3 button_3 = new Button_3(mediator,"button 3");

        mediator.setButton_1(button_1);
        mediator.setButton_2(button_2);
        mediator.setButton_3(button_3);

        button_1.clickButton();
        button_2.clickButton();
        button_3.clickButton();
        button_2.clickButton();
    }
}
