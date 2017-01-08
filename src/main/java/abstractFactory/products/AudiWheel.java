package abstractFactory.products;


import abstractFactory.Wheel;

public class AudiWheel implements Wheel {
    @Override
    public void print() {
        System.out.println("Created wheel Audi");
    }
}
