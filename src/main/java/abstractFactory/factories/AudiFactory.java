package abstractFactory.factories;


import abstractFactory.*;
import abstractFactory.products.AudiDoor;
import abstractFactory.products.AudiSeat;
import abstractFactory.products.AudiWheel;

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
