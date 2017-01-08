package creational.abstractFactory.products;


import creational.abstractFactory.Seat;

public class MercedesSeat implements Seat {
    @Override
    public void print() {
        System.out.println("Created seat Mercedes");
    }
}
