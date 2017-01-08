package abstractFactory.factories;

import abstractFactory.*;
import abstractFactory.products.MercedesDoor;
import abstractFactory.products.MercedesSeat;
import abstractFactory.products.MercedesWheel;

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
