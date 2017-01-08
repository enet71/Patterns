import abstractFactory.AbstractFactory;
import abstractFactory.factories.AudiFactory;
import abstractFactory.factories.MercedesFactory;
import adapter.Adapter;
import adapter.AdapterComposition;
import adapter.Playable;
import observer.Observable_1;
import observer.Observer;
import observer.Observer_1;
import observer.Observer_2;
import org.junit.Test;
import singleton.Singleton_Enum;

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
}
