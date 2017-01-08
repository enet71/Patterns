package creational.abstractFactory.factories;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.Door;
import creational.abstractFactory.Seat;
import creational.abstractFactory.Wheel;
import creational.abstractFactory.products.AudiDoor;
import creational.abstractFactory.products.AudiSeat;
import creational.abstractFactory.products.AudiWheel;

public class AudiFactory extends AbstractFactory {
    @Override
    public Door createDoor() {
        return new AudiDoor();
    }

    @Override
    public Seat createSeat() {
        return new AudiSeat();
    }

    @Override
    public Wheel createWheel() {
        return new AudiWheel();
    }
}
