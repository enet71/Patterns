package creational.abstractFactory.factories;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.Door;
import creational.abstractFactory.Seat;
import creational.abstractFactory.Wheel;
import creational.abstractFactory.products.MercedesDoor;
import creational.abstractFactory.products.MercedesSeat;
import creational.abstractFactory.products.MercedesWheel;

public class MercedesFactory extends AbstractFactory {
    @Override
    public Door createDoor() {
        return new MercedesDoor();
    }

    @Override
    public Seat createSeat() {
        return new MercedesSeat();
    }

    @Override
    public Wheel createWheel() {
        return new MercedesWheel();
    }
}
