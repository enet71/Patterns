package creational.abstractFactory.products;

import creational.abstractFactory.Seat;

public class AudiSeat implements Seat {
    @Override
    public void print() {
        System.out.println("Created seat Audi");
    }
}
