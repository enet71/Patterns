package abstractFactory.products;

import abstractFactory.Seat;

public class AudiSeat implements Seat {
    @Override
    public void print() {
        System.out.println("Created seat Audi");
    }
}
