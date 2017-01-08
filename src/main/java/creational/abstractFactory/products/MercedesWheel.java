package creational.abstractFactory.products;


import creational.abstractFactory.Wheel;

public class MercedesWheel implements Wheel {
    @Override
    public void print() {
        System.out.println("Created wheel Mercedes");
    }
}
